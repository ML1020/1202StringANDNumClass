//给定一系列正整数(第一个数为输入字数的个数)，请按要求对数字进行分类，并输出以下5个数字：
//A1 = 能被5整除的数字中所有偶数的和；
//A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
//A3 = 被5除后余2的数字的个数；
//A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
//A5 = 被5除后余4的数字中最大数字。
import java.text.DecimalFormat;
import java.util.Scanner;

public class NumClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0;i < strings.length;i++){
            ints[i] = Integer.parseInt(strings[i]);
        }
        int count = 0;int count1 = 0;
        int flag = 1;
        int a1= 0;int a2 = 0;int a4 = 0;int a5 = 0;
        for (int i = 1;i < ints.length;i++){
            if (ints[i] % 5 == 0){
                if (ints[i] % 2 == 0){
                    a1 += ints[i];
                }
            }
            if (ints[i] % 5 == 1){
                a2 += ints[i] * flag;
                flag = (-1)*flag;
            }
            if (ints[i] % 5 == 2){
                count++;
            }
            if (ints[i] % 5 == 3){
                count1++;
                a4 += ints[i];
            }
            if (ints[i] % 5 == 4){
               if (ints[i] > a5){
                   a5 = ints[i];
               }
            }
        }

        if (a1 != 0){
            System.out.print(a1 + " ");
        }else {
            System.out.print("N" + " ");
        }
        if (a2 != 0){
            System.out.print(a2 + " ");
        }else {
            System.out.print("N" + " ");
        }
        if (count != 0){
            System.out.print(count + " ");
        }else {
            System.out.print("N" + " ");
        }
        if (a4 != 0){
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            System.out.print(decimalFormat.format(a4*(1.0)/count1) + " ");
        }else {
            System.out.print("N" + " ");
        }
        if (a5 != 0){
            System.out.print(a5);
        }else {
            System.out.print("N");
        }
    }
}