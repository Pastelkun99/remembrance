var userId = "id 입력 필요";
var cardNo;
var data;
var rand;
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
		console.log("post");
		data = retdata.rows;
		console.log(data);
		next();
	});
});

function btn_o() { // O 버튼
	console.log("o 버튼");
	chck();
	next();
}
function btn_x() { // X 버튼
	console.log("x 버튼");
	send1();
	chck();
	next();
}

function btn_test() { // 테스트용 버튼
	test1();
}

function chck() {
	data.splice(0,1); // 카드 제거
	console.log(data);
	$('#collapseExample').attr('class','collapse');
}
function next() {
	var len = data.length;
	if(len === 0){
		setTimeout(() => {
			 location.replace("main.do?menu=1"); // 카드가 없으면 특정 페이지로 이동
		}, 1000);
		return;
	}
	//rand = Math.floor(Math.random() * len); // 랜덤
	//cardNo = data[rand][1];
	$('#front').text(data[0][2]); // 다음 카드
	$('#back').text(data[0][3]); // 답 보기
}
function send1() {
	$.post( "http://1.234.5.158:3003/ajax/post", {  // post 방식
		sql: "UPDATE QUIZCARD SET Q_HIT = " + (data[0][4] + 1) + " WHERE Q_NO = " + data[0][0] // hit 증가
		})
	.done(function(retdata) {
		console.log(retdata);
		console.log("send");
	});
	//UPDATE 테이블명 SET 수정되어야 할 컬럼명 = 수정되기를 원하는 새로운 값
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