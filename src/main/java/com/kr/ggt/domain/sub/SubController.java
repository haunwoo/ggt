package com.kr.ggt.domain.sub;

import com.kr.ggt.domain.comment.CommentRequest;
import com.kr.ggt.domain.user.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class SubController {

    //장부페이지이동
    @GetMapping("/sub/accountBook.do")
    public String accountBook(Model model){
        return "sub/acountBook";
    }

    //투표페이지이동
    @GetMapping("/sub/vote.do")
    public String vote(Model model){

        return "sub/vote";
    }


}
