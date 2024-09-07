package com.yupi.usercenter.service;
import java.util.Date;

import com.yupi.usercenter.model.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 用户服务测试
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("xunMao");
        user.setUserAccount("123");
        user.setAvatarUrl("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("1234");
        user.setEmail("456");


        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);
    }

    @Test
    void userRegister() {
        //定义几个参数
        String userAccount = "xunmao2";
        String userPassword = "12345678";
        String checkPassword = "12345678";
        String planetCode = "12345";

        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1,result);
    }
}