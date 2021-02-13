package com.khj.board.student;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Literature extends Student {
    int social;

    public Literature(String name, int korean, int english, int math, int sum, int average) {
        super(name, korean, english, math, sum, average);
    }

    public void student(){
        System.out.println("학생 전체 출력");
    }
}
