package com.pyo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyo.dao.BoardDAO;
import com.pyo.domain.Board;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	@Override
	public void register(Board board) throws Exception {
		dao.create(board);
	}

	@Override
	public List<Board> lsit() throws Exception {
		
		return dao.list();
	}

	@Override
	public Board read(Board board) throws Exception {
		
		return dao.read(board);
	}

	@Override
	public boolean remove(Board board) throws Exception {
		
		return dao.remove(board);
	}

	@Override
	public int modify(Board board) throws Exception {
		
		return dao.modify(board);
						
	}

}