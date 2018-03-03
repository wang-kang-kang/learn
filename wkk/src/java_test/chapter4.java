package java_test;

import java.util.Scanner;

public class chapter4 {
    static Scanner num = new Scanner(System.in);

    public static void main(String[] args) {

        int lay;
        lay = 7;//菱形的总长度
        for(int m = 1; m <=(lay+1)/2; m++)//正序输出上半部分
        {
            for(int b = 1; b <=(lay+1)/2-m ; b++)//输出空格
            {
                System.out.print(" ");
            }
            for(int c = 1; c <= m*2-1; c++)
            {
                System.out.print("*");
            }
            System.out.println();//换行
        }
        for(int d =(lay+1)/2-1;d >= 1; d --)//倒序输出下半部分
        {
            for(int b = 1; b <= (lay+1)/2-d; b++)//输出空格
            {
                System.out.print(" ");
            }
            for(int c = (lay+1)/2-d; c <=(lay+1)/2-2+d; c ++)//(lay+1)/2-1即为下半个三角形
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("判断变量是奇数还是偶数，请输入一个数字：");
        int a = 0;
        String goon = "";
        do {
            System.out.println("请输入数字a：");
            a = num.nextInt();
            judge(a);
            jiecheng(a);
            goon = goon();
        } while ("yes".contains(goon.toLowerCase()));
    }

    static public void judge(int a){
        if(a%2 == 0){
            System.out.println(a+" is Even numbers.");
        }else
        {
            System.out.println(a+" is Odd numbers.");
        }
    }
    static public String goon() {
        String goon = "";
        do {
            System.out.println("是否继续？请输入：（继续：yes或者y，结束：no或者n）");
            goon = num.next();
//            String a = "l love feng ye";
//            String b = "love";
//            boolean c = a.contains(b);
//            assert(c)=true;//加断言
        } while (!("yes y".contains(goon.toLowerCase()) || "no n".contains(goon.toLowerCase())));
        return goon;
    }
    static public void jiecheng(int num){
        float total = 0;
        int i=1,j=1;
        if (num < 1)
        {
            System.out.println("请输出大于1的整数");
        }else{
            while (i<=num){
                float total_j=0;
                while(j<=i){
                    total_j=total_j+j;
                    j++;
                }
                total=total+1/total_j;
                i++;
            }
            System.out.println("结果为："+total);
        }
    }
}
