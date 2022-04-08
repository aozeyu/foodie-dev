package com.imooc.service;

import com.imooc.pojo.Stu;

public interface StuService {
    public Stu getStuInfo(int id);
    public int saveStu();
    public int updateStu(int id);
    public int deleteStu(int id);
}
