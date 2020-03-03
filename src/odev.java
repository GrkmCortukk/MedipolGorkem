package com.company;

import java.util.Scanner;

public class odev {
    public static void main(String[]args){
        Scanner veriAl = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin:");

        int veri = veriAl.nextInt();
        System.out.println("Girdiginiz deger " + veri);

        for(int i=1; i<=veri;i++){
            System.out.println("n^1");
            double usHesapla= Math.pow(i,1);
            System.out.println(usHesapla);

            System.out.println("n^2");
            usHesapla= Math.pow(i,2);
            System.out.println(usHesapla);

            System.out.println("n^3");
            usHesapla= Math.pow(i,3);
            System.out.println(usHesapla);

            System.out.println("n^4");
            usHesapla= Math.pow(i,4);
            System.out.println(usHesapla);
        }
    }
}