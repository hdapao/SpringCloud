package cn.com.hdapao.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: hsh
 * @Date: 2020/12/22 3:45 下午
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private String address;
}
