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
public class Tehtava1 {
    public static void main(String args[]){
        //kysy pistemäärä
         int luku;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anna pisteet: ");
        luku = scanner.nextInt();
        
        if (luku == 0 && luku < 2){
         System.out.println("Arvosanana: 0 ");}
        if (luku > 1 && luku < 3){
         System.out.println("Arvosana: 1");}
        if (luku > 3 && luku < 6){
         System.out.println("Arvosana: 2");}
        if (luku > 5 && luku < 8){
         System.out.println("Arvosana: 3");}
        if (luku > 7 && luku < 10){
         System.out.println("Arvosana: 4");}
        if (luku > 9 && luku < 13){
         System.out.println("Arvosana: 5");}
        //tulosta arvosana
    }
}
