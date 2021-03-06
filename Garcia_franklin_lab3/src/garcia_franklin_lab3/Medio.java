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
public class Medio extends Jugador{
     //Nivel de creatividad, nivel de dominio, promedio de asistencias por partido
    private int creatividad;
    private int domino;
    private double promedio_asistencias;

    public Medio() {
        super();
    }

    public Medio(int creatividad, int domino, double promedio_asistencias, String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, int precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.creatividad = creatividad;
        this.domino = domino;
        this.promedio_asistencias = promedio_asistencias;
    }

    public int getCreatividad() {
        return creatividad;
    }

    public void setCreatividad(int creatividad) {
        this.creatividad = creatividad;
    }

    public int getDomino() {
        return domino;
    }

    public void setDomino(int domino) {
        this.domino = domino;
    }

    public double getPromedio_asistencias() {
        return promedio_asistencias;
    }

    public void setPromedio_asistencias(double promedio_asistencias) {
        this.promedio_asistencias = promedio_asistencias;
    }

    @Override
    public String toString() {
        return super.toString()+"Medio" +"\n"+ "creatividad=" + creatividad +"\n"+ ", domino=" + domino +"\n"+ ", promedio_asistencias=" + promedio_asistencias +"\n" ;
    }

    
}
