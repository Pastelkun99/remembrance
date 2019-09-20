package com.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.service.QnABoardService;

@Controller
@RequestMapping("/qb")
public class QnABoardController {

	@Autowired
	private QnABoardService qDAO;

	@RequestMapping(value = "/qboard.do", method = RequestMethod.GET)
	public String boardlist(Model model, HttpSession httpSession) {
		httpSession.setAttribute("BRD_HIT_CHECK", 1);
		List<Map<String, Object>> list = qDAO.selectBoardList();
		model.addAttribute("list", list);
		return "/QnA/qboard";
	}

	@RequestMapping(value = "/qboardc.do", method = RequestMethod.GET)
	public String boardconent(@RequestParam("no") int no, Model model, HttpSession httpSession) {
		int chk = (Integer) httpSession.getAttribute("BRD_HIT_CHECK");
		if (chk == 1) {
			qDAO.updateBoardHit(no);
			httpSession.setAttribute("BRD_HIT_CHECK", 0);
		}

		Map<String, Object> map = qDAO.selectBoardOne(no);
		model.addAttribute("map", map);

		int prev = qDAO.selectBoardPrev(no);
		System.out.println("??");
		int next = qDAO.selectBoardNext(no);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		System.out.println("이전 : " + prev + " 다음 : " + next);
		return "/QnA/qboardc";
	}

	@RequestMapping(value = "/qboardw.do", method = RequestMethod.GET)
	public String boardwrite(HttpServletRequest request) {
		return "/QnA/qboardw";
	}

	@RequestMapping(value = "/qboardw.do", method = RequestMethod.POST)
	public String boardwrite(HttpServletRequest request, @RequestParam("title") String title,
			@RequestParam("content") String content, @RequestParam("writer") String writer) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("TI", title);
		map.put("CO", content);
		map.put("WR", writer);

		qDAO.insertBoardOne(map);
		return "redirect:/main.do?menu=3";
	}

	@RequestMapping(value = "/qboarde.do", method = RequestMethod.GET)
	public String boardedit(@RequestParam("no") int no, Model model, HttpServletRequest request) {
		Map<String, Object> map = qDAO.selectBoardOne(no);
		model.addAttribute("map", map);
		return "/QnA/qboarde";
	}

	@RequestMapping(value = "/qboarde.do", method = RequestMethod.POST)
	public String boardedit(@RequestParam HashMap<String, Object> map) {
		qDAO.updateBoardOne(map);
		return "redirect:/qboardc.do?no=" + map.get("no");
	}
	
	@RequestMapping(value = "/qboardd.do", method = RequestMethod.GET)
	public String boardDelete(@RequestParam("no") int boardno, Model model, HttpServletRequest request) {
		System.out.println("입장");
		qDAO.deleteBoardOne(boardno);
		model.addAttribute("msg", "게시글이 삭제되었습니다.");
		model.addAttribute("href", request.getContextPath() + "/main.do?menu=3");
		return "alert";
	}

}