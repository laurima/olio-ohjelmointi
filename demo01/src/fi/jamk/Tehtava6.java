/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk;

import java.util.Scanner;

/**
 *
 * @author lauri
 */
public class Tehtava6 {
     public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int numero;
    int summa=0; 
    do {
    System.out.print("Anna luku: ");
    numero = scanner.nextInt();
    summa +=numero;
} while (numero != 0);
         System.out.println(summa);
}}
