/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author memis
 */
import java.time.*;
        
public class Route {
    
    private LocalTime start_time;
    private LocalTime end_time;
    private Duration estimated_duration;
    private String available_space;
    private String id_vehicle;
    private String type_payment;
    private String payment_amount;
    private String start_location;
    private String road_name;
    private String relevant_location_1;
    private String relevant_location_2;

    public Route(LocalTime start_time, LocalTime end_time, Duration estimated_duration, String available_space, String id_vehicle, String type_payment, String payment_amount, String start_location, String road_name, String relevant_location_1, String relevant_location_2) {
        this.start_time = start_time;
        this.end_time = end_time;
        this.estimated_duration = estimated_duration;
        this.available_space = available_space;
        this.id_vehicle = id_vehicle;
        this.type_payment = type_payment;
        this.payment_amount = payment_amount;
        this.start_location = start_location;
        this.road_name = road_name;
        this.relevant_location_1 = relevant_location_1;
        this.relevant_location_2 = relevant_location_2;
    }

    public LocalTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public LocalTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }

    public Duration getEstimated_duration() {
        return estimated_duration;
    }

    public void setEstimated_duration(Duration estimated_duration) {
        this.estimated_duration = estimated_duration;
    }

    public String getAvailable_space() {
        return available_space;
    }

    public void setAvailable_space(String available_space) {
        this.available_space = available_space;
    }

    public String getId_vehicle() {
        return id_vehicle;
    }

    public void setId_vehicle(String id_vehicle) {
        this.id_vehicle = id_vehicle;
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
