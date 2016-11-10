package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();       //liczba punktow
            Point[] point = new Point[n];
            for(int j = 0; j < n; j++) {
                point[j] = new Point();
                point[j].setNazwa(in.next());
                point[j].setX(in.nextInt());
                point[j].setY(in.nextInt());
                point[j].setDistance();
                point[j].getDistance();
            }
            Arrays.sort(point);
            for(int j = 0; j < n; j++) {
                System.out.println(point[j].getNazwa() + " " + point[j].getX() + " " + point[j].getY() );       //chce wyswietllic wspolrzedne
            }
            System.out.println();
        }
    }
}
