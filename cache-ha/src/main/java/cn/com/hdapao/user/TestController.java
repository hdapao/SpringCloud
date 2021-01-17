package cn.com.hdapao.user;

import cn.com.hdapao.api.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hsh
 * @Date: 2020/12/22 3:45 下午
 * @Description:
 */
@RestController
@Slf4j
@RequestMapping("/test/")
public class TestController {

    @GetMapping("findById")
    public User findById(Long id) {
        log.info("我进来了");
        User user = User.builder().id(1L).name("小明").address("浦东新区").build();
        return user;
    }
}