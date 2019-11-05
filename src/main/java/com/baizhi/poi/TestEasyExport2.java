package com.baizhi.poi;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestEasyExport2 {
    public static void main(String[] args) throws Exception {
//        模拟数据
        List<Course> list = new ArrayList<>();
        for (int i = 1; i <4 ; i++) {
            Course course = new Course();
            course.setId("c"+i);
            course.setName("海贼王必修"+i);
            course.setTeacher(new Teacher("t"+i,"老王"+i));
            List<Student> students = new ArrayList<>();
            for (int j = 1; j < 4; j++) {
                Student student = new Student();
                student.setId("s"+i);
                student.setName("小王"+i);
                student.setSex("男");
                student.setBir(new Date());
                students.add(student);
            }
            course.setStudents(students);
            list.add(course);
        }

        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("测试1", "测试2", "测试"),
                Course.class, list);



        workbook.write(new FileOutputStream(new File("E:/后期项目/day7/course.xls")));


    }
}
