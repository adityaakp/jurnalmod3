/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod3;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class MainKodeBuah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan buah : ");
        String kl = input.nextLine();
        System.out.println(KodeBuah.getKodebuah(kl));
        input.close();
    }
}
