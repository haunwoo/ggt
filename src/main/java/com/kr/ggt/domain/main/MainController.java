package com.kr.ggt.domain.main;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    //메인페이지
    @GetMapping("/")
    public String mainIndex(Model model) {

        return "main/index";
    }

    //테스트
    @GetMapping("/test")
    public String test(Model model) {

        return "main/test";
    }

/*    //파일업로드
    @PostMapping(/main/upload)
    public Str*/

}
