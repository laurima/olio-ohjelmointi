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
public class Tehtava4 {
    public static void main(String args[]){
//kysytään vuosi
    int vuosi;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Anna vuosi: ");
    vuosi = scanner.nextInt();
    
    if (vuosi % 4 ==0 && (vuosi % 100 != 0 || vuosi % 400 ==0)){
        System.out.println("karkausvuosi");
        }
        else {
            System.out.println("ei karkausvuosi");
        }
    }
}

