package com.heima.pojo;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    // 用户名
    private String userName;

    // 密码
    private String password;

    // 姓名
    private String phone;

    private Date created;
}
