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
public class PayRoll {

    int OVERTIME_RATE1 = 25;
    int OVERTIME_RATE2 = 30;
    int NORMAL_RATE = 20;

    int totalPayRoll = 0;
    int numEmployees = 0;

    
    public PayRoll() {
    }

    public void Calculate(int employeeID) {
//        PayRoll pr = new PayRoll();
        int hoursWorked;
        int grossPay = 0;
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
    }

    public static void main(String[] args) {
        PayRoll pr = new PayRoll();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input empoyeeID: ");
        int empoyeeID = sc.nextInt();
        pr.Calculate(empoyeeID);
    }
}
