package com.kr.ggt.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserRequest {

    private String ggtUserId;               //아이디
    private String ggtUserPnum;             //핸드폰번호
    private String ggtUserName;             //이름
    private LocalDateTime ggtUserRegDate;   // 생성일시
    private int ggtUserLevel;               //1:관리자, 2일반회원
    private String ggtUserPosition;         //포지션
    private String ggtUserJob;              //직업

}
