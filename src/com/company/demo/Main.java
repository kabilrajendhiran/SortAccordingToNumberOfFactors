package com.company.demo;

import java.util.Arrays;
import java.util.Scanner;

// To Sort Elements based on number of factors

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int a[] = new int[size];

        int cnt=0;
        System.out.println("Enter the array");

        while (cnt<size)
        {
            a[cnt] = scanner.nextInt();
            cnt++;
        }

	    int c[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int start = a[i];
            int j=1;
            int count = 0;

            while (j<start)
            {
                if(start%j==0)
                {
                    count++;
                }
                j++;
            }
            c[i] = count;

        }

        sortArr(c,a);

    }

    public static void sortArr(int arr[], int e[])
    {
        for (int i = 1; i < arr.length ; i++) {
            int k = arr[i];
            int k1 = e[i];
            int j = i-1;

            while (j>=0 && arr[j]<k)
            {
                arr[j+1] = arr[j];
                e[j+1] = e[j];
                j = j-1;
            }
            arr[j+1] = k;
            e[j+1] = k1;

        }

        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(arr));
    }


}
