/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class Samochod {

    private String marka;
    private String nazwa;
    private int cena;
    private int max_predkosc;

    public Samochod(String marka, String nazwa, int cena, int max_predkosc) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.cena = cena;
        this.max_predkosc = max_predkosc;
    }

    @Override
    public String toString() {
        return "\nMarka: " + this.marka + "\nModel: " + this.nazwa + "\nCena: " + cena + "\nMaksymalna Predkosc: " + this.max_predkosc;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getMax_predkosc() {
        return max_predkosc;
    }

    public void setMax_predkosc(int max_predkosc) {
        this.max_predkosc = max_predkosc;
    }

    public static void main(String[] args) {
        List<Samochod> samochody = new ArrayList<Samochod>();
        samochody.add(new Samochod("Opel", "Astra", 5000, 170));
        samochody.add(new Samochod("Opel1", "Astra1", 50001, 1701));
        samochody.add(new Samochod("Opel2", "Astra2", 50002, 1702));
        samochody.add(new Samochod("Opel3", "Astra3", 50003, 1703));
        samochody.add(new Samochod("Opel4", "Astra4", 50004, 1704));
        for (int i = 0; i < samochody.size(); i++) {
            System.out.println(samochody.get(i));
        }
    }
}
