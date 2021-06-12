package com.example.travelagency.form;

public class ClientForm {

    private Integer code;
    private String firstname;
    private String lastname;
    private String fathersname;
    private String address;
    private String fonenumber;

    public ClientForm() {
    }

    public ClientForm(Integer code, String firstname, String lastname, String fathersname, String address, String fonenumber) {
        this.code = code;
        this.firstname = firstname;
        this.lastname = lastname;
        this.fathersname = fathersname;
        this.address = address;
        this.fonenumber = fonenumber;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFathersname() {
        return fathersname;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFonenumber() {
        return fonenumber;
    }

    public void setFonenumber(String fonenumber) {
        this.fonenumber = fonenumber;
    }

    @Override
    public String toString() {
        return "RoomForm{" +
                "code=" + code +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", fathersname='" + fathersname + '\'' +
                ", address='" + address + '\'' +
                ", fonenumber='" + fonenumber + '\'' +
                '}';
    }
}
