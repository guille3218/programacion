import com.google.gson.Gson;
import com.mysql.cj.xdevapi.Client;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Consultas c = new Consultas();

        ArrayList<Office> oficinas = c.mostrarOficinas();

        System.out.println(gson.toJson(oficinas));

        Transacciones t = new Transacciones();
        Customer customer = new Customer(3,"AAA","AAAA","AAAA","4235235","AAAAA",
                "AAAA","AAAAAAA","aAAA","4213","AAA",1102,2002.360);


        t.insertarCliente(customer);

    }

}
