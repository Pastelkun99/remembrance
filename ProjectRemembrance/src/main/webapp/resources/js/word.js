var userId = "id 입력 필요";
var cardNo;
var data;
var rand;
var chck1 = 0;
$(() => { // 데이터 베이스 가져오기
	// $.get('http://1.234.5.158:3003/get', function(retdata){ // get 방식
	// 	data = retdata;
	// 	console.log(data);
	// 	btnnext();
	// },'json');
	console.log("start");
	$.post( "http://1.234.5.158:3003/ajax/post", {  // post 방식
		sql: "SELECT * FROM QUIZCARD" 
		})
	.done(function(retdata) {
		data = retdata.rows;
		console.log(data);
		btnnext();
	});
	console.log("ok");
});

function btnchck() {
	chck();
}
function btn1() { // O
	chck1 = 2;
	chck();
	next();
	send1();
}
function btn2() { // ?
	chck1 = 1;
	chck();
	next();
}
function btn3() { // X
	chck1 = -1;
	chck();
	next();
}
function btnnext() {
	next();
}

function btntest() { // 테스트용 버튼
	test1();
}

function chck() {
	if(chck1 !== 0){
		data.splice(0,1); // 카드 제거
		chck1 = 0;
	}
}
function next() {
	var len = data.length;
	if(len === 0){
		location.replace("${pageContext.request.contextPath}/1"); // 카드가 없으면 특정 페이지로 이동
		return;
	}
	//rand = Math.floor(Math.random() * len); // 랜덤
	//cardNo = data[rand][1];
	$('#front').text(data[0][2]); // 다음 카드
	$('#back').text(data[0][3]); // 답 보기
	chck1 = 1;
}
function send1() {
	$.post( "http://1.234.5.158:3003/ajax/post", { userId:userId, cardNo:cardNo, val:chck1 });
}

function test1(){
	var tmp;
	console.log("테스트용 버튼");
	$.post( "http://1.234.5.158:3003/ajax/post", { 
		sql: "SELECT * FROM QUIZCARD"
		})
	.done(function( retdata ) {
		console.log(retdata);
		tmp = retdata.rows.length + 1;
		console.log(tmp);
		var i = 0;
		var fn1 = setInterval(() => {
			$.post( "http://1.234.5.158:3003/ajax/post", { 
				sql: "INSERT INTO QUIZCARD VALUES("+(tmp+i)+", 'id"+(tmp+i)+"', 'front"+(tmp+i)+"', 'back"+(tmp+i)+"', 0)"
				})
			.done(function( retdata ) {
				console.log(retdata);
			});
			console.log(i);
			i++;
			if(i === 6){
				clearInterval(fn1);
				console.log("ci");
			}
		}, 1000);
	});
}