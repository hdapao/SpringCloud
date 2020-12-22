package cn.com.hdapao.user;

import cn.com.hdapao.api.model.User;
import cn.com.hdapao.api.service.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author: hsh
 * @Date: 2020/12/22 3:45 下午
 * @Description:
 */
@RestController
@Slf4j
public class TestController implements UserFeignClient {

    @Override
    public User findById(Long id) {
        log.info("我进来了");
        User user = User.builder().id(1L).name("小明").address("浦东新区").build();
        return user;
    }
}