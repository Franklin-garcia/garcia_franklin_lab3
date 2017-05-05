/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garcia_franklin_lab3;

import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class Equipo {
   // Nombre, Palmares, Ciudad, Presupuesto y una lista de jugadores (inicialmente estará vacía).  
 private String nombre;
private int palmares;
private String ciudad;
private int presupuesto;
private ArrayList jugadores=new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, int palmares, String ciudad, int presupuesto) {
        this.nombre = nombre;
        this.palmares = palmares;
        this.ciudad = ciudad;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPalmares() {
        return palmares;
    }

    public void setPalmares(int palmares) {
        this.palmares = palmares;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return super.toString()+"Equipo{" + "nombre=" + nombre + ", palmares=" + palmares + ", ciudad=" + ciudad + ", presupuesto=" + presupuesto + ", jugadores=" + jugadores + '}';
    }

}
