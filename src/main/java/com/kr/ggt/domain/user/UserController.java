package com.kr.ggt.domain.user;

import com.kr.ggt.common.dto.MessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    //사용자 저장페이지
    @RequestMapping(value="/ggtUserAddView.do", method= RequestMethod.GET)
    public String ggtAddUserView( @RequestParam(value = "ggtUserId", required = false) final String ggtUserId, Model model) {

        if (ggtUserId != null) {
            UserResponse user = userService.ggtFindById(ggtUserId);
            model.addAttribute("user", user);
        }
        return "user/write";
    }

    //사용자 저장
    @PostMapping("/ggtUserAdd.do")
    public String saveGgtUser(final UserRequest params, Model model){
        userService.ggtSaveUser(params);

        MessageDto message = new MessageDto("사용자 저장 완료되었습니다.", "/ggtUserList.do", RequestMethod.GET, null);
        return showMessageAndRedirect(message, model);
    }
    
    //사용자 수정
    @PostMapping("/ggtUserUpdate.do")
    public String ggtUpdateUser(final UserRequest params, Model model){
        userService.ggtUdateUser(params);

        MessageDto message = new MessageDto("사용자 수정이 완료되었습니다.", "/ggtUserList.do", RequestMethod.GET, null);
        return showMessageAndRedirect(message, model);

    }

    //사용자 리스트
    @GetMapping("/ggtUserList.do")
    public String ggtUserList(Model model){

        List<UserResponse> result = userService.ggtFindAll();

        model.addAttribute("list", result);
        return "user/list";
    }

    //사용자 상세보기
    @GetMapping("/ggtUserView.do")
    public String ggtUserView(@RequestParam String ggtUserId, Model model){

        try {
            UserResponse result = userService.ggtFindById(ggtUserId);
            model.addAttribute("user", result);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "user/view";
    }

     //사용자 삭제
    @PostMapping("/ggtUserdelete.do")
    public String deletePost(@RequestParam final String ggtUserId, Model model) {
        userService.ggtDeleteUser(ggtUserId);

        MessageDto message = new MessageDto("사용자가 삭제되었습니다", "/ggtUserList.do", RequestMethod.GET, null);
        return showMessageAndRedirect(message, model);
    }

    // 사용자에게 메시지를 전달하고, 페이지를 리다이렉트 한다.
    private String showMessageAndRedirect(final MessageDto params, Model model) {
        model.addAttribute("params", params);
        return "common/messageRedirect";
    }



}
