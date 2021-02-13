package com.khj.board.student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Science extends Student {
    int science;

    public Science(String name, int korean, int english, int math, int sum, int average) {
        super(name, korean, english, math, sum, average);
    }
}
