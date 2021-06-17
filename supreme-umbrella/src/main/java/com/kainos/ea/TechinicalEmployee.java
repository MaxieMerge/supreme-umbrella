package com.kainos.ea;

public class TechinicalEmployee extends Employee{

    private String cv, image;

    public TechinicalEmployee(short employeeID, String newFName, String newLName,
                              String newCity, String newPostcode, String newStreetAddr,
                              String newSortCode, String newBan, String newNIN, String newDepartment, int newSalary,
                              String newCV, String newImageURL)
    {
        super(employeeID, newFName, newLName, newCity, newPostcode,
                newStreetAddr, newSortCode, newBan, newNIN, newDepartment, newSalary);

        setCv(newCV);
        setImageURL(newImageURL);
    }

    public String getCv() {
        return cv;

    }

    public void setCv(String newCV) {
        this.cv = newCV;
    }

    public String getImageURL() {
        return image;
    }

    public void setImageURL(String newImageURL) {
        this.image = image;
    }


}
