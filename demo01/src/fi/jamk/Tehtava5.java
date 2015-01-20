/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lauri
 */
public class Tehtava5 {
     public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int[] numero;
    numero = new int[3];
    for (int i=0; i < numero.length;i++){
    System.out.print("Anna " + (i+1) + " luku: ");
    numero[i] = scanner.nextInt();      
}
    java.util.Arrays.sort(numero);
    for (int j=0; j<numero.length; j++){
        System.out.println(numero[j] + "" );
    }
    
}}
