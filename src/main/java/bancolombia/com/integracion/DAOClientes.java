package bancolombia.com.integracion;
import bancolombia.com.negocio.Cliente;
import bancolombia.com.negocio.ServicioClientes;

import java.sql.*;
import java.util.ArrayList;

public class DAOClientes implements ServicioClientes {
    private String url="jdbc:mysql://localhost:3306/banca";
    private String usuario="root";
    private String password="abc123";

    private DriverManager driver;

    private Connection conexion;
    private Statement sentencia;
    private String sql;
    private ResultSet resultado;
    private int renglones;


    public DAOClientes() {
         url="jdbc:mysql://localhost:3306/banca";
         usuario="root";
         password="abc123";
        try {
            this.conexion = DriverManager.getConnection(url,usuario,password);
            this.sentencia = this.conexion.createStatement();
            System.out.println("Se conecto de manera exitosa a la Banca");
        } catch (SQLException e) {
            System.out.println("Hubo un problema de conexion con la BD:"+e.getMessage());
        }
    }

    public DAOClientes(String url, String usuario, String password) {
        this.url = url;
        this.usuario = usuario;
        this.password = password;
        try {
            this.conexion = DriverManager.getConnection(url,usuario,password);
            sentencia = this.conexion.createStatement();
            System.out.println("Se conecto de manera exitosa a la Banca");
        } catch (SQLException e) {
            System.out.println("Hubo un problema de conexion con la BD:"+e.getMessage());
        }

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        sql="INSERT INTO CLIENTES (numero,nombre,domicilio) VALUES ("+cliente.getNumero()+",'"+cliente.getNombre()+"','"+cliente.getDomicilio().getEstado()+"');";
//        System.out.println("SQL: "+sql);
        try {
            int renglones = sentencia.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Hubo problemas al agregar al Cliente");
            System.out.println("Excepcion: "+e.getMessage());
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        return false;
    }

    @Override
    public Cliente consultarCliente(int numero) {
        return null;
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return null;
    }

    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        return null;
    }

    @Override
    public void listarClientes() {
        sql="SELECT * FROM CLIENTES;";
        try {
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                System.out.println("Id: "+resultado.getInt("numero"));
                System.out.println("Nombre: "+ resultado.getString("nombre"));
                System.out.println("Domicilio: "+resultado.getString("domicilio"));
            }
        } catch (SQLException e) {
            System.out.println("Se genero una excepcion al hacer el SELECT");
            System.out.println("Mensaje: "+e.getMessage());
        }

    }

    public void cerrarConexion(){

    }
}
