package com.example.recyclerviewdemo;

public class ModelUser {
    private String name, phn, dob;

    public ModelUser(String name, String phn, String dob) {
        this.name = name;
        this.phn = phn;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
