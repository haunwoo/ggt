package com.kr.ggt.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    //사용자 저장페이지
    @GetMapping("/ggtAddUserView.do")
    public String openUserAdd( @RequestParam(value = "ggtUserId", required = false) final String id, Model model) {

        if (id != null) {
            UserResponse user = userService.ggtFindById(id);
            model.addAttribute("user", user);
        }
        return "user/write";
    }

    //사용자 저장
    @PostMapping("/ggtAddUser.do")
    public String saveGgtUser(final UserRequest params){
        userService.ggtSaveUser(params);
        return "redirect:ggtUserList.do";
    }

}
