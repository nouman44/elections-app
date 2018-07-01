package com.myapplication;

public class ChartRow {
    String silsillahNumber, ghaaranaNumber, name, fathersName, cnic, age, address, blockCode, phoneNumber, voteCasted;

    public ChartRow(String silsillahNumber, String ghaaranaNumber, String name, String fathersName, String cnic, String age, String address, String blockCode, String phoneNumber, String voteCasted) {
        this.silsillahNumber = silsillahNumber;
        this.ghaaranaNumber = ghaaranaNumber;
        this.name = name;
        this.fathersName = fathersName;
        this.cnic = cnic;
        this.age = age;
        this.address = address;
        this.blockCode = blockCode;
        this.phoneNumber = phoneNumber;
        this.voteCasted = voteCasted;
    }

    public String getSilsillahNumber() {
        return silsillahNumber;
    }

    public void setSilsillahNumber(String silsillahNumber) {
        this.silsillahNumber = silsillahNumber;
    }

    public String getGhaaranaNumber() {
        return ghaaranaNumber;
    }

    public void setGhaaranaNumber(String ghaaranaNumber) {
        this.ghaaranaNumber = ghaaranaNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVoteCasted() {
        return voteCasted;
    }

    public void setVoteCasted(String voteCasted) {
        this.voteCasted = voteCasted;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
