package com.bridgelabz;


public class EmpWageBuilderMain {


    public static void main(String[] args) {
        EmployeeWage employee=new EmployeeWage(4, 20, 8, 1, 0,0,0,0);
        EmployeeWageWorkiing empWage=new EmployeeWageWorkiing();
        System.out.println("Calculated Total Wage : " +empWage.calculate_Total_Wage(3, employee.getHalf_time(),employee.getWage_per_hour(), employee.getHour_in_day(),employee.getPresent(), employee.getPresent(), employee.getTotalWage() ,employee.getTotal_hour(),employee.getTotal_working_day()));
    }
}