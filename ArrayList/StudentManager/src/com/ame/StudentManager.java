package com.ame;

import java.util.Scanner;
import java.util.ArrayList;
public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> stuArray = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("---欢迎来到学生管理系统---\n请输入你的选择：\n1.添加学生信息\n2.查看学生信息\n3.修改学生信息\n4.删除学生\n5.退出");
            String choose = in.nextLine();

            switch (choose){//添加学生
                case "1":
                {

                    addStudent(stuArray);
                    break;
                }
                case "2"://查看学生
                {
                    findAllStudent(stuArray);
                    break;
                }
                case "3"://修改学生
                {
                    updateStudent(stuArray);
                    break;
                }
                case "4"://删除学生
                {
                    deleteStudent(stuArray);
                    break;
                }
                case "5":
                {
                    System.out.println("---已退出---");
                    System.exit(0);
                    break;
                }
                default:
                    break;

            }
        }

    }

    //添加学生信息
    public static void addStudent(ArrayList<Student> array ){
        /*in.nextLine();不能放在in.nextInt();代码段后面
否则in.nextLine();会读入"\n"字符，但"\n"并不会成为返回的字符。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID：");
        String id = sc.nextLine();
        boolean flag = IsUsed(array,id);
        if (flag == true){
            System.out.println("此学号已被使用");
            return;
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生住址：");
        String address = sc.nextLine();

        Student stu = new Student(id,name,age,address);
        array.add(stu);
    }

    //查看学生信息
    public static void findAllStudent(ArrayList<Student> array){
        if (array.size() == 0){
            System.out.println("无任何学生信息，请先添加");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t住址");
        for (int i = 0; i < array.size();i++)
        {
            System.out.print(array.get(i).getSid()+"\t");
            System.out.print(array.get(i).getName()+"\t");
            System.out.print(array.get(i).getAge()+"\t");
            System.out.print(array.get(i).getAddress()+"\n");
        }
    }
    //修改学生信息
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String id = sc.nextLine();

        for (int i = 0;i < array.size();i++){
            if (array.get(i).getSid().equals(id)) {
                array.remove(i);
                System.out.println("请输入修改后的学生信息");
                addStudent(array);
                System.out.println("修改完毕");
                break;
            }
            else if (i == array.size()-1){
                System.out.println("不存在此学号");
                break;
            }
        }
    }
    //删除学生信息
    public static  void deleteStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String id = sc.nextLine();

        for (int i = 0;i < array.size();i++){
            if (array.get(i).getSid().equals(id)) {
                array.remove(i);
                System.out.println("已删除。");
                break;
            }
            else if (i == array.size()-1){
                System.out.println("不存在此学号");
                break;
            }
        }
    }
    //判断学号是否已经被使用
    public static boolean IsUsed(ArrayList<Student> array,String id){
        for (int i =0 ; i<array.size();i++){
            if (array.get(i).getSid().equals(id)){
                return true;
            }
        }
        return false;
    }
}
