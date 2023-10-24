package com.hvdbs.menshikovOlimpicProgramming.training1;
import java.util.Scanner;

public class Task1A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        if (m == n) {
            System.out.println("Absent");
            return;
        }

        boolean wasPrime = false;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                wasPrime = true;

                System.out.println(i);
            }
        }

        if (!wasPrime) {
            System.out.println("Absent");
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int k = (int)Math.sqrt(n);

        for (int i = 2; i <= k; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
