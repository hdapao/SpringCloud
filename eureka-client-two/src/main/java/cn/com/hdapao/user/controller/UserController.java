package cn.com.hdapao.user.controller;

import cn.com.hdapao.api.model.User;
import cn.com.hdapao.api.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hsh
 * @Date: 2020/12/22 4:40 下午
 * @Description:
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    public User findById(@RequestParam String userId){
        User user = userFeignClient.findById(Long.valueOf(userId));
        return user;
    }
}
