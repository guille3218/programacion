import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    public void insertarCliente(Customer cliente){
        try{
            Connection con = ConexionBD.getConnection();

            con.setAutoCommit(false);

            String sql = "insert into customers values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1,cliente.getCustomerNumber());
            pstm.setString(2,cliente.getCustomerName());
            pstm.setString(3,cliente.getContactLastName());
            pstm.setString(4,cliente.getContactFirstName());
            pstm.setString(5,cliente.getPhone());
            pstm.setString(6,cliente.getAddressLine1());
            pstm.setString(7,cliente.getAddressLine2());
            pstm.setString(8,cliente.getCity());
            pstm.setString(9,cliente.getState());
            pstm.setString(10,cliente.getPostalCode());
            pstm.setString(11,cliente.getCountry());
            pstm.setInt(12,cliente.getSalesRepEmployeeNumber());
            pstm.setDouble(13,cliente.getCreditLimit());

            int filasAfectadas = pstm.executeUpdate();
            System.out.println("Han sido afectadas "+filasAfectadas+" filas.");

            con.commit();
            System.out.println("Se ha introducido correctamente.");





        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
