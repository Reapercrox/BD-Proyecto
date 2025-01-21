/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.*;

/**
 *
 * @author memis
 */
public class Person {
    
    private String first_name;
    private String second_name;
    private String last_name;
    private String second_last_name;
    private String birthday;
    private String institutional_email;
    private String password;
    private int accepts_tANDc;
    private int gender;
    private int institution;
    private int type_id;
    private String id_number;
    private int carpoolApp;
    private int country;
    private int province;
    private String district;
    private String municipality;
    private String address;
    private String zip_code;
    private int driver_or_passenger;
    private String driver_license;
    private String expiration_date;

    public Person(String first_name, String second_name, String last_name, String second_last_name, String birthday, String institutional_email, String password, int accepts_tANDc, int gender, int institution, int type_id, String id_number, int carpoolApp, int country, int province, String district, String municipality, String address, String zip_code, int driver_or_passenger) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.last_name = last_name;
        this.second_last_name = second_last_name;
        this.birthday = birthday;
        this.institutional_email = institutional_email;
        this.password = password;
        this.accepts_tANDc = accepts_tANDc;
        this.gender = gender;
        this.institution = institution;
        this.type_id = type_id;
        this.id_number = id_number;
        this.carpoolApp = carpoolApp;
        this.country = country;
        this.province = province;
        this.district = district;
        this.municipality = municipality;
        this.address = address;
        this.zip_code = zip_code;
        this.driver_or_passenger = driver_or_passenger;
    }

    public Person(String first_name, String second_name, String last_name, String second_last_name, String birthday, String institutional_email, String password, int accepts_tANDc, int gender, int institution, int type_id, String id_number, int carpoolApp, int country, int province, String district, String municipality, String address, String zip_code, int driver_or_passenger, String driver_license, String expiration_date) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.last_name = last_name;
        this.second_last_name = second_last_name;
        this.birthday = birthday;
        this.institutional_email = institutional_email;
        this.password = password;
        this.accepts_tANDc = accepts_tANDc;
        this.gender = gender;
        this.institution = institution;
        this.type_id = type_id;
        this.id_number = id_number;
        this.carpoolApp = carpoolApp;
        this.country = country;
        this.province = province;
        this.district = district;
        this.municipality = municipality;
        this.address = address;
        this.zip_code = zip_code;
        this.driver_or_passenger = driver_or_passenger;
        this.driver_license = driver_license;
        this.expiration_date = expiration_date;
    }

        

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSecond_last_name() {
        return second_last_name;
    }

    public void setSecond_last_name(String second_last_name) {
        this.second_last_name = second_last_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getInstitutional_email() {
        return institutional_email;
    }

    public void setInstitutional_email(String institutional_email) {
        this.institutional_email = institutional_email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getInstitution() {
        return institution;
    }

    public void setInstitution(int institution) {
        this.institution = institution;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public int getDriver_or_passenger() {
        return driver_or_passenger;
    }

    public void setDriver_or_passenger(int driver_or_passenger) {
        this.driver_or_passenger = driver_or_passenger;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public int getAccepts_tANDc() {
        return accepts_tANDc;
    }

    public void setAccepts_tANDc(int accepts_tANDc) {
        this.accepts_tANDc = accepts_tANDc;
    }

    public String getDriver_license() {
        return driver_license;
    }

    public void setDriver_license(String driver_license) {
        this.driver_license = driver_license;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }
    

    
    
    
}
