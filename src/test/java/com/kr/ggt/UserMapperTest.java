package com.kr.ggt;

import com.kr.ggt.domain.user.UserMapper;
import com.kr.ggt.domain.user.UserRequest;
import com.kr.ggt.domain.user.UserResponse;
import com.kr.ggt.domain.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class UserMapperTest {


    @Autowired
    UserMapper userMapper;


    @Autowired
    UserService userService;

    @Test
    void saveUser(){
/*        List<UserResponse> post = userMapper.findAll();

        UserRequest ur = new UserRequest();
        ur.setGgtUserId("haunwoo1");
        ur.setGgtUserName("장현우1");
        ur.setGgtUserJob("프로그래머");
        ur.setGgtUserPnum("010-6251-4223");
        ur.setGgtUserLevel(1);
        ur.setGgtUserPosition("수비수");
        userMapper.saveUser(ur);*/
    }

    @Test
    void userUpdate(){

        UserRequest ur = new UserRequest();
        ur.setGgtUserId("haunwoo");
        ur.setGgtUserName("장현우1123123");
        ur.setGgtUserJob("프로그래머222");
        ur.setGgtUserPnum("010-6251-4333");
        ur.setGgtUserLevel(2);
        ur.setGgtUserPosition("수비수겸공격수");
        userMapper.updateUser(ur);
    }

    @Test
    void saveServiceUser(){

        UserRequest ur = new UserRequest();
        ur.setGgtUserId("haunwoo1");
        ur.setGgtUserName("장현우1");
        ur.setGgtUserJob("프로그래머");
        ur.setGgtUserPnum("010-6251-4223");
        ur.setGgtUserLevel(1);
        ur.setGgtUserPosition("수비수");
        ur.setGgtUserRegDate(LocalDateTime.now());
        try {
            userService.ggtSaveUser(ur);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
