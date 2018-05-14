/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author rafineria123
 */
public class Tlumacz {

    public static void main(String[] args) {
        HashMap<String, String> slowa = new HashMap<>();
        Scanner skaner = new Scanner(System.in);
        slowa.put("chleb", "bread");
        slowa.put("maslo", "butter");
        slowa.put("polski", "polish");
        slowa.put("drzewo", "tree");
        slowa.put("jeden", "one");
        slowa.put("dwa", "two");
        slowa.put("trzy", "three");
        slowa.put("cztery", "four");
        slowa.put("piec", "five");
        slowa.put("szesc", "six");
        slowa.put("siedem", "seven");
        slowa.put("osiem", "eight");
        slowa.put("dziewiec", "nine");
        slowa.put("dziesiec", "ten");
        slowa.put("jedenascie", "eleven");
        slowa.put("dwanascie", "twelve");
        slowa.put("trzynascie", "thirteen");
        slowa.put("czternascie", "fourteen");
        slowa.put("pietnascie", "fifteen");
        slowa.put("szesnascie", "sixteen");
        while (true) {
            String x = skaner.next();
            if ("koniec!".equals(x)) {
                break;
            } else {
                System.out.println("Po angielsku: "+slowa.get(x));
            }

        }

    }

}
