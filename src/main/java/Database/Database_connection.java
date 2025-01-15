package Database;

import Constants.Response_code;
import Models.Person;
import Models.Response;
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
            return null;
        } 
    }
    
        public static Response insertPerson(Person person){
        // Para construir una llamada parametrizada, coloque el nombre del procedimiento
        // y entre los paréntesis van símbolos de pregunta '?', que son los parámetros del procedimiento.
        String statement = "{call insert_person(?,?,?)}";
        Connection DBconnection = getConnection();
        try {
            
            // Se crea una llamada parametrizada.
            CallableStatement call = DBconnection.prepareCall(statement);
            // Se insertan los parámetros en la llamada. Note que los símbolos de pregunta
            // están indexados (inician a partir de 1, no de 0). 
            // Tome en cuenta que los tipos de datos que inserte aquí, deben coincidir 
            // con los tipos de datos que recibe el procedimiento de la base de datos.
            call.setString(1, person.getFirst_name());
            call.setString(2, person.getLast_name());
            // Los parámetros de salida son parametros que se pueden consultar en el objeto llamada
            // despues de ejecutar la llamada. Son útiles para retornar códigos de error o consultas.
            call.registerOutParameter(3, java.sql.Types.NUMERIC);
            
            // Se ejecuta la llamada.
            call = insertData(call);
            
            if (call == null){
                return new Response(Response_code.ERROR, "Ocurrió un error inesperado, intente de nuevo.");
            }
            
            // Se obtiene el código de respuesta del procedimiento (para verificar si hubo algún error en la ejecución).
            // Este código lo puede utilizar para verificar que tipo de error hubo, y así poder generar un mensaje de error
            // claro para el usuario sobre el error que sucedió.
            int result_code = call.getInt(3);
            
            // Se cierra la conexión con la base de datos.
            // ES IMPORTANTE QUE SIEMPRE QUE SE ABRA UNA CONEXIÓN LA CIERRE, PUES ESTAS NO SE CIERRAN 
            // AUTOMÁTICAMENTE. 
            call.getConnection().close();
            call.close();
            
            // Se retorna el objeto respuesta.
            // Para esta prueba, el código de error 0 significa que no hubo errores.
            if (result_code != 0){
                return new Response(Response_code.ERROR, "Ocurrió un error inesperado, intente de nuevo.");
            }
            return new Response(Response_code.SUCCESS, "Persona registrada exitosamente.");
        } catch (SQLException e) {
            return new Response(Response_code.ERROR, "Ocurrió un error inesperado, intente de nuevo.");
        } 
    }
}
