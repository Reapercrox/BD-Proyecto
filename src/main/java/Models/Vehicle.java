/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author memis
 */
public class Vehicle {
    
    private int seat_quantity;
    private String brand;
    private String car_model;
    private String color;
    private String plate_number;

    public Vehicle(int seat_quantity, String brand, String car_model, String color, String plate_number) {
        this.seat_quantity = seat_quantity;
        this.brand = brand;
        this.car_model = car_model;
        this.color = color;
        this.plate_number = plate_number;
    }

    public int getSeat_quantity() {
        return seat_quantity;
    }

    public void setSeat_quantity(int seat_quantity) {
        this.seat_quantity = seat_quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate_number() {
        return plate_number;
    }

    public void setPlate_number(String plate_number) {
        this.plate_number = plate_number;
    }
    
    
    
}
