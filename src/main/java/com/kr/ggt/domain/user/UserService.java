package com.kr.ggt.domain.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public List<UserResponse> ggtFindAll(){
        return userMapper.findAll();
    }







}
