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
public class Defensa extends Jugador {
    //Nivel de agresividad, altura, peso, velocidad. 
    private int agresividad;
    private double altura;
    private double peso;
    private int velocidad;

    public Defensa() {
        super();
    }

    public Defensa(int agresividad, double altura, double peso, int velocidad, String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, int precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.agresividad = agresividad;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public int getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(int agresividad) {
        this.agresividad = agresividad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Defensa" +"\n"+ "agresividad=" + agresividad +"\n"+ ", altura=" + altura +"\n"+ ", peso=" + peso +"\n"+ ", velocidad=" + velocidad +"\n";
    }
    
}
