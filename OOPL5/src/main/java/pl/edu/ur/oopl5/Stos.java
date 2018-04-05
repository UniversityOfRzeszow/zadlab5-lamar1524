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
public class Stos {

    private int wskaznik_stosu;
    private int rozmiar;
    int tab[] = new int[rozmiar];

    private void push(int k) {
        if (wskaznik_stosu >= rozmiar) {
            System.out.println("Stos jest pelny");
        } else {

            wskaznik_stosu = 0;
            tab[wskaznik_stosu] = k;
            wskaznik_stosu++;
        }

    }

    private void pop() {
        if (wskaznik_stosu == 0) {
            System.out.println("Stos jest pusty");
        } else {

            System.out.println("Element ktory sciagasz ze stosu to: " + tab[wskaznik_stosu]);

        }
        wskaznik_stosu--;

    }

    public Stos(int rozmiar) {
        this.rozmiar = rozmiar;

    }

}
