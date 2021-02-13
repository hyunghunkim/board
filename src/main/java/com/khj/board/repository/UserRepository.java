package com.khj.board.repository;

import com.khj.board.domain.JPA_Board;
import com.khj.board.domain.JPA_User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<JPA_User,Long> {

    List<JPA_User> findById(String id);

    List<JPA_User> findByEmail(String email);

    JPA_User findByEmailAndPassword(String email, String password);
}
