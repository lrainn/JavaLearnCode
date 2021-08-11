package com.ame;
/*
    学生类
    alt+insert:自动生成构造方法和get/set方法
* */
public class Student {
    //学号
    private String sid;
    //姓名
    private String name;
    //年龄
    private  String age;
    //居住地
    private String address;

    public  Student(){}

    public Student(String sid,String name,String age,String address) {
        this.name = name;
        this.sid = sid;
        this.age = age;
        this.address = address;
    }
    public String getSid() { return this.sid; }

    public void setSid(String sid){this.sid = sid;}

    public String getName(){return this.name;}

    public  void setName(String name){this.name = name;}

    public  String getAge(){return this.age;}

    public void setAge(String age){this.age = age;}

    public String getAddress(){return this.address;}

    public void setAddress(String address){this.address = address;}

    public String toString(){
        return "name:"+this.name+",sid:"+this.sid+",age:"+this.age+",address:"+this.address;
    }

    public static void main(String[] args) {
        Student stu = new Student("1001","小红","12","Japan");

        System.out.println(stu.toString());
    }

}
