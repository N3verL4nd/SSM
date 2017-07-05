package cn.bjut.entity;

import java.time.ZoneId;
import java.util.Date;

public class Person {
    private Integer id;

    private String name;

    private Integer age;

    private Date birth;

    public Integer getId() {
//        System.out.println("getId");
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate() +
                '}';
    }
}