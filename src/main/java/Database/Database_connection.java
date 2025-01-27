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

    /**
     * Este método retorna un objeto de conexión a la base de datos. 
     * @return 
     */
    private static Connection getConnection() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            // Para el método getConnection del driver debe colocar el url la base de datos a la que se desea conectar,
            // el nombre del esquema que desea utilizar y la contraseña de dicho esquema.
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:BDProyecto", "ADM", "ADM");
        } catch (SQLException e) {
            return null;
        }
    }

    /**
     * Recibe una llamada parametrizada y la manda a ejecutar a la base de datos.
     * @param call
     * @return retorna el objeto de llamada.
     */
    private static CallableStatement insertData(CallableStatement call) {
        try {
            call.executeUpdate();
            return call;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } 
    }

    /**
     * Recibe una consulta parametrizada y la manda a ejecutar a la base de datos.
     * @param call
     * @return retorna el objeto de llamada.
     */
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
        // Para construir una llamada parametrizada, coloque el nombre del procedimiento
        // y entre los paréntesis van símbolos de pregunta '?', que son los parámetros del procedimiento.
        String statement = "{call insert_new_person(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            
            // Se crea una llamada parametrizada.
            CallableStatement call = DBconnection.prepareCall(statement);
            // Se insertan los parámetros en la llamada. Note que los símbolos de pregunta
            // están indexados (inician a partir de 1, no de 0). 
            // Tome en cuenta que los tipos de datos que inserte aquí, deben coincidir 
            // con los tipos de datos que recibe el procedimiento de la base de datos.
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
            // Los parámetros de salida son parametros que se pueden consultar en el objeto llamada
            // despues de ejecutar la llamada. Son útiles para retornar códigos de error o consultas.
            call.registerOutParameter(23, java.sql.Types.NUMERIC);
            
            // Se ejecuta la llamada.
            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            
            // Se obtiene el código de respuesta del procedimiento (para verificar si hubo algún error en la ejecución).
            // Este código lo puede utilizar para verificar que tipo de error hubo, y así poder generar un mensaje de error
            // claro para el usuario sobre el error que sucedió.
            int result_code = call.getInt(23);
            
            // Se cierra la conexión con la base de datos.
            // ES IMPORTANTE QUE SIEMPRE QUE SE ABRA UNA CONEXIÓN LA CIERRE, PUES ESTAS NO SE CIERRAN 
            // AUTOMÁTICAMENTE. 
            call.getConnection().close();
            call.close();
            
            // Se retorna el objeto respuesta.
            // Para esta prueba, el código de error 0 significa que no hubo errores.
            if (result_code != 0){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            return new Response(Response_code.SUCCESS, "Person successfully registered.");
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
        
        
    public static Response checkLogin(String u_email, String password){
        // Para construir una llamada parametrizada, coloque el nombre del procedimiento
        // y entre los paréntesis van símbolos de pregunta '?', que son los parámetros del procedimiento.
        String statement = "{call check_login(?,?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            
            // Se crea una llamada parametrizada.
            CallableStatement call = DBconnection.prepareCall(statement);
            // Se insertan los parámetros en la llamada. Note que los símbolos de pregunta
            // están indexados (inician a partir de 1, no de 0). 
            // Tome en cuenta que los tipos de datos que inserte aquí, deben coincidir 
            // con los tipos de datos que recibe el procedimiento de la base de datos.
            call.setString(1, u_email);
            call.setString(2, password);

            // Los parámetros de salida son parametros que se pueden consultar en el objeto llamada
            // despues de ejecutar la llamada. Son útiles para retornar códigos de error o consultas.
            call.registerOutParameter(3, java.sql.Types.NUMERIC);
            call.registerOutParameter(4, java.sql.Types.NVARCHAR);
            
            // Se ejecuta la llamada.
            call = checkData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            
            // Se obtiene el código de respuesta del procedimiento (para verificar si hubo algún error en la ejecución).
            // Este código lo puede utilizar para verificar que tipo de error hubo, y así poder generar un mensaje de error
            // claro para el usuario sobre el error que sucedió.
            int result_code = call.getInt(3);
            int result_code_error = call.getInt(4);
            
            // Se cierra la conexión con la base de datos.
            // ES IMPORTANTE QUE SIEMPRE QUE SE ABRA UNA CONEXIÓN LA CIERRE, PUES ESTAS NO SE CIERRAN 
            // AUTOMÁTICAMENTE. 
            call.getConnection().close();
            call.close();
            
            // Se retorna el objeto respuesta.
            // Para esta prueba, el código de error 0 significa que no hubo errores.
            if (result_code_error != 0){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            return new Response(Response_code.SUCCESS, "Valid user.", result_code);
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
    
    public static Response insertVehicle(Vehicle vehicle){
        // Para construir una llamada parametrizada, coloque el nombre del procedimiento
        // y entre los paréntesis van símbolos de pregunta '?', que son los parámetros del procedimiento.
        String statement = "{call insert_vehicle(?,?,?,?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            
            // Se crea una llamada parametrizada.
            CallableStatement call = DBconnection.prepareCall(statement);
            // Se insertan los parámetros en la llamada. Note que los símbolos de pregunta
            // están indexados (inician a partir de 1, no de 0). 
            // Tome en cuenta que los tipos de datos que inserte aquí, deben coincidir 
            // con los tipos de datos que recibe el procedimiento de la base de datos.
            call.setInt(1, vehicle.getSeat_quantity());
            call.setString(2, vehicle.getBrand());
            call.setString(3,vehicle.getCar_model());
            call.setString(4, vehicle.getColor());
            call.setString(5, vehicle.getPlate_number());

            // Los parámetros de salida son parametros que se pueden consultar en el objeto llamada
            // despues de ejecutar la llamada. Son útiles para retornar códigos de error o consultas.
            call.registerOutParameter(6, java.sql.Types.NUMERIC);
            
            // Se ejecuta la llamada.
            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            
            // Se obtiene el código de respuesta del procedimiento (para verificar si hubo algún error en la ejecución).
            // Este código lo puede utilizar para verificar que tipo de error hubo, y así poder generar un mensaje de error
            // claro para el usuario sobre el error que sucedió.
            int result_code = call.getInt(6);
            
            // Se cierra la conexión con la base de datos.
            // ES IMPORTANTE QUE SIEMPRE QUE SE ABRA UNA CONEXIÓN LA CIERRE, PUES ESTAS NO SE CIERRAN 
            // AUTOMÁTICAMENTE. 
            call.getConnection().close();
            call.close();
            
            // Se retorna el objeto respuesta.
            // Para esta prueba, el código de error 0 significa que no hubo errores.
            if (result_code != 1){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            return new Response(Response_code.SUCCESS, "Vehicle registered successful.");
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
    
    public static Response logOut(){
        // Para construir una llamada parametrizada, coloque el nombre del procedimiento
        // y entre los paréntesis van símbolos de pregunta '?', que son los parámetros del procedimiento.
        String statement = "{call log_out}";
        Connection DBconnection = getConnection();
        try {
            
            // Se crea una llamada parametrizada.
            CallableStatement call = DBconnection.prepareCall(statement);
            // Se insertan los parámetros en la llamada. Note que los símbolos de pregunta
            // están indexados (inician a partir de 1, no de 0). 
            // Tome en cuenta que los tipos de datos que inserte aquí, deben coincidir 
            // con los tipos de datos que recibe el procedimiento de la base de datos.

            // Los parámetros de salida son parametros que se pueden consultar en el objeto llamada
            // despues de ejecutar la llamada. Son útiles para retornar códigos de error o consultas.
            
            // Se ejecuta la llamada.
            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            
            // Se obtiene el código de respuesta del procedimiento (para verificar si hubo algún error en la ejecución).
            // Este código lo puede utilizar para verificar que tipo de error hubo, y así poder generar un mensaje de error
            // claro para el usuario sobre el error que sucedió.
            
            // Se cierra la conexión con la base de datos.
            // ES IMPORTANTE QUE SIEMPRE QUE SE ABRA UNA CONEXIÓN LA CIERRE, PUES ESTAS NO SE CIERRAN 
            // AUTOMÁTICAMENTE. 
            call.getConnection().close();
            call.close();
            
            // Se retorna el objeto respuesta.
            // Para esta prueba, el código de error 0 significa que no hubo errores.
            return new Response(Response_code.SUCCESS, "Log out.");
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
    
    public static int get_vehicle_count(){
        // A diferencia de los métodos anteriores, en este se utiliza una función (no un procedimiento)
        // por lo que note la diferencia con respecto al statement.
        String statement = "{call ADM.get_vehicle_count(?)}";
        Connection DBconnection = getConnection();
        try {
            CallableStatement call = DBconnection.prepareCall(statement); 
            // El resultado que retorna la función se toma como parámetro de salida.
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
            
            // Cuando se obtiene un cursor de un parámetro de salida, el resultado del mismo
            // se puede almacenar en un objeto ResultSet, el cual se puede recorrer con un ciclo
            // para obtener los datos retornados por la consulta, y guardarlos, por ejemplo, en una lista.
            ResultSet resultSet = (ResultSet) call.getObject(3);
            ArrayList<String> result = new ArrayList<>();
            while (resultSet.next()) {
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    result.add(resultSet.getString(i));
                }
            }
            
            // NO OLVIDE CERRAR EL CURSOR Y LA CONEXIÓN.
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
            
            // Se crea una llamada parametrizada.
            CallableStatement call = DBconnection.prepareCall(statement);
            // Se insertan los parámetros en la llamada. Note que los símbolos de pregunta
            // están indexados (inician a partir de 1, no de 0). 
            // Tome en cuenta que los tipos de datos que inserte aquí, deben coincidir 
            // con los tipos de datos que recibe el procedimiento de la base de datos.
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

            // Los parámetros de salida son parametros que se pueden consultar en el objeto llamada
            // despues de ejecutar la llamada. Son útiles para retornar códigos de error o consultas.
            call.registerOutParameter(13, java.sql.Types.NUMERIC);
            
            // Se ejecuta la llamada.
            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            
            // Se obtiene el código de respuesta del procedimiento (para verificar si hubo algún error en la ejecución).
            // Este código lo puede utilizar para verificar que tipo de error hubo, y así poder generar un mensaje de error
            // claro para el usuario sobre el error que sucedió.
            int result_code = call.getInt(13);
            
            // Se cierra la conexión con la base de datos.
            // ES IMPORTANTE QUE SIEMPRE QUE SE ABRA UNA CONEXIÓN LA CIERRE, PUES ESTAS NO SE CIERRAN 
            // AUTOMÁTICAMENTE. 
            call.getConnection().close();
            call.close();
            
            // Se retorna el objeto respuesta.
            // Para esta prueba, el código de error 0 significa que no hubo errores.
            if (result_code != 0){
                return new Response(Response_code.ERROR, "Unexpected error happened, try again.");
            }
            return new Response(Response_code.SUCCESS, "Route successfully registered.");
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Unexpected error happened, try again." + e.getMessage());
        } 
    }
    
    
    public static int get_routes_count(){
        // A diferencia de los métodos anteriores, en este se utiliza una función (no un procedimiento)
        // por lo que note la diferencia con respecto al statement.
        String statement = "{call ADM.get_routes_count(?)}";
        Connection DBconnection = getConnection();
        try {
            CallableStatement call = DBconnection.prepareCall(statement); 
            // El resultado que retorna la función se toma como parámetro de salida.
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
            
            // Cuando se obtiene un cursor de un parámetro de salida, el resultado del mismo
            // se puede almacenar en un objeto ResultSet, el cual se puede recorrer con un ciclo
            // para obtener los datos retornados por la consulta, y guardarlos, por ejemplo, en una lista.
            ResultSet resultSet = (ResultSet) call.getObject(3);
            ArrayList<String> result = new ArrayList<>();
            while (resultSet.next()) {
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    result.add(resultSet.getString(i));
                }
            }
            
            // NO OLVIDE CERRAR EL CURSOR Y LA CONEXIÓN.
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
            
            // Se obtiene el código de respuesta del procedimiento (para verificar si hubo algún error en la ejecución).
            // Este código lo puede utilizar para verificar que tipo de error hubo, y así poder generar un mensaje de error
            // claro para el usuario sobre el error que sucedió.
            int result_code = call.getInt(4);
            
            // Se cierra la conexión con la base de datos.
            // ES IMPORTANTE QUE SIEMPRE QUE SE ABRA UNA CONEXIÓN LA CIERRE, PUES ESTAS NO SE CIERRAN 
            // AUTOMÁTICAMENTE. 
            call.getConnection().close();
            call.close();
            
            // Se retorna el objeto respuesta.
            // Para esta prueba, el código de error 0 significa que no hubo errores.
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
    
}
