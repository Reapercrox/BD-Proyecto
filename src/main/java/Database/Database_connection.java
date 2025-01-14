package Database;

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
}
