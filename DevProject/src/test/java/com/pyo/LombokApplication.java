package com.pyo;

import java.util.Date;

import com.pyo.domain.Board;
import com.pyo.service.BoardService;

public class LombokApplication {
	public static void main(String[] args) {
		
		BoardService bs = new BoardService();
		
		Board board = Board.builder().boardNo(1).title("빌더테스트").content("테스트").regDate(new Date()).build();
		bs.create(board);
		bs.readByBoardNo(1);
		bs.delete(board);
	}

}
