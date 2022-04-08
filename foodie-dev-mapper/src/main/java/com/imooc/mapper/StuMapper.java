package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
//是聚合工程所以可以访问兄弟模块的对象
import com.imooc.pojo.Stu;

public interface StuMapper extends MyMapper<Stu> {
}