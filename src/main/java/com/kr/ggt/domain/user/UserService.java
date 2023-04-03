package com.kr.ggt.domain.user;

import com.kr.ggt.common.dto.SearchDto;
import com.kr.ggt.paging.Pagination;
import com.kr.ggt.paging.PagingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    /*유저저장*/
    @Transactional
    public void ggtSaveUser(final UserRequest param){
        userMapper.saveUser(param);
        //return param.getGgtUserId();
    }

    /*유저수정*/
    @Transactional
    public void ggtUdateUser(final UserRequest param){
        userMapper.updateUser(param);
    }

    /*유저삭제*/
    public void ggtDeleteUser(final String ggtUserId){
        userMapper.deleteUser(ggtUserId);
    }

    /*idx로 유저찾기*/
    @Transactional
    public UserResponse ggtFindByIdx(int idx){
        return userMapper.findByIdx(idx);
    }

    /*id로 유저찾기*/
    @Transactional
    public UserResponse ggtFindById(String id){
        return userMapper.findById(id);
    }

    /*핸드폰번호로 유저찾기*/
    @Transactional
    public UserResponse ggtFindByPnum(String pNum){
        return userMapper.findByPnum(pNum);
    }

    /*전체출력*/
    public PagingResponse<UserResponse> ggtFindAll(final SearchDto params){

        int count = userMapper.count(params);
        if (count < 1) {
            return new PagingResponse<>(Collections.emptyList(), null);
        }

        Pagination pagination = new Pagination(count, params);
        params.setPagination(pagination);

        List<UserResponse> list = userMapper.findAll(params);
        return new PagingResponse<>(list, pagination);
        //return userMapper.findAll(params);
    }

    /*유저 카운트 출력*/
    public int ggtCount(final SearchDto params){
        return userMapper.count(params);
    }







}
