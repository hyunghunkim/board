package com.khj.board.repository;

import com.khj.board.domain.JPA_User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<JPA_User,Long> {

    List<JPA_User> findById(String id);

    List<JPA_User> findByUserName(String userName);

    JPA_User findByEmailAndPassword(String email,String password);
}
