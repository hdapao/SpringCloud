package cn.com.hdapao.api.service;
 
import cn.com.hdapao.api.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: hsh
 * @Date: 2020/12/22 3:45 下午
 * @Description:
 */
@FeignClient(name = "eureka-client-one")
public interface UserFeignClient {

    /**
     * 根据用户id查询数据信息
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable("id") Long id);

}