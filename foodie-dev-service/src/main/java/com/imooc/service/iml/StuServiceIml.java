package com.imooc.service.iml;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceIml implements StuService {
//引入凑想方法
    @Autowired
    private StuMapper stuMapper;
    @Override
    public Stu getStuInfo(int id) {

        return null;
    }

    @Override
    public void saveStu() {

    }

    @Override
    public void updateStu(int id) {

    }

    @Override
    public void deleteStu() {

    }
}
