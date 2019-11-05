package com.baizhi.poi;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ExcelTarget(value = "Student")
public class Student {
    @Excel(name = "学号")
    private String id;
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "性别")
    private String sex;
    @Excel(name = "生日",format = "yyyy-MM-dd")
    private Date bir;

}
