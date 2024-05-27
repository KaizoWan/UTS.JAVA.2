/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts_ridwan;

import java.util.Scanner;

/**
 *
 * @author A-14
 */
public class UTS_Ridwan {
    public static void main(String[] args) {
         //1
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        //2
        System.out.println("UTS PBO 20 Mei 2024 \nMuhammad Ridwan 23201252");
        //3
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        //4
        String namaUser;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan Nama anda: ");
        //5
        namaUser = scanner.nextLine();
        //6
        System.out.println("Pilih Jenis kelamin: \n1 Laki - Laki \n2 Perempuan");
        //7
        int pilihanGender = scanner.nextInt();
        scanner.nextLine();
        //8
        String panggilan;
        if (pilihanGender == 1) {
            panggilan = "Mas";
        } else if (pilihanGender == 2) {
            panggilan = "Mbak";
        } else {
            panggilan = "anda";
        }
        
        System.out.println("Selamat Datang " + panggilan + " " + namaUser);
        //9
        System.out.println("xxxxxxxxxx Kalkulator xxxxxxxxxx");
        //10
        boolean lanjut = true;
        
        while (lanjut) {
            System.out.println("Masukkan bilangan pertama: ");
            double bilangan1 = scanner.nextDouble();
            
            System.out.println("Masukkan bilangan kedua: ");
            double bilangan2 = scanner.nextDouble();
            
            System.out.println("Masukkan Operator | + | - | * | / | : ");
            char operator = scanner.next().charAt(0);
            
            double hasil;
            boolean operatorValid = true;
            
            switch (operator) {
                case '+':
                    hasil = bilangan1 + bilangan2;
                    break;
                case '-':
                    hasil = bilangan1 - bilangan2;
                    break;
                case '*':
                    hasil = bilangan1 * bilangan2;
                    break;
                case '/':
                    if (bilangan2 != 0){
                       hasil = bilangan1 / bilangan2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan");
                        continue;
                    }
                    break;
                default:
                    System.out.println("operator tidak valid. pilih operator yang tersedia/valid.");
                    operatorValid = false;
                    hasil = 0;
                    break;
            }
            if (operatorValid) {
                System.out.println("Hasil: " + bilangan1 + " " + operator + " " + bilangan2 + " = " + hasil);
                }
            System.out.println("Apakah anda ingin melanjutkan penggunaan Kalkulator? y/n: ");
            char lanjutPilihan = scanner.next().charAt(0);
            
            if (lanjutPilihan == 'n' || lanjutPilihan == 'N') {
                lanjut = false;
                
                System.out.println("Thank you for using the calculator. Goodbye!");
                scanner.close();
            }
        }
    }
}