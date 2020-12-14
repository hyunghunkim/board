package com.khj.board.Controller;

import com.khj.board.domain.JPA_User;
import com.khj.board.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@AllArgsConstructor
public class homeController {

    private final UserService userService;

    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("signUp")
    public String signUp(){
        return "user/signUp";
    }
    @PostMapping("login")
    public String login(JPA_User user, HttpServletRequest request){
        HttpSession session = request.getSession();

        user = userService.findByEmailAndPassword(user);
        session.setAttribute("user",user);

        return "redirect:/board/boardList";
    }

}
