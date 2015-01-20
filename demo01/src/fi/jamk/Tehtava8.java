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
public class Tehtava8 {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int[] numero;
    numero = new int[5];
    for (int i=0; i < numero.length;i++){
    System.out.print("Anna " + (i+1) + " numero: ");
    numero[i] = scanner.nextInt();      
}
    for (int j=5; j>0;j--){
        System.out.println(numero[(j-1)]);
    }
  
    
}}
