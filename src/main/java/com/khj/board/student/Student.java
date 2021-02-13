package com.khj.board.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Student {
    String name;
    int korean;
    int english;
    int math;
    int sum;
    int average;
}
