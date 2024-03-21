package bancolombia.com.negocio;

import java.util.ArrayList;

public class Banco implements ServicioClientes {
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes=new ArrayList<>();
    }

    public Banco(String nombre,String calle, int numero, String colonia, String estado, int codigoPostal, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = new Domicilio(calle, numero, colonia, estado, codigoPostal);
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clientes=" + clientes +
                '}';
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        Cliente cliente = consultarCliente(numero);
        if(cliente!=null){
            clientes.remove(cliente);
            System.out.println("Se dio de baja al cliente numero: "+numero);
            return true;
        }
        return false;
    }

    @Override
    public Cliente consultarCliente(int numero) {
        for(Cliente cliente:clientes){
            if(cliente.getNumero()==numero){
                System.out.println("Se encontro el cliente numero: "+numero);
                return cliente;
            }
        }
        System.out.println("No se encontro el cliente numero: "+numero);
        return null;
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }

    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        for(Cliente cliente:clientes){
            if(cliente.getRfc().equals(rfc)){
                System.out.println("Se encontro el cliente con rfc: "+rfc);
                return cliente;
            }
        }
        System.out.println("No se encontro el cliente con rfc: "+rfc);
        return null;
    }

    @Override
    public void listarClientes() {
        System.out.println("=".repeat(232));
//        for(Cliente c:clientes){
//            System.out.println(c);
//        }
        clientes.stream().forEach(System.out::println);
        System.out.println("=".repeat(232));
    }
}
