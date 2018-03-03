package java_test;

public class Gess {
    public static void main(String[] args) {
        char word = 'a', word2 = '@';
        int p = 23045, p2 = 45213;
        System.out.println("d在unicode中的顺序位置是:" + (int) word);
        System.out.println("@在unicode中的顺序位置是:" + (int) word2);
        System.out.println("unicode中的23045是" + (char) p);
        System.out.println("unicode中的45213是" + (char) p2);
        System.out.println("\123"+"\u1284"+"\\"+"\t"+"\'"+"\'"+"\b"+"\r");
        int num = 2147483647;
        long temp = num+2L;
        System.out.println(temp);
    }
}
