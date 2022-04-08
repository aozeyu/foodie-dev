package com.imooc.pojo;

import javax.persistence.Id;

public class Stu {
    @Id
    private Integer id;

    private String name;

    private Integer age;

    public Stu(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}