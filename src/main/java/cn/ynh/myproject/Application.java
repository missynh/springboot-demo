package cn.ynh.myproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * 程序启动main方法
 *
 * Created by ynh on 2017/8/21.
 */
@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "cn.ynh.myproject.mapper")
public class Application extends SpringBootServletInitializer {

    private static Class<Application> applicationClass = Application.class;

    /**
     * build spring boot
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        return builder.sources(applicationClass);
    }

    /**
     * spring boot 启动主方法
     */
    public static void main(String[] args){

        SpringApplication.run(applicationClass, args);
    }
}
