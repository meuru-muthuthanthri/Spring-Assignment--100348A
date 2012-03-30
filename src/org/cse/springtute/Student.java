package org.cse.springtute;

public class Student {

    private String firstName;
    private String lastName;
    private long regNumber;
    private String address;
    private String gender;

    public String getAddress() {
        return address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }
}
