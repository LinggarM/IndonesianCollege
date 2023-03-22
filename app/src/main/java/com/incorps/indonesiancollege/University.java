package com.incorps.indonesiancollege;

public class University {
    private String name;
    private int logo;
    private String desc;
    private String faculty;
    private String address;
    private String website;

    public University(String name, int logo, String desc, String faculty, String address, String website) {
        this.name = name;
        this.logo = logo;
        this.desc = desc;
        this.faculty = faculty;
        this.address = address;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
