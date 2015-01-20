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
public class Tehtava3 {
    public static void main(String args[]){
//määritellään tarvittavat luvut ja taulukko. [0]=tunti,[1]=minuutti, [2]=sekunti
        //ja kysytään sekuntimäärä
    int luku;
    int[] aika;
    aika = new int [3];
    Scanner scanner = new Scanner(System.in);
    System.out.print("Anna sekuntimäärä: ");
    luku = scanner.nextInt();
    
    aika[0]=luku/60/60;
    aika[1]=(luku-(aika[0]*60*60))/60;
    aika[2]=luku-((aika[0]*60*60)+(aika[1]*60));
     System.out.println( aika[0] + " tunti " + aika[1] + " minuutti " +aika[2] + " sekunti");
        //laskee ja tulostaa lopputuloksen
    }
}
