package com.gaoshu.service.serviceimpl;

import com.gaoshu.mapper.DetailMapper;
import com.gaoshu.pojo.Detail;
import com.gaoshu.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    private DetailMapper dm;

    //查询约战详情列表
    public List<Detail> selectDetails(){
        return dm.selectAll();
    }
}
