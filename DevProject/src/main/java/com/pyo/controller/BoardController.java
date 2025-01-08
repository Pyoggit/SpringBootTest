package com.pyo.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyo.domain.Board;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/board")
public class BoardController {
	
	@PutMapping(value = "/{boardno}")
	public ResponseEntity<String> modify(@PathVariable("boardno") int boardno, @RequestBody Board board) {
		log.info("boardno = " + boardno);
		log.info("board = " + board.toString());
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		return entity;
	}
	@PostMapping(value = "/{boardno}")
	public ResponseEntity<String> modifyPost(@PathVariable("boardno") int boardno, @RequestBody Board board) {
		log.info("boardno = " + boardno);
		log.info("board = " + board.toString());
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		return entity;
	}
	@GetMapping(value = "/{boardno}",produces = "application/json")
	public ResponseEntity<Board> boardGetOne(@PathVariable("boardno") int boardno) {
		log.info("boardno = " + boardno);
		Board board = new Board();
		
		board.setTitle("제목"); 
		board.setContent("내용입니다."); 
		board.setWriter("홍길동"); 
		board.setRegDate(new Date());
		
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK); 
		return entity;
		
	}
}