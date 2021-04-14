package com.example.delivery.model;

public class Drivers {
    private int id;
    private String driverFirstName;
    private String driverLastName;
    private String driverInsuranceNumber;
    private Boolean driverInsured;
    private String driverEmailAddress;
    private String driverAddress;
    private String driverPhoneNumber;
    private String driverSex;
    private int driverAge;
    private String driverYearsInsured;
    private String driverYearsDriving;
    private String driverLicenceNumber;
    private String driverCrashHistory;
    private String driverInfractions;

    public Drivers(int id, String driverFirstName, String driverLastName, String driverInsuranceNumber,
                   Boolean driverInsured, String driverEmailAddress, String driverAddress,
                   String driverPhoneNumber, String driverSex, int driverAge, String driverYearsInsured,
                   String driverYearsDriving, String driverLicenceNumber, String driverCrashHistory,
                   String driverInfractions) {
        this.id = id;
        this.driverFirstName = driverFirstName;
        this.driverLastName = driverLastName;
        this.driverInsuranceNumber = driverInsuranceNumber;
        this.driverInsured = driverInsured;
        this.driverEmailAddress = driverEmailAddress;
        this.driverAddress = driverAddress;
        this.driverPhoneNumber = driverPhoneNumber;
        this.driverSex = driverSex;
        this.driverAge = driverAge;
        this.driverYearsInsured = driverYearsInsured;
        this.driverYearsDriving = driverYearsDriving;
        this.driverLicenceNumber = driverLicenceNumber;
        this.driverCrashHistory = driverCrashHistory;
        this.driverInfractions = driverInfractions;
    }

    public Drivers(String driverFirstName, String driverLastName, String driverInsuranceNumber,
                   Boolean driverInsured, String driverEmailAddress, String driverAddress,
                   String driverPhoneNumber, String driverSex, int driverAge, String driverYearsInsured,
                   String driverYearsDriving, String driverLicenceNumber, String driverCrashHistory,
                   String driverInfractions) {
        this.driverFirstName = driverFirstName;
        this.driverLastName = driverLastName;
        this.driverInsuranceNumber = driverInsuranceNumber;
        this.driverInsured = driverInsured;
        this.driverEmailAddress = driverEmailAddress;
        this.driverAddress = driverAddress;
        this.driverPhoneNumber = driverPhoneNumber;
        this.driverSex = driverSex;
        this.driverAge = driverAge;
        this.driverYearsInsured = driverYearsInsured;
        this.driverYearsDriving = driverYearsDriving;
        this.driverLicenceNumber = driverLicenceNumber;
        this.driverCrashHistory = driverCrashHistory;
        this.driverInfractions = driverInfractions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriverFirstName() {
        return driverFirstName;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName; }

    public String getDriverLastName() {
        return driverLastName;
    }

    public void setDriverLastName(String driverLastName) {
        this.driverLastName = driverLastName;
    }

    public String getDriverInsuranceNumber() {
        return driverInsuranceNumber;
    }

    public void setDriverInsuranceNumber(String driverInsuranceNumber) {
        this.driverInsuranceNumber = driverInsuranceNumber; }

    public Boolean getDriverInsured() {
        return driverInsured;
    }

    public void setDriverInsured(Boolean driverInsured) {
        this.driverInsured = driverInsured;
    }

    public String getDriverEmailAddress() {
        return driverEmailAddress;
    }

    public void setDriverEmailAddress(String driverEmailAddress) {
        this.driverEmailAddress = driverEmailAddress; }

    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }

    public void setDriverPhoneNumber(String driverPhoneNumber) {
        this.driverPhoneNumber = driverPhoneNumber; }

    public String getDriverSex() {
        return driverSex;
    }

    public void setDriverSex(String driverSex) {
        this.driverSex = driverSex;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    public String getDriverYearsInsured() {
        return driverYearsInsured;
    }

    public void setDriverYearsInsured(String driverYearsInsured) {
        this.driverYearsInsured = driverYearsInsured; }

    public String getDriverYearsDriving() {
        return driverYearsDriving;
    }

    public void setDriverYearsDriving(String driverYearsDriving) {
        this.driverYearsDriving = driverYearsDriving; }

    public String getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber; }

    public String getDriverCrashHistory() {
        return driverCrashHistory;
    }

    public void setDriverCrashHistory(String driverCrashHistory) {
        this.driverCrashHistory = driverCrashHistory; }

    public String getDriverInfractions() {
        return driverInfractions;
    }

    public void setDriverInfractions(String driverInfractions) {
        this.driverInfractions = driverInfractions; }
}