package com.gaoshu.controller;

import com.gaoshu.service.TeamService;
import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("Team")
public class GradeController {
    @Autowired
    private TeamService ts;

    //查询球队信息.
    @RequestMapping("/selectTeams.do")
    public String selectTeams(@RequestParam(required=true,defaultValue="1")int pageNum, Model m){
        //设置分页参数
        PageHelper.startPage(pageNum,3);
        //调用service方法
        List<Team> teams=ts.selectTeams();
        //将分页查询的结果装配到pageInfo中
        PageInfo<Team> pageInfo = new PageInfo<>(teams);
        //将pageInfo上传到用户列表
        m.addAttribute("pageInfo",pageInfo);

        return "qdzj";
    }
}
