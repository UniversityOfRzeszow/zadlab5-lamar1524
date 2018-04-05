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
import java.util.Scanner;
public class Firma {
    

    Pracownik[] pracownicy = new Pracownik[100];

    public void filldf() {                                                      //tworzenie pracownikow z wartosciami domyslnymi
        for (int i = 0; i < 100; i++) {
            pracownicy[i] = new Pracownik(" ", " ", 0, " ");
        }
    }

    public void add(int i) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie " + i + "-ego pracownika");
        pracownicy[i].imie = in.next();
        System.out.println("Podaj nazwisko " + i + "-ego pracownika");
        pracownicy[i].nazwisko = in.next();
        System.out.println("Podaj wiek " + i + "-ego pracownika");
        pracownicy[i].wiek = in.nextInt();
        System.out.println("Podaj stanowisko " + i + "-ego pracownika");
        pracownicy[i].stanowisko = in.next();
    }
    public void display(){
        System.out.println("Aktualny spis pracownikow: ");
        for(int i=0;i<100;i++){
            System.out.println("----------------------------------");
            pracownicy[i].pokazDane();
            System.out.println("----------------------------------");
        }
    }

}
