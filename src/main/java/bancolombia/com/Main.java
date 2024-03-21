package bancolombia.com;

import bancolombia.com.integracion.DAOClientes;
import bancolombia.com.negocio.Banco;
import bancolombia.com.negocio.Cliente;
import bancolombia.com.negocio.ComparaNumero;
import bancolombia.com.negocio.ComparaRfc;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Banco bancoColombia = new Banco("bancoColombia","Madero",155,"Centro","CDMX",10010,"BCS032212","5510234589");
        System.out.println(bancoColombia);
        Cliente cliente1 = new Cliente(1000,"Fernando","Aldama",206,"Centro","Mexico",50000,"JAHF670223","7222142780", LocalDate.parse("1967-02-23"));
        Cliente cliente3 = new Cliente(2000,"Arturo","Morelos",500,"Independencia","Chihuahua",24500,"AARS690114","568213444",LocalDate.parse("1969-01-14"));
        Cliente cliente4 = new Cliente(7000,"Luz Maria","Juarez",1212,"ProHogar","Guerrero",32000,"MMLM801004","123412344",LocalDate.parse("1980-10-04"));
        Cliente cliente2 = new Cliente(5000,"Veronica","Duraznos",57,"Calvario","Yucatan",92000,"RESV900808","1234213445",LocalDate.parse("1990-08-08"));
//

        DAOClientes dao = new DAOClientes();
        dao.listarClientes();
        dao.agregarCliente(cliente3);
        dao.agregarCliente(cliente2);
        dao.agregarCliente(cliente4);
        dao.listarClientes();

// Crear las cuentas y hacer operaciones con las cuentas
//        Map<Integer,Cliente> mapa = new TreeMap<>();
//        mapa.put(cliente1.getNumero(),cliente1);
//        mapa.put(cliente3.getNumero(),cliente3);
//        mapa.put(cliente2.getNumero(),cliente2);
//        mapa.put(cliente4.getNumero(),cliente4);
//
//        Map<String,Cliente> mapa2 = new TreeMap<>();
//        mapa2.put(cliente1.getNombre(),cliente1);
//        mapa2.put(cliente3.getNombre(),cliente3);
//        mapa2.put(cliente2.getNombre(),cliente2);
//        mapa2.put(cliente4.getNombre(),cliente4);
//
//        System.out.println(mapa2);
//        for (Cliente c:mapa2.values()){
//            System.out.println(c);
//        }


//        ComparaNumero cn = new ComparaNumero();
//        ComparaRfc crfc = new ComparaRfc();
// //Clase anonima
//        Comparator<Cliente> ctel = new Comparator<Cliente>() {
//            @Override
//            public int compare(Cliente o1, Cliente o2) {
//                return o1.getTelefono().compareTo(o2.getTelefono());
//            }
//        };
//
//      //  System.out.println(cn.compare(cliente1,cliente2));
//
//        Set<Cliente> conjunto = new TreeSet<>(ctel);
//        conjunto.add(cliente4);
//        conjunto.add(cliente1);
//        conjunto.add(cliente2);
//        conjunto.add(cliente3);
//
//        for (Cliente c:conjunto){
//            System.out.println(c);
//        }
    }
}