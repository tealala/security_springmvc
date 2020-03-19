package com.tealala.security.springmvc.service.impl;

import com.tealala.security.springmvc.dto.AuthenticationRequest;
import com.tealala.security.springmvc.dto.UserDto;
import com.tealala.security.springmvc.service.AuthenticationService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/19
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService{

    private List<UserDto> userList;

    @Override
    public UserDto authentication(AuthenticationRequest request) throws Exception{
        UserDto userDto = checkUser(request.getUsername());
        if(userDto == null){
            throw new Exception("用户信息不存在");
        }
        if(!userDto.getPassword().equals(request.getPassword())){
            throw new Exception("密码不正确");
        }


        return userDto;
    }


    public AuthenticationServiceImpl(){
        Set<String> authorities = new HashSet<String>();
        authorities.add("/spring-secrity/user");
        Set<String> authorities2 = new HashSet<String>();
        authorities2.add("/spring-secrity/content");

        List<UserDto> users = new ArrayList<>();
        UserDto userDto1 = new UserDto(1L,"admin","admin",authorities);
        UserDto userDto2 = new UserDto(2L,"test","test", authorities2);
        users.add(userDto1);
        users.add(userDto2);
        this.userList = users;
    }

    public UserDto checkUser(String username){
        for (UserDto userDto : userList) {
            if(userDto.getUsername().equals(username)){
                return userDto;
            }
        }
        return null;
    }
}
