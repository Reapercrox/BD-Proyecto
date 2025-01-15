/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

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
    private String gender;
    private String institution;
    private String password;
    private String country;
    private String province;
    private String district;
    private String municipality;
    private String address;
    private String picture;/*Still thinking how to handle this*/
    private String driver_or_passenger;
    private String type_id;
    private String id_number;
    private String accepts_tANDc;
    
    public Person(String name, String second_name, String last_name, String second_last_name, String birth_day, String gender, 
                  String institution, String email, String password, String country, String province, String municipality,
                  String district, String address, String d_or_p, String type_id, String id_number, String accepts){
        
        this.first_name = name;
        this.second_name = second_name;
        this.last_name = last_name;
        this.second_last_name = second_last_name;
        this.birthday = birth_day;
        this.gender = gender;
        this.institution = institution;
        this.institutional_email = email;
        this.password = password;
        this.country = country;
        this.province = province;
        this.municipality = municipality;
        this.district = district;
        this.address = address;
        this.driver_or_passenger = d_or_p;
        this.type_id = type_id;
        this.id_number = id_number;
        this.accepts_tANDc = accepts;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
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

    public String getDriver_or_passenger() {
        return driver_or_passenger;
    }

    public void setDriver_or_passenger(String driver_or_passenger) {
        this.driver_or_passenger = driver_or_passenger;
    }

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getAccepts_tANDc() {
        return accepts_tANDc;
    }

    public void setAccepts_tANDc(String accepts_tANDc) {
        this.accepts_tANDc = accepts_tANDc;
    }
    
    
}
