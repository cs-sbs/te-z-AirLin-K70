package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        int position = 1;
        // 你的代码逻辑
        while (inputNumber > 0) {
            int digit = inputNumber % 10; // 获取当前最低位的数字
            inputNumber /= 10; // 去掉当前最低位的数字

            // 判断数字的奇偶性与数位的奇偶性是否相同
            if ((digit % 2) == (position % 2)) {
                result += Math.pow(2, position - 1);
            }

            position++;
        }


        System.out.println(result);
    }
}
