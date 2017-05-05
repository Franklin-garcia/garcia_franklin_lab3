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
public class Delantero extends Jugador {
 //Nivel de definición, altura. Velocidad, promedio de goles por partido
    private int definicion;
    private int altura;
    private int velocidad;
    private double promedio_gol;

    public Delantero() {
        super();
    }

    public Delantero(int definicion, int altura, int velocidad, double promedio_gol, String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, int precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.definicion = definicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.promedio_gol = promedio_gol;
    }

    public int getDefinicion() {
        return definicion;
    }

    public void setDefinicion(int definicion) {
        this.definicion = definicion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPromedio_gol() {
        return promedio_gol;
    }

    public void setPromedio_gol(double promedio_gol) {
        this.promedio_gol = promedio_gol;
    }

    @Override
    public String toString() {
        return super.toString()+"Delantero{" + "definicion=" + definicion + ", altura=" + altura + ", velocidad=" + velocidad + ", promedio_gol=" + promedio_gol + '}';
    }
    
    
    
}
