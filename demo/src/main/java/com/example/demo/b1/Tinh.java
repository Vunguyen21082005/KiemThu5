package com.example.demo.b1;

public class Tinh {
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
