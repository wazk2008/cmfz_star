package com.baizhi.poi;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Excel(name = "课程编号",needMerge = true)
    private String id;
    @Excel(name = "课程名称",needMerge = true)
    private String name;
    @ExcelEntity
    private Teacher teacher;
    @ExcelCollection(name = "选课学生")
    private List<Student> students;


}
