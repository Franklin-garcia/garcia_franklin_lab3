/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garcia_franklin_lab3;

/**
 *
 * @author Franklin Garcia
 */
public class Jugador {
    //Nombre, apellido, edad, estado (libre, comprado), país de nacimiento, pie preferido,
    //numero (al inicio el numero será 0), precio, equipo (al principio será vacío
    private String nombre;
    private String apellido;
    private int edad;
    private String estado;
    private String pais;
    private String pie;
    private int numero;
    private int precio;
    private String equipo;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, int precio, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado = estado;
        this.pais = pais;
        this.pie = pie;
        this.numero = numero;
        this.precio = precio;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador" +"\n"+ "nombre=" + nombre+"\n" + ", apellido=" + apellido+"\n" + ", edad=" + edad +"\n"+ ", estado=" + estado +"\n"+ ", pais=" + pais +"\n"+ ", pie=" + pie +"\n"+ ", numero=" + numero +"\n"+ ", precio=" + precio +"\n"+ ", equipo=" + equipo + "\n";
    }
    
    
}
