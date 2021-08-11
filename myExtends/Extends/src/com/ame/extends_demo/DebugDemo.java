package com.ame.extends_demo;
import java.util.Scanner;

public class DebugDemo {
    public static void main(String[] args) {
      /*  int sum = 0;
        for (int i = 0;i<=10;i++){
            if(i % 2==0){
                sum += i;
            }
        }
        System.out.println("和："+sum);*/
        //debug查看方法调用流程
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int a = sc.nextInt();

        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();

        int max = getMax(a,b);
        System.out.println("较大值是："+max);

    }

    public static int getMax(int a,int b){
        if (a > b){
            return a;
        }
        else{
            return b;
        }
    }
}
