package com.khj.board.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @GetMapping("/api/hello")
    public String Hello(){
        return "hello";
    }
}
