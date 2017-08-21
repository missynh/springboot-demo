package cn.ynh.myproject.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * test 实体类
 * Created by ynh on 2017/8/21.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper=true)
public class User implements Serializable{

    /**
     * 主键
     */
    private Long id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(timezone = "GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}
