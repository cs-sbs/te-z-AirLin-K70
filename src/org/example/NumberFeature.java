package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nonnegative_number = scanner.nextInt(); // 读取非负整数
        scanner.close();

        int a, b = 0, f; // a：输入数每位的存储单元。b：位数。f：存储2为多少次幂（二进制位）
        int c, d = 0; // c：如果满足题意 奇偶相同为1，否则为零。d：储存结果

        while (nonnegative_number != 0) {
            a = nonnegative_number % 10; // 获取当前最低位的数字
            b++; // 位数加1
            f = b;
            if (a == 0) {
                c = 0;
            } else if (a % 2 == b % 2) { // 判断奇偶性是否相同
                c = 1;
                for (; f > 1; f--) {
                    c = c * 2;
                }
            } else {
                c = 0;
            }
            d += c; // 将c的值加到结果d上
            nonnegative_number = nonnegative_number / 10; // 去掉当前最低位的数字
        }

        System.out.println(d); // 输出结果
    }
}
