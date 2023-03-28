package com.kr.ggt.domain.sub;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SubController {

    @GetMapping("/sub/accountBook.do")
    public String accountBook(Model model){




        return "sub/acountBook";
    }


}
