/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Constants.Response_code;
import Database.Database_connection;
import Models.Person;
import Models.Response;
import Models.Vehicle;

/**
 *
 * @author memis
 */
public class Controller {
    
    public static Response register_person(Person person){
        Response response = Data_validator.validate_person(person);
        if (response.getResponse_code() != Response_code.SUCCESS){
            return response;
        }       
        return Database_connection.insertPerson(person);
    }
    
    public static Response login_user(String username, String password){
        Response response = Data_validator.validate_login(username, password);
        if(response.getResponse_code() != Response_code.SUCCESS){
            return response;
        }
        return Database_connection.checkLogin(username, password);
    }
    
    public static Response register_vehicle(Vehicle vehicle){
        Response response = Data_validator.validate_vehicle(vehicle);
        if(response.getResponse_code() != Response_code.SUCCESS){
            return response;
        }
        return Database_connection.insertVehicle(vehicle);
    }
    
    public static Response log_out(){
        return Database_connection.logOut();
    }
    
}
