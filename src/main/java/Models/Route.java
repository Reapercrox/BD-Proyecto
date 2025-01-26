/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author memis
 */
import java.sql.Timestamp;
import java.time.*;
        
public class Route {
    
    private String date;
    private Timestamp start_time;
    private Timestamp end_time;
    private int available_space;
    private String type_payment;
    private String payment_amount;
    private String start_location;
    private String road_name;
    private String relevant_location_1;
    private String relevant_location_2;
    private String end_location;
    private String plate_number;

    public Route(String date, Timestamp start_time, Timestamp end_time, int available_space, String type_payment, String payment_amount, String start_location, String road_name, String relevant_location_1, String relevant_location_2, String end_location, String plate_number) {
        this.date = date;
        this.start_time = start_time;
        this.end_time = end_time;
        this.available_space = available_space;
        this.type_payment = type_payment;
        this.payment_amount = payment_amount;
        this.start_location = start_location;
        this.road_name = road_name;
        this.relevant_location_1 = relevant_location_1;
        this.relevant_location_2 = relevant_location_2;
        this.end_location = end_location;
        this.plate_number = plate_number;
    }

    public String getPlate_number() {
        return plate_number;
    }

    public void setPlate_number(String plate_number) {
        this.plate_number = plate_number;
    }


    


    public Timestamp getStart_time() {
        return start_time;
    }

    public void setStart_time(Timestamp start_time) {
        this.start_time = start_time;
    }

    public Timestamp getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Timestamp end_time) {
        this.end_time = end_time;
    }

    public int getAvailable_space() {
        return available_space;
    }

    public void setAvailable_space(int available_space) {
        this.available_space = available_space;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEnd_location() {
        return end_location;
    }

    public void setEnd_location(String end_location) {
        this.end_location = end_location;
    }

    public String getType_payment() {
        return type_payment;
    }

    public void setType_payment(String type_payment) {
        this.type_payment = type_payment;
    }

    public String getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(String payment_amount) {
        this.payment_amount = payment_amount;
    }

    public String getStart_location() {
        return start_location;
    }

    public void setStart_location(String start_location) {
        this.start_location = start_location;
    }

    public String getRoad_name() {
        return road_name;
    }

    public void setRoad_name(String road_name) {
        this.road_name = road_name;
    }

    public String getRelevant_location_1() {
        return relevant_location_1;
    }

    public void setRelevant_location_1(String relevant_location_1) {
        this.relevant_location_1 = relevant_location_1;
    }

    public String getRelevant_location_2() {
        return relevant_location_2;
    }

    public void setRelevant_location_2(String relevant_location_2) {
        this.relevant_location_2 = relevant_location_2;
    }
      
    
}
