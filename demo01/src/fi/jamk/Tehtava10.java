/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author lauri
 */
public class Tehtava10 {
    public static void main(String args[]){
    int maara=40;
    int[] numero;
    numero = new int[maara];
    int laskin=0;
    int tahti=0;
    Scanner scanner = new Scanner(System.in);
            System.out.println("Anna arvosana. 1-5. Syötä 9 lopettaaksesi. ");
            
    for (int i=0; i < numero.length;i++)
    {
        System.out.print("Anna arvosana: ");
    numero[i]= scanner.nextInt();
    laskin=laskin+1;
    if (numero[i] == 9) {break;}
    
    }
         
    System.out.println("Arvosanajakauma:");
        
        for(int j=0;j<6;j++){
            System.out.println(j +": ");
            for (int h=0;h > maara; h++ ){
                if (numero[h] == j){ System.out.print("*");}
            }
        }
 
    }
}