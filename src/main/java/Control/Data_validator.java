/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Constants.Response_code;
import Models.Person;
import Models.Response;
import Models.Vehicle;

/**
 *
 * @author memis
 */
public class Data_validator {
    private static boolean is_text_valid(String text){
        return !(text.isEmpty() || text.isBlank());
    }
    
    /**
     * Valida un objeto persona.
     * @param person
     * @return 
     */
    public static Response validate_person(Person person){
        
        // Se verifica que el nombre no este vacío.
        if (!Data_validator.is_text_valid(person.getFirst_name())){
            return new Response(Response_code.ERROR, "Error, must input a first name.");
        }
        
        if (!Data_validator.is_text_valid(person.getSecond_name())){
            return new Response(Response_code.ERROR, "Error, must input a second name.");
        }
        
        if (!Data_validator.is_text_valid(person.getSecond_last_name())){
            return new Response(Response_code.ERROR, "Error, must input a second last name.");
        }
        
        if (!Data_validator.is_text_valid(person.getBirthday())){
            return new Response(Response_code.ERROR, "Error, must input a birthday.");
        }
        
        if (!Data_validator.is_text_valid(person.getLast_name())){
            return new Response(Response_code.ERROR, "Error, must input a last name.");
        }
        
        if (!Data_validator.is_text_valid(person.getInstitutional_email())){
            return new Response(Response_code.ERROR, "Error, must input an institutional e-mail.");
        }
        
        if (!Data_validator.is_text_valid(person.getId_number())){
            return new Response(Response_code.ERROR, "Error, must input an id_number.");
        }
        
        if (!Data_validator.is_text_valid(person.getMunicipality())){
            return new Response(Response_code.ERROR, "Error, must choose a municipality.");
        }
        
        if (!Data_validator.is_text_valid(person.getDistrict())){
            return new Response(Response_code.ERROR, "Error, must input a district.");
        }
        
        if (!Data_validator.is_text_valid(person.getPassword())){
            return new Response(Response_code.ERROR, "Error, must input a password.");
        }
        
        return new Response(Response_code.SUCCESS);
    }
    
    public static Response validate_login(String username, String password){
        if (!Data_validator.is_text_valid(username)){
            return new Response(Response_code.ERROR, "Error, must input a valid username.");
        }
        
        if(!username.contains("@")){
            return new Response(Response_code.ERROR, "Error, must input a valid e-mail.");
        }
        
        if(!Data_validator.is_text_valid(password)){
            return new Response(Response_code.ERROR, "Error, must input a valid password.");
        }
        
        return new Response(Response_code.SUCCESS);
    }
    
    public static Response validate_vehicle(Vehicle vehicle){
        if (!Data_validator.is_text_valid(vehicle.getBrand())){
            return new Response(Response_code.ERROR, "Error, must input a valid brand.");
        }
        
        if(!Data_validator.is_text_valid(vehicle.getCar_model())){
            return new Response(Response_code.ERROR, "Error, must input a valid model.");
        }
        
        if(!Data_validator.is_text_valid(vehicle.getPlate_number())){
            return new Response(Response_code.ERROR, "Error, must input a valid plate.");
        }
        
        if(vehicle.getSeat_quantity() < 0 ){
            return new Response(Response_code.ERROR, "Error, must input a valid seat quantity.");
        }
        
        if(vehicle.getPlate_number().length() != 6){
            return new Response(Response_code.ERROR, "Error, must input a valid plate.");
        }
        
        return new Response(Response_code.SUCCESS);
    }
}
