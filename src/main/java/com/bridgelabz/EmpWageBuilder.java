package com.bridgelabz;

public class EmpWageBuilder {


    public static void main(String[] args) {
        //variable
        int wage_per_hour=20;
        int hour_in_day=8;

        //constant
        int IS_PRESENT = 1;
        double empCheck = Math.floor((Math.random() * 10)) % 2;
        System.out.println(IS_PRESENT);
        if(empCheck == IS_PRESENT) {
            int totalWage = wage_per_hour * hour_in_day;
            System.out.println("total Wage for Day : " + totalWage);
            System.out.println("employee is present");
        }else {
            System.out.println("employee is absent");
        }


        }
    }
