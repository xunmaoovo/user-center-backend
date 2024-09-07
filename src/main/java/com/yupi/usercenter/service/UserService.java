package com.yupi.usercenter.service;

import com.yupi.usercenter.model.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author 熏猫king
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2024-05-28 23:32:15
 */
public interface UserService extends IService<User> {





    /**
     * 用户注释
     *
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @param checkPassword 校验码
     * @param planetCode    星球编号
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     *
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @return 返回脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
