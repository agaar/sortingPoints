package com.company;

/**
 * Created by User on 2016-10-26.
 */
public class Point implements Comparable<Point> {

    private String nazwa = "";
    private int x = 0;
    private int y = 0;
    private double distance;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance() {
        this.distance = calculateDistance(getX(), getY());
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateDistance(int x, int y) {
        this.x = x;
        this.y = y;
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public int compareTo(Point o) {
        return Double.compare(this.distance, o.distance);
    }
}





