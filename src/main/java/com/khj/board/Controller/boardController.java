package com.khj.board.Controller;

import com.khj.board.domain.JPA_Board;
import com.khj.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("board")
@AllArgsConstructor
public class boardController {

    private final BoardService boardService;

    @RequestMapping("insert")
    public String boardInsert(JPA_Board board){
        boardService.boardInsert(board);
        return "redirect:/board/boardList";
    }
    @RequestMapping(value = "boardList",method = RequestMethod.GET)
    public ModelAndView boardList(){
        ModelAndView mv = new ModelAndView("board/boardList");
        List<JPA_Board> list = boardService.selectJPA_BoardList();
        System.out.println(list);
        mv.addObject("list",list);
        return mv;
    }
    @RequestMapping(value = "boardVue",method = RequestMethod.GET)
    public ModelAndView boardVue(){
        ModelAndView mv = new ModelAndView("board/boardVue");
        List<JPA_Board> list = boardService.selectJPA_BoardList();
        System.out.println(list);
        mv.addObject("list",list);
        return mv;
    }
    @GetMapping("boardWrite")
    public String boardWritePage(){
        return "board/boardWrite";
    }
}
