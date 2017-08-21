package cn.ynh.myproject.mapper;

import cn.ynh.myproject.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    /**
     * 获取所有用户信息
     *
     * @return 用户信息列表
     */
    List<User> findAll();
}
