package com.example.sparewheels;

public class UserHelper {

    String name, mobilenumber, aadharnumber, drivinglicence, pancardnumber, location;

    public UserHelper() {

    }

    public UserHelper(String name, String mobilenumber, String aadharnumber, String drivinglicence, String pancardnumber, String location) {
        this.name = name;
        this.mobilenumber = mobilenumber;
        this.aadharnumber = aadharnumber;
        this.drivinglicence = drivinglicence;
        this.pancardnumber = pancardnumber;
        this.location = location;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getAadharnumber() {
        return aadharnumber;
    }

    public void setAadharnumber(String aadharnumber) {
        this.aadharnumber = aadharnumber;
    }

    public String getDrivinglicence() {
        return drivinglicence;
    }

    public void setDrivinglicence(String drivinglicence) {
        this.drivinglicence = drivinglicence;
    }

    public String getPancardnumber() {
        return pancardnumber;
    }

    public void setPancardnumber(String pancardnumber) {
        this.pancardnumber = pancardnumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}