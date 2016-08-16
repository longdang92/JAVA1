/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author a1309m_dtlong
 */
public class MyPoint {
    int x=0;
    int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*yDiff);
    }
    
    public double distance(MyPoint anotherPoint){
        int xDiff = this.x - anotherPoint.x;
        int yDiff = this.y - anotherPoint.y;
        return Math.sqrt(xDiff*yDiff);
    }
    public static void main(String[] args) {
        MyPoint mp1 = new MyPoint(3, 4);
        MyPoint mp2 = new MyPoint(0, 6);
        System.out.println(mp1.toString());
        
        System.out.println(mp1.distance(mp2));
//        System.out.println(mp1.distance(2,5));
    }
}
