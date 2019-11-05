package com.baizhi.poi;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.util.PoiPublicUtil;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.File;
import java.util.List;

public class TestEasyImport {
    public static void main(String[] args) {
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);


        List<User> list = ExcelImportUtil.importExcel(new File("E:/后期项目/day7/user.xls"),User.class, params);

        for (User user : list) {
            System.out.println(user);
        }



    }

}
