package com.khj.board.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class JPA_Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "boardId")
    private Long id;

    @Column(length = 50, nullable = false)
    private String title;

    @Lob
    private String content;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(length = 50, nullable = false)
    private String name;
}
