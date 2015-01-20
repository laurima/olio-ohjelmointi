/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author lauri
 */
public class Tehtava9 {
     public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    float tulos=0;
    int[] numero;
    numero = new int[5];
    for (int i=0; i < numero.length;i++){
    System.out.print("Anna " + (i+1) + " numero: ");
    numero[i] = scanner.nextInt();      
}
    java.util.Arrays.sort(numero);
    
    tulos=numero[1]+numero[2]+numero[3];
    
         System.out.println("Tulos: " + (tulos/3));
}}
