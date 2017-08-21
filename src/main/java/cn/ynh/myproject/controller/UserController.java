package cn.ynh.myproject.controller;

import cn.ynh.myproject.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试 controller
 * Created by ynh on 2017/8/21.
 */
@RestController
@RequestMapping("/test")
public class UserController {

    /**
     * 测试service
     */
    @Resource
    private UserService userService;

    /**
     * 获取所有用户信息
     *
     * @return 用户信息列表
     */
    @ResponseBody
    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public Object findAll() {

        return userService.findAll();
    }
}
