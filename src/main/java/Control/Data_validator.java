/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Constants.Response_code;
import Models.Person;
import Models.Response;

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
            return new Response(Response_code.ERROR, "Error, debe ingresar el nombre.");
        }
        
        // Se verifica que el apellido no este vacío.
        if (!Data_validator.is_text_valid(person.getLast_name())){
            return new Response(Response_code.ERROR, "Error, debe ingresar el apellido.");
        }
        
        return new Response(Response_code.SUCCESS);
    }
}
