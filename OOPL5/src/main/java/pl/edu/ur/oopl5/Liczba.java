/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author LamaR
 */
public class Liczba {

    public int liczba;
    int tab[] = new int[size(liczba)];

    public Liczba(int liczba) {
        this.liczba = liczba;
    }

    public int size(int liczba) {
        int licznik = 0;
        while (liczba / 10 != 0) {
            liczba = liczba / 10;
            licznik++;
        }
        return licznik;
    }

    public void rozklad(int liczba) {
        int licznik = 0;

        for (int i = 0; i < size(liczba); i++) {
            tab[i] = liczba % 10;
            liczba = liczba / 10;
        }

    }

    public void wypisz(int liczba) {
        rozklad(liczba);
        for (int i = 0; i < size(liczba); i++) {
            System.out.println(tab[i]);
        }
    }
}
