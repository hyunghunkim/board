package com.khj.board.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class JPA_User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private long id;

    @Column(length = 50, nullable = false)
    private String email;

    @Column( length = 50, nullable = false)
    private String name;

    @Column( length = 50, nullable = false)
    private String password;
}
