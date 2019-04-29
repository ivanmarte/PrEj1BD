package ejbd;

import java.sql.SQLException;

public class EjConexionBD {

    /**
     * @param args
     */
    public static void main(String[] args) {
        BeanDAO beanDAO = new BeanDAOImpl("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/","test","root","alumno.R11m");
        try {
            beanDAO.getConexion();
            System.out.println("La conexión se ha creado correctamente.");
            try {
                beanDAO.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException sqle) {
                System.out.println("Problemas al cerrar la conexión");
                sqle.printStackTrace();
            }

        } catch (SQLException sqle) {
            System.out.println("Problema al crear la conexión");
            sqle.printStackTrace();
        }
    }

}
