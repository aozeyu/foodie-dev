package com.imooc.service.iml;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StuServiceIml implements StuService {
//引入凑想方法
    @Autowired
    private StuMapper stuMapper;
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Stu getStuInfo(int id) {
        return stuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int saveStu() {
        return stuMapper.insert(new Stu(1020,"jack",39));
    }

    @Override
    public int updateStu(int id) {
        return stuMapper.updateByPrimaryKeySelective(new Stu(id,"lucy",35));
    }

    @Override
    public int deleteStu(int id) {
        return stuMapper.deleteByPrimaryKey(id);
    }




}
