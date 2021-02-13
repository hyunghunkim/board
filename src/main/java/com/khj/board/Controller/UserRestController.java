package com.khj.board.Controller;

import com.khj.board.domain.JPA_Board;
import com.khj.board.domain.JPA_User;
import com.khj.board.service.BoardService;
import com.khj.board.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class UserRestController {

    private final UserService userService;
    private final BoardService boardService;

    @GetMapping("get-user-info")
    public String getUserInfo(@RequestParam String email, String password){
        System.out.println("username : " + email+", password : " + password);
        return "Auth";
    }
    @PostMapping("login")
    public JPA_User login(@RequestBody JPA_User user, HttpServletRequest request){
        HttpSession session = request.getSession();

        user = userService.findByEmailAndPassword(user);
        session.setAttribute("user",user);

        return user;
    }
    @GetMapping("boardList")
    public List<JPA_Board> boardList(){
        List<JPA_Board> list = boardService.selectJPA_BoardList();
        System.out.println(list);
        return list;
    }

    @GetMapping("boardDetail")
    public Optional<JPA_Board> boardDetail(@RequestParam Long id){
        return boardService.findById(id);
    }

}
