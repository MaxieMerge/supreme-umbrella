package com.kainos.ea.employee_stuff;

public class SalesEmployee extends Employee {
    private int totalSales;
    private double commissionRate;

    public SalesEmployee(short employeeID, String newFName, String newLName,
                         String newCity, String newPostcode, String newStreetAddr,
                         String newSortCode, String newBan, String newNIN, String newDepartment,
                         int newSalary, int newTotalSales, double newCommissionRate) {
        super(employeeID, newFName, newLName,
                newCity, newPostcode, newStreetAddr,
                newSortCode, newBan, newNIN, newDepartment,
                newSalary);
        setTotalSales(newTotalSales);
        setCommissionRate(newCommissionRate);
    }


    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        if(totalSales>0) this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate>0.00) this.commissionRate = commissionRate;
    }


}
