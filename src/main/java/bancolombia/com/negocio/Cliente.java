package bancolombia.com.negocio;

import bancolombia.com.negocio.Domicilio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente implements Comparable<Cliente> {

    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private LocalDate fechaNacimiento;

    public Cliente(int numero, String nombre, Domicilio domicilio , String rfc, String telefono, LocalDate fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentas = new ArrayList<>();
    }

    public Cliente(int numero, String nombre, String calle, int numeroDomicilio, String colonia, String estado, int codigoPostal, String rfc, String telefono, LocalDate fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio =  new Domicilio(calle, numeroDomicilio, colonia, estado, codigoPostal);
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cuentas=" + cuentas +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cliente cliente) {
        return ((Integer)this.getNumero()).compareTo((Integer)cliente.getNumero());// -1 0 +1
    }
}
