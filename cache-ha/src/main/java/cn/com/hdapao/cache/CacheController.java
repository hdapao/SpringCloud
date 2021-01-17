package cn.com.hdapao.cache;

import cn.com.hdapao.api.model.Goods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: hsh
 * @Date: 2020/12/22 3:45 下午
 * @Description:
 */
@RestController
@Slf4j
@RequestMapping("/cache/")
public class CacheController {

    @GetMapping("change")
    public String change(Long productId) {
        RestTemplate restTemplate = new RestTemplate();
        Goods goods = restTemplate.getForObject("http://127.0.0.1:18130/product/getProductInfo?productId={1}"
                , Goods.class,productId);
        System.out.println(goods);
        return "success";
    }
}