package cn.ynh.myproject.service;

import cn.ynh.myproject.entity.User;
import cn.ynh.myproject.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试 service
 * Created by ynh on 2017/8/21.
 */
@Service
@Slf4j
public class UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 获取所有用户信息
     *
     * @return 用户信息列表
     */
    public List<User> findAll() {

        log.info("=======测试一下日志信息啦========");
        return userMapper.findAll();
    }
}
