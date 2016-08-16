/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author a1309m_dtlong
 */
public class Empoyee {
    int OVERTIME_RATE1 = 25;
    int OVERTIME_RATE2 = 30;
    int NORMAL_RATE = 20;

    int totalPayRoll = 0;
    int numEmployees = 0;

    public Empoyee() {
    }

    public int getOVERTIME_RATE1() {
        return OVERTIME_RATE1;
    }

    public void setOVERTIME_RATE1(int OVERTIME_RATE1) {
        this.OVERTIME_RATE1 = OVERTIME_RATE1;
    }

    public int getOVERTIME_RATE2() {
        return OVERTIME_RATE2;
    }

    public void setOVERTIME_RATE2(int OVERTIME_RATE2) {
        this.OVERTIME_RATE2 = OVERTIME_RATE2;
    }

    public int getNORMAL_RATE() {
        return NORMAL_RATE;
    }

    public void setNORMAL_RATE(int NORMAL_RATE) {
        this.NORMAL_RATE = NORMAL_RATE;
    }

    public int getTotalPayRoll() {
        return totalPayRoll;
    }

    public void setTotalPayRoll(int totalPayRoll) {
        this.totalPayRoll = totalPayRoll;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    @Override
    public String toString() {
        return "Empoyee{" + "OVERTIME_RATE1=" + OVERTIME_RATE1 + ", OVERTIME_RATE2=" + OVERTIME_RATE2 + ", NORMAL_RATE=" + NORMAL_RATE + ", totalPayRoll=" + totalPayRoll + ", numEmployees=" + numEmployees + '}';
    }
    
    public double calcGrossPay(int employeeID){
        int hoursWorked;
        double grossPay = 0;
        Scanner sc = new Scanner(System.in);
        while (employeeID != 0) {
            System.out.println("Input hours worked: ");
            hoursWorked = sc.nextInt();

            if (hoursWorked > 40) {
                grossPay = (hoursWorked - 40) * OVERTIME_RATE2 + 5 * OVERTIME_RATE1
                        + 35 * NORMAL_RATE;
            } else if (hoursWorked > 35) {
                grossPay = (hoursWorked - 35) * OVERTIME_RATE1 + 35 * NORMAL_RATE;
            } else {
                grossPay = hoursWorked * NORMAL_RATE;
            }

            System.out.println("Gross Pay: "+grossPay);
            totalPayRoll += grossPay;
            numEmployees +=1;
            System.out.println("Input employeeID: ");
            employeeID = sc.nextInt();
        }
        if (numEmployees != 0) {
            System.out.println("Number of pay details entered was: " + numEmployees);
            System.out.println("The total pay roll cost for the data entered is: " + totalPayRoll + "$");
        } else {
            System.out.println("No Employee entered!");
        }
        
        return grossPay;
    }
}
