package com.kr.ggt.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    //사용자 저장페이지
    //@GetMapping("/ggtAddUserView.do")
    @RequestMapping(value="/ggtAddUserView.do", method= RequestMethod.GET)
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
