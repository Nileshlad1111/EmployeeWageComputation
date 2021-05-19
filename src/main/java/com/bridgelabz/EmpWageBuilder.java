package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {


    public static void main(String[] args) {

        //object
        Random attendance = new Random();

        //variable
        int wage_per_hour = 20;
        int hour_in_day = 8;
        int half_time = 4;
        int totalWage = 0;
        int total_day = 0;
        int total_hour = 0;
        int total_working_day = 20;

        //size
        int maximumSize = 3;

            while (total_day < total_working_day && total_hour < 100) {
                int empCheck = attendance.nextInt(maximumSize);
                switch (empCheck) {
                    case 1:
                        totalWage = totalWage + wage_per_hour * hour_in_day;
                        total_day = total_day + 1;
                        System.out.println("Daily employee wage");
                        break;
                    case 2:
                        totalWage = totalWage + wage_per_hour * half_time;
                        total_hour = total_hour + 4;
                        System.out.println("Part time");
                        break;
                    default:
                        System.out.println("Employee is absent");
                        break;
                }
            }
            System.out.println("Total Wage for month : " + totalWage);
            System.out.println("total Days : " + total_day);
            System.out.println("total hour : " + total_hour);

        }

    }