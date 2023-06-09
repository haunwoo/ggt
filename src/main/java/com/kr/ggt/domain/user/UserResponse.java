package com.kr.ggt.domain.user;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponse {

    private int ggtUserIdx;                 //인덱스
    private String ggtUserId;               //아이디
    private String ggtUserPnum;             //핸드폰번호
    private String ggtUserName;             //이름
    private LocalDateTime ggtUserRegDate;   // 생성일시
    private int ggtUserLevel;               //1:관리자, 2일반회원
    private String ggtUserPosition;         //포지션
    private String ggtUserJob;              //직업

}
