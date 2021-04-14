package com.example.delivery.model;

public class Vehicle {
    private int id;
    private String vehicleDescription;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleMileage;
    private String vehicleColor;
    private Boolean vehicleInsured;
    private String vehicleInsuranceNumber;
    private Boolean vehicleRegistered;
    private String vehicleRegistrationNumber;
    private String vehicleVINNumber;
    private String vehicleLicencePlateNumber;
    private String vehicleDriverName;
    private int vehicleCylinderCount;
    private String vehicleWheelSize;
    private String vehicleGasTankSize;
    private Boolean vehicleALockBreaks;


    public Vehicle(int id, String vehicleDescription, String vehicleMake, String vehicleModel,
                   String vehicleMileage, String vehicleColor, Boolean vehicleInsured,
                   String vehicleInsuranceNumber, Boolean vehicleRegistered, String vehicleRegistrationNumber,
                   String vehicleVINNumber, String vehicleLicencePlateNumber, String vehicleDriverName,
                   int vehicleCylinderCount, String vehicleWheelSize, String vehicleGasTankSize, Boolean vehicleALockBreaks) {
        this.id = id;
        this.vehicleDescription = vehicleDescription;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleMileage = vehicleMileage;
        this.vehicleColor = vehicleColor;
        this.vehicleInsured = vehicleInsured;
        this.vehicleInsuranceNumber = vehicleInsuranceNumber;
        this.vehicleRegistered = vehicleRegistered;
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
        this.vehicleVINNumber = vehicleVINNumber;
        this.vehicleLicencePlateNumber = vehicleLicencePlateNumber;
        this.vehicleDriverName = vehicleDriverName;
        this.vehicleCylinderCount = vehicleCylinderCount;
        this.vehicleWheelSize = vehicleWheelSize;
        this.vehicleGasTankSize = vehicleGasTankSize;
        this.vehicleALockBreaks = vehicleALockBreaks;
    }

    public Vehicle(String vehicleDescription, String vehicleMake, String vehicleModel,
                   String vehicleMileage, String vehicleColor, Boolean vehicleInsured,
                   String vehicleInsuranceNumber, Boolean vehicleRegistered,
                   String vehicleRegistrationNumber, String vehicleVINNumber,
                   String vehicleLicencePlateNumber, String vehicleDriverName,
                   int vehicleCylinderCount, String vehicleWheelSize, String vehicleGasTankSize,
                   Boolean vehicleALockBreaks) {
        this.vehicleDescription = vehicleDescription;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleMileage = vehicleMileage;
        this.vehicleColor = vehicleColor;
        this.vehicleInsured = vehicleInsured;
        this.vehicleInsuranceNumber = vehicleInsuranceNumber;
        this.vehicleRegistered = vehicleRegistered;
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
        this.vehicleVINNumber = vehicleVINNumber;
        this.vehicleLicencePlateNumber = vehicleLicencePlateNumber;
        this.vehicleDriverName = vehicleDriverName;
        this.vehicleCylinderCount = vehicleCylinderCount;
        this.vehicleWheelSize = vehicleWheelSize;
        this.vehicleGasTankSize = vehicleGasTankSize;
        this.vehicleALockBreaks = vehicleALockBreaks;
    }

    public Vehicle() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleMileage() {
        return vehicleMileage;
    }

    public void setVehicleMileage(String vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public Boolean getVehicleInsured() {
        return vehicleInsured;
    }

    public void setVehicleInsured(Boolean vehicleInsured) {
        this.vehicleInsured = vehicleInsured;
    }

    public String getVehicleInsuranceNumber() {
        return vehicleInsuranceNumber;
    }

    public void setVehicleInsuranceNumber(String vehicleInsuranceNumber) {
        this.vehicleInsuranceNumber = vehicleInsuranceNumber;
    }

    public Boolean getVehicleRegistered() {
        return vehicleRegistered;
    }

    public void setVehicleRegistered(Boolean vehicleRegistered) {
        this.vehicleRegistered = vehicleRegistered;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }

    public String getVehicleVINNumber() {
        return vehicleVINNumber;
    }

    public void setVehicleVINNumber(String vehicleVINNumber) {
        this.vehicleVINNumber = vehicleVINNumber;
    }

    public String getVehicleLicencePlateNumber() {
        return vehicleLicencePlateNumber;
    }

    public void setVehicleLicencePlateNumber(String vehicleLicencePlateNumber) {
        this.vehicleLicencePlateNumber = vehicleLicencePlateNumber;
    }

    public String getVehicleDriverName() {
        return vehicleDriverName;
    }

    public void setVehicleDriverName(String vehicleDriverName) {
        this.vehicleDriverName = vehicleDriverName;
    }

    public int getVehicleCylinderCount() {
        return vehicleCylinderCount;
    }

    public void setVehicleCylinderCount(int vehicleCylinderCount) {
        this.vehicleCylinderCount = vehicleCylinderCount;
    }

    public String getVehicleWheelSize() {
        return vehicleWheelSize;
    }

    public void setVehicleWheelSize(String vehicleWheelSize) {
        this.vehicleWheelSize = vehicleWheelSize;
    }

    public String getVehicleGasTankSize() {
        return vehicleGasTankSize;
    }

    public void setVehicleGasTankSize(String vehicleGasTankSize) {
        this.vehicleGasTankSize = vehicleGasTankSize;
    }

    public Boolean getVehicleALockBreaks() {
        return vehicleALockBreaks;
    }

    public void setVehicleALockBreaks(Boolean vehicleALockBreaks) {
        this.vehicleALockBreaks = vehicleALockBreaks;
    }
}