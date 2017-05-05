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
    private double altura;
    private int velocidad;
    private double promedio_gol;

    public Delantero() {
        super();
    }

    public Delantero(int definicion, double altura, int velocidad, double promedio_gol, String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, int precio, String equipo) {
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
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
        return super.toString() + "Delantero " + "\n" + "definicion= " + definicion + "\n" + ", altura=" + altura + "\n" + ", velocidad=" + velocidad + "\n" + ", promedio_gol=" + promedio_gol + "\n";
    }

}
