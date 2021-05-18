import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Consultas {
    public ArrayList<Office> mostrarOficinas(){
        ArrayList<Office> oficinas = new ArrayList<>();
        try{
            Connection con = ConexionBD.getConnection();


            String sql = "select * from offices";
            PreparedStatement psmt = con.prepareStatement(sql);

            ResultSet rs = psmt.executeQuery();

            while(rs.next()){
                Office o = new Office(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
                        rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));

                oficinas.add(o);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }





        return oficinas;
    }
}
