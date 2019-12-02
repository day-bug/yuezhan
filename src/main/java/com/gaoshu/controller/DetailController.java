package com.gaoshu.controller;

import com.gaoshu.pojo.Detail;
import com.gaoshu.service.DetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("Detail")
public class DetailController {
    @Autowired
    private DetailService ds;

    //查询约战详情列表
    @RequestMapping("/selectAllDetail.do")
    public String selectAllDetail(@RequestParam(required=true,defaultValue="1")int pageNum, Model m){
        //设置分页参数
        PageHelper.startPage(pageNum,3);
        //调用service方法
        List<Detail> details = ds.selectDetails();
        //将分页查询的结果装配到pageInfo中
        PageInfo<Detail> pageInfo = new PageInfo<>(details);
        //将pageInfo上传到用户列表
        m.addAttribute("pageInfo",pageInfo);

        return "detailShow.jsp";
    }
}
