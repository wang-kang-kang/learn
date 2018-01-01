import java.util.Scanner;

public class Test {
    static Scanner num = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("haha");
        System.out.println("《Iava入门精通》\n是我学习Java的最佳书籍");
        int a = 0, b = 0;
        String goon = "";
        do {
            System.out.println("请输入数字a：");
            a = num.nextInt();
            System.out.println("请输入数字b：");
            b = num.nextInt();
            calculate(a, b);
            goon = goon();
        } while ("yes".contains(goon.toLowerCase()));
    }

    public static void calculate(int a, int b) {
        String method = "";
        do {
            System.out.println("请输入你想要的运算或其对应的数字（加法：1、减法：2、乘法：3、除法：4）：");
            method = num.next();
        } while (method.equals(""));
        if ("加法".equals(method) || "1".equals(method)) {
            System.out.println(a + "+" + b + "=" + (a + b));
        } else if ("减法".equals(method) || "2".equals(method)) {
            System.out.println(a + "-" + b + "=" + (a - b));
        } else if ("乘法".equals(method) || "3".equals(method)) {
            System.out.println(a + "*" + b + "=" + (a * b));
        } else if ("除法".equals(method) || "4".equals(method)) {
            System.out.println(a + "/" + b + "=" + (a / b));
        } else {
            System.out.println("方法输入错误，请重新输入");
            calculate(a, b);
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

}

