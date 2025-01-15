/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import Constants.Response_code;

public class Response {
    
    private Response_code response_code;
    private String message;
    private Object response_content;

    public Response(Response_code response_code, String message, Object response_content) {
        this.response_code = response_code;
        this.message = message;
        this.response_content = response_content;
    }

    public Response(Response_code response_code, String message) {
        this.response_code = response_code;
        this.message = message;
    }
    
    public Response(Response_code response_code){
        this.response_code = response_code;
    }

    public Response_code getResponse_code() {
        return response_code;
    }

    public void setResponse_code(Response_code response_code) {
        this.response_code = response_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResponse_content() {
        return response_content;
    }

    public void setResponse_content(Object response_content) {
        this.response_content = response_content;
    }
    
}
