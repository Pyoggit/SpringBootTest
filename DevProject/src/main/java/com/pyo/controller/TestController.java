package com.pyo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pyo.domain.Board;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String home(String name) {

		return "home " + name;
	}

	@RequestMapping(value = "/getBoard", method = RequestMethod.GET)
	public @ResponseBody Board getBoard() {
		Board board = new Board();
		board.setBoardNo(0);
		board.setTitle("Hello");
		board.setContent("zeus");
		board.setWriter("kdj");
		board.setRegDate(new Date());

		return board;
	}

	@RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
	public @ResponseBody List<Board> getBoardList() {
		List<Board> boardList = new ArrayList<Board>();
		for (int i = 1; i <= 10; i++) {
			Board board = new Board();
			board.setBoardNo(i);
			board.setTitle("Hello");
			board.setContent("zeus");
			board.setWriter("kdj");		
			board.setRegDate(new Date());
			boardList.add(board);
		}
		return boardList;
	}

}