package com.khj.board.service;

import com.khj.board.domain.JPA_User;
import com.khj.board.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<JPA_User> findAll(){
        List<JPA_User> users = new ArrayList<>();
        userRepository.findAll().forEach(e ->users.add(e));
        return users;
    }

    public JPA_User save(JPA_User user){
        userRepository.save(user);
        return user;
    }

    public JPA_User findByEmailAndPassword(JPA_User user){
        user = userRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
        return user;
    }



}
