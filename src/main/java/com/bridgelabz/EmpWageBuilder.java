package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {


    public static void main(String[] args) {

        //object
        Random attendance = new Random();

        //variable
        int wage_per_hour=20;
        int hour_in_day=8;
        int half_time=4;
        int totalWage_PartTime;
        int totalWage_ofDaily;

        //size
        int max=3;
        int empCheck=attendance.nextInt(max);
        switch (empCheck)
        {
            case 1:
                totalWage_ofDaily=wage_per_hour*hour_in_day;
                System.out.println("total Wage for Day : " + totalWage_ofDaily);
                break;
            case 2:
                totalWage_PartTime=wage_per_hour*half_time;
                System.out.println("PartTime Wage : " + totalWage_PartTime);
                break;
            default:
                System.out.println("Employee is absent");
                break;
            }


        }
    }
