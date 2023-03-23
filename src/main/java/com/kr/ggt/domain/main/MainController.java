package com.kr.ggt.domain.main;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class MainController {

    //메인페이지
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String openUserAdd(Model model) {

        return "main/index";
    }

}