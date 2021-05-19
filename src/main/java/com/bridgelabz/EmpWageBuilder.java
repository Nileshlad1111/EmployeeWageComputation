package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {


    public static void main(String[] args) {

        Random attendance = new Random();

        //variable
        int wage_per_hour=20;
        int hour_in_day=8;
        int half_time=4;

        //constant
        int IS_PRESENT = 1;

        //size
        int max=3;
        int empCheck=attendance.nextInt(max);
        System.out.println(IS_PRESENT);
        if(empCheck == IS_PRESENT) {
            int totalWage_ofDaily = wage_per_hour * hour_in_day;
            System.out.println("total Wage for Day : " + totalWage_ofDaily);
            System.out.println("employee is present");
        }else if (empCheck == 2)
        {
            int totalWage_PartTime;
            totalWage_PartTime=wage_per_hour*half_time;
            System.out.println("PartTime Wage : " + totalWage_PartTime);
        }else {
            System.out.println("employee is absent");
        }


        }
    }
