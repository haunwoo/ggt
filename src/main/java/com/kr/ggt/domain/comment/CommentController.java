package com.kr.ggt.domain.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class CommentController {

    //댓글저장
    @PostMapping("/com/commentSave.do")
    public String commentSave(@RequestParam final String content){

        //로그인 아이디 체크




        return "sub/vote";
    }


}
