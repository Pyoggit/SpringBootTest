package com.pyo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyo.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
