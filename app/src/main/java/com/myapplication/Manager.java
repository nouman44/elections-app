package com.myapplication;

import java.util.List;

public class Manager {


    String silsilaNumber;
    String gharanaNumber;
    String name ;
    String fatherName;
    int age ;
    String address ;
    String blockCode;
    String phoneNo ;
    String cnic ;
    int serialNo;
    List<Tiger> voters;

    public Manager(){

    }

    public Manager(String silsilaNumber, String gharanaNumber, String name, String fatherName, int age, String address, String blockCode, String phoneNo, String cnic, int serialNo, List<Tiger> voters) {
        this.silsilaNumber = silsilaNumber;
        this.gharanaNumber = gharanaNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
        this.address = address;
        this.blockCode = blockCode;
        this.phoneNo = phoneNo;
        this.cnic = cnic;
        this.serialNo = serialNo;
        this.voters = voters;
    }

    public String getSilsilaNumber() {
        return silsilaNumber;
    }

    public void setSilsilaNumber(String silsilaNumber) {
        this.silsilaNumber = silsilaNumber;
    }

    public String getGharanaNumber() {
        return gharanaNumber;
    }

    public void setGharanaNumber(String gharanaNumber) {
        this.gharanaNumber = gharanaNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public List<Tiger> getVoters() {
        return voters;
    }

    public void setVoters(List<Tiger> voters) {
        this.voters = voters;
    }
}
