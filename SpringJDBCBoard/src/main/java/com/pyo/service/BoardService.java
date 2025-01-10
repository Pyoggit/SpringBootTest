package com.pyo.service;

import java.util.List;

import com.pyo.domain.Board;

public interface BoardService {
	
	public void register(Board board) throws Exception;
	
	public List<Board> lsit() throws Exception;

	public Board read(Board board) throws Exception;

	public boolean remove(Board board) throws Exception;

	public int modify(Board board) throws Exception;
	
	
}
