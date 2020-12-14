package com.khj.board.repository;

import com.khj.board.domain.JPA_Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<JPA_Board,Long> {

}
