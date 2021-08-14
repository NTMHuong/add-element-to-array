package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size: ");
        int size = sc.nextInt();
	    int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Nhap gia tri arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Nhap so can chen: ");
        int number = sc.nextInt();
        System.out.println("Nhap vi tri can chen: ");
        int index = sc.nextInt();

        int[] result = new int[size + 1];
        if(index < 0 || index > size + 1){
            System.out.println("khong chen duoc phan tu vao mang");
        }else{
            for(int i = 0; i < index; i++){
                result[i] = arr[i];
            }
            result[index] = number;
            for(int i = index + 1; i < size + 1; i++){
                result[i] = arr[i-1];
            }
        }
        for (int x : result){
            System.out.print(x + " ");
        }
    }
}
