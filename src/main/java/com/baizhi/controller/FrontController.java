package com.baizhi.controller;

import com.baizhi.entity.Banner;
import com.baizhi.service.AlbumService;
import com.baizhi.service.ArticleService;
import com.baizhi.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("cmfz")
@RestController
public class FrontController {

    @Autowired
    private BannerService bannerService;
    @Autowired
    private AlbumService albumService;
    @Autowired
    private ArticleService articleService;


    @RequestMapping("first_page")
    public Map<String,Object> firstPage(String uid,String type,String sub_type){
        HashMap<String, Object> map = new HashMap<>();
        if("all".equals(type)){
            List<Banner> banners = bannerService.selectAll();
//            albumService....,
//            articleService......
            map.put("header",banners);
//            map.put("header",banners);
//            map.put("header",banners);
        }
        if("wen".equals(type)){
//            albumService.select...
//            map.put("")
        }
        if("si".equals(type)){
            if("ssyj".equals(sub_type)){
//                根据uid,查询user对象,获取该user的上师id,根据该上师id,查询该上师的几篇文章
//                map.put("")
            }
            if("xmfy".equals(sub_type)){
//                查询除了自己上师之外的所有文章,
//                map.put("")
            }
        }
        return map;
    }



}
