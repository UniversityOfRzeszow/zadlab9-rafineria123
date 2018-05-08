/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class Aplikacja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random();
        TreeSet<Integer> cos = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            cos.add(generator.nextInt(101));
        }
        Iterator it = cos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //ta struktura nie tworzy nowego elmentu jesli juz istnieje element o takiej samej wartosci
    }

}
