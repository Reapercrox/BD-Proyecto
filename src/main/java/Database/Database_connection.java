package Database;

import Constants.Response_code;
import Models.Person;
import Models.Response;
import Models.Route;
import Models.Vehicle;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.internal.OracleTypes;

public class Database_connection {


    private static Connection getConnection() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:BDProyecto", "ADM", "ADM");
        } catch (SQLException e) {
            return null;
        }
    }


    private static CallableStatement insertData(CallableStatement call) {
        try {
            call.executeUpdate();
            return call;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } 
    }

    private static CallableStatement queryData(CallableStatement call) {
        try {
            call.execute();
            return call;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } 
    }
    
        private static CallableStatement checkData(CallableStatement call) {
        try {
            call.execute();
            return call;
        } catch (SQLException e) {
            return null;
        } 
    }
    
    public static Response insertPerson(Person person){

        String statement = "{call insert_new_person(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            

            CallableStatement call = DBconnection.prepareCall(statement);

            call.setString(1, person.getFirst_name());
            call.setString(2, person.getSecond_name());
            call.setString(3,person.getLast_name());
            call.setString(4, person.getSecond_last_name());
            call.setString(5, person.getBirthday());
            call.setString(6, person.getInstitutional_email());
            call.setString(7, person.getPassword());
            call.setInt(8,person.getAccepts_tANDc());
            call.setInt(9,person.getGender());
            call.setInt(10, person.getInstitution());
            call.setInt(11,person.getType_id());
            call.setString(12,person.getId_number());
            call.setInt(13, 0);
            call.setInt(14, person.getCountry());
            call.setInt(15, person.getProvince());
            call.setString(16, person.getMunicipality());
            call.setString(17, person.getDistrict());
            call.setString(18, person.getAddress());
            call.setString(19, person.getZip_code());
            call.setInt(20, person.getDriver_or_passenger());
            call.setString(21, person.getDriver_license());
            call.setString(22, person.getExpiration_date());

            call.registerOutParameter(23, java.sql.Types.NUMERIC);

            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }

            int result_code = call.getInt(23);
            

            call.getConnection().close();
            call.close();
            

            if (result_code != 0){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            return new Response(Response_code.SUCCESS, "Person successfully registered.");
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
        
        
    public static Response checkLogin(String u_email, String password){

        String statement = "{call check_login(?,?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            
            CallableStatement call = DBconnection.prepareCall(statement);

            call.setString(1, u_email);
            call.setString(2, password);

            call.registerOutParameter(3, java.sql.Types.NUMERIC);
            call.registerOutParameter(4, java.sql.Types.NVARCHAR);
            

            call = checkData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            

            int result_code = call.getInt(3);
            int result_code_error = call.getInt(4);
            
 
            call.getConnection().close();
            call.close();
            

            if (result_code_error != 0){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            return new Response(Response_code.SUCCESS, "Valid user.", result_code);
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
    
    public static Response insertVehicle(Vehicle vehicle){

        String statement = "{call insert_vehicle(?,?,?,?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            

            CallableStatement call = DBconnection.prepareCall(statement);

            call.setInt(1, vehicle.getSeat_quantity());
            call.setString(2, vehicle.getBrand());
            call.setString(3,vehicle.getCar_model());
            call.setString(4, vehicle.getColor());
            call.setString(5, vehicle.getPlate_number());


            call.registerOutParameter(6, java.sql.Types.NUMERIC);

            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            

            int result_code = call.getInt(6);
            

            call.getConnection().close();
            call.close();
            

            if (result_code != 1){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            return new Response(Response_code.SUCCESS, "Vehicle registered successful.");
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
    
    public static Response logOut(){

        String statement = "{call log_out}";
        Connection DBconnection = getConnection();
        try {
            

            CallableStatement call = DBconnection.prepareCall(statement);

            
            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            

            call.getConnection().close();
            call.close();
            

            return new Response(Response_code.SUCCESS, "Log out.");
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
    
    public static int get_vehicle_count(){

        String statement = "{call ADM.get_vehicle_count(?)}";
        Connection DBconnection = getConnection();
        try {
            CallableStatement call = DBconnection.prepareCall(statement); 

            call.registerOutParameter(1, java.sql.Types.NUMERIC);
            call = queryData(call);
            int count = call.getInt(1);
            call.getConnection().close();
            call.close();
            return count;
        } catch (SQLException e){
            e.printStackTrace();
            return 0;
        }
    }
    
    
    public static Response get_vehicle(int first_row, int last_row){
        String statement = "{call get_vehicle(?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            CallableStatement call = DBconnection.prepareCall(statement);
            call.setInt(1, first_row);
            call.setInt(2, last_row);
            call.registerOutParameter(3, OracleTypes.CURSOR);
            
            call = queryData(call);
            

            ResultSet resultSet = (ResultSet) call.getObject(3);
            ArrayList<String> result = new ArrayList<>();
            while (resultSet.next()) {
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    result.add(resultSet.getString(i));
                }
            }
            

            resultSet.close();
            call.getConnection().close();
            call.close();
            
            return new Response(Response_code.SUCCESS, "", result);    
        }
        catch (SQLException e){
            e.printStackTrace();
            return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
        }
    }
    
    public static Response insert_route(Route route){
        String statement = "{call insert_route_data(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            

            CallableStatement call = DBconnection.prepareCall(statement);

            call.setString(1, route.getDate());
            call.setTimestamp(2, route.getStart_time());
            call.setTimestamp(3, route.getEnd_time());
            call.setInt(4, route.getAvailable_space());
            call.setString(5, route.getType_payment());
            call.setString(6, route.getPayment_amount());
            call.setString(7, route.getStart_location());
            call.setString(8,route.getRoad_name());
            call.setString(9,route.getRelevant_location_1());
            call.setString(10, route.getRelevant_location_2());
            call.setString(11, route.getEnd_location());
            call.setString(12, route.getPlate_number());

            call.registerOutParameter(13, java.sql.Types.NUMERIC);
            

            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }

            int result_code = call.getInt(13);
            

            call.getConnection().close();
            call.close();
            

            if (result_code != 0){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            return new Response(Response_code.SUCCESS, "Route successfully registered.");
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
    
    
    public static int get_routes_count(){

        String statement = "{call ADM.get_routes_count(?)}";
        Connection DBconnection = getConnection();
        try {
            CallableStatement call = DBconnection.prepareCall(statement); 

            call.registerOutParameter(1, java.sql.Types.NUMERIC);
            call = queryData(call);
            int count = call.getInt(1);
            call.getConnection().close();
            call.close();
            return count;
        } catch (SQLException e){
            e.printStackTrace();
            return 0;
        }
    }
    
    
    public static Response get_route(int first_row, int last_row){
        String statement = "{call available_routes(?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            CallableStatement call = DBconnection.prepareCall(statement);
            call.setInt(1, first_row);
            call.setInt(2, last_row);
            call.registerOutParameter(3, OracleTypes.CURSOR);
            
            call = queryData(call);
            

            ResultSet resultSet = (ResultSet) call.getObject(3);
            ArrayList<String> result = new ArrayList<>();
            while (resultSet.next()) {
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    result.add(resultSet.getString(i));
                }
            }

            resultSet.close();
            call.getConnection().close();
            call.close();
            
            return new Response(Response_code.SUCCESS, "", result);    
        }
        catch (SQLException e){
            e.printStackTrace();
            return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
        }
    }
    
    
    public static Response insert_booking(int id_route, int id_key, String comment){
        String statement = "{call insert_booking(?,?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            CallableStatement call = DBconnection.prepareCall(statement);
            call.setInt(1, id_route);
            call.setInt(2, id_key);
            call.setString(3, comment);
            call.registerOutParameter(4, java.sql.Types.NUMERIC);
            
            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            

            int result_code = call.getInt(4);
            
 
            call.getConnection().close();
            call.close();
            

            if (result_code != 0){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            return new Response(Response_code.SUCCESS, "Route successfully registered.");
        }
        catch (SQLException e){
            e.printStackTrace();
            return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
        }
    }
    
    
    
    
    public static Response get_t_c(){

        String statement = "{call get_t_c(?)}";
        Connection DBconnection = getConnection();
        try {
            CallableStatement call = DBconnection.prepareCall(statement);
            call.registerOutParameter(1,java.sql.Types.NVARCHAR );
            

            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            
            String t_c = call.getString(1);
            
            call.getConnection().close();
            call.close();
            

            return new Response(Response_code.SUCCESS, t_c);
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
    
}
