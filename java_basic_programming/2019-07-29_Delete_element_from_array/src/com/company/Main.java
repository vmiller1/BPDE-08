package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Please enter number of elements:");
        n = scanner.nextInt();
        System.out.println("Number elements in array is " + n);

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Please enter " + i + " element of the array:");
            a[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(a));

        int needle;
        System.out.print("Please enter needle:");
        needle = scanner.nextInt();

        boolean flag = false;
        for (int element : a) {
            if (element == needle) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes!!!!!!!");
        } else {
            System.out.println("No))))))))");
        }

        if (flag) {
            int[] b = new int[n - 1];
            int indexToRemove = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == needle) {
                    indexToRemove = i;
                    break;
                }
            }
            for (int i = 0; i < indexToRemove; i++) {
                b[i] = a[i];
            }
            for (int i = indexToRemove + 1; i < n; i++) {
                b[i-1] = a[i];
            }

            System.out.println(Arrays.toString(b));
        }
    }
}
