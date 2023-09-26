package com.geekster.UserManagementSystem;

public class UMS {
    private Integer uId;
    private String uName;
    private String uUserName;
    private String uAddress;
    private String uPhoneNumber;

    public UMS(Integer uId, String uName, String uUserName, String uAddress, String uPhoneNumber) {
        this.uId = uId;
        this.uName = uName;
        this.uUserName = uUserName;
        this.uAddress = uAddress;
        this.uPhoneNumber = uPhoneNumber;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuUserName() {
        return uUserName;
    }

    public void setuUserName(String uUserName) {
        this.uUserName = uUserName;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getuPhoneNumber() {
        return uPhoneNumber;
    }

    public void setuPhoneNumber(String uPhoneNumber) {
        this.uPhoneNumber = uPhoneNumber;
    }
}
