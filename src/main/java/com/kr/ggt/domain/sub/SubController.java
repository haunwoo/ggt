package com.kr.ggt.domain.sub;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        
        //로그인 체크 및 투표 여부 확인해야함
        
        return "sub/vote";
    }


}
