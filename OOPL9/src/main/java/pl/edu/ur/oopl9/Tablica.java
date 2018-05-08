/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author maarchyl
 */
public class Tablica {

    public static void main(String[] args) {
        Random generator = new Random();
        int tablica[] = new int[100];
        for (int i = 0; i < 100; i++) {
            tablica[i] = generator.nextInt(101);
        }
        wyswietl(tablica);
        sortuj(tablica);
        wyswietl(tablica);

    }

    public static int[] sortuj(int tablica[]) {
        Arrays.sort(tablica);
        return tablica;

    }

    public static void wyswietl(int tablica[]) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("--------------");
            System.out.println(i + ". ");

        }
    }

}
