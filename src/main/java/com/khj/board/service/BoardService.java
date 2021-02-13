package com.khj.board.service;

import com.khj.board.domain.JPA_Board;
import com.khj.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<JPA_Board> selectJPA_BoardList(){
        return boardRepository.findAll();
    }

    public void boardInsert(JPA_Board board){
        boardRepository.save(board);
    }

    public Optional<JPA_Board> findById(Long id){
        return boardRepository.findById(id);
    }
}
