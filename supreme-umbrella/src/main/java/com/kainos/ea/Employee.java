package com.kainos.ea;

public class Employee {
    private short employeeID, projectID;
    private String fName, lName, city, postcode, streetAddr, sortCode, ban, NIN, department;
    private int salary;

    public Employee(short employeeID, String newFName, String newLName,
                    String newCity, String newPostcode, String newStreetAddr,
                    String newSortCode, String newBan, String newNIN, String newDepartment, int newSalary)
    {
        this.employeeID = employeeID;
        this.fName = newFName;
        this.lName = newLName;
        this.city = newCity;
        this.postcode = newPostcode;
        this.streetAddr = newStreetAddr;
        this.sortCode = newSortCode;
        this.ban = newBan;
        this.NIN = newNIN;
        this.department = newDepartment;
        this.salary = newSalary;
    }

    public short getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(short employeeID) {
        this.employeeID = employeeID;
    }

    public short getProjectID() {
        return projectID;
    }

    public void setProjectID(short projectID) {
        this.projectID = projectID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreetAddr() {
        return streetAddr;
    }

    public void setStreetAddr(String streetAddr) {
        this.streetAddr = streetAddr;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public String getNIN() {
        return NIN;
    }

    public void setNIN(String NIN) {
        this.NIN = NIN;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary>0) this.salary = salary;
    }
}
