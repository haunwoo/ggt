package com.kr.ggt.domain.user;

import com.kr.ggt.common.dto.SearchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //저장
    void saveUser(UserRequest param);

    //수정
    void updateUser(UserRequest param);

    //삭제
    void deleteUser(String ggtUserId);

    //idx로 찾기
    UserResponse findByIdx(int idx);

    //id로 찾기
    UserResponse findById(String id);

    //핸드폰번호로 찾기
    UserResponse findByPnum(String pNum);

    //전체출력
    List<UserResponse> findAll(SearchDto params);

    //전체출력
    int count(SearchDto params);
}
