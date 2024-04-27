package com.Trani8.BackendAssignment.model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class Address {
    @NotEmpty(message = "Detailed address is required")
    private String detailedAddress;

    @NotEmpty(message = "City is required")
    private String city;

    @NotEmpty(message = "State is required")
    private String state;

    @Pattern(regexp = "\\d{6}", message = "Pincode must be a 6-digit number")
    private String pincode;

    // Getters and setters

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
