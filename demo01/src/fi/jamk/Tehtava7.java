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
public class Tehtava7 {
    public static void main(String args[]){
    int numero;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Anna numero: ");
    numero = scanner.nextInt();
    
    for (int i=1; i<=numero; i++){
        for (int j=1; j<=i; j++){
        System.out.print("*" );
    }
        System.out.println("");}
   
}
}
