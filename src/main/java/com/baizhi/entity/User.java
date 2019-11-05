package com.baizhi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Excel(name = "编号")
    private String id;
    @Excel(name = "用户名")
    private String username;
    @Excel(name = "密码")
    private String password;
    private String salt;
    private String nickname;
    private String phone;
    private String province;
    private String city;
    private String sign;
    private String photo;
    private String sex;
    @JSONField(format = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    private String starId;





}
