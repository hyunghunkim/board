package com.khj.board.Controller;

import com.khj.board.domain.JPA_Board;
import com.khj.board.domain.JPA_User;
import com.khj.board.service.BoardService;
import com.khj.board.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @PostMapping("add")
    public String save(JPA_User user){
        userService.save(user);
        return "/main";
    }

}
