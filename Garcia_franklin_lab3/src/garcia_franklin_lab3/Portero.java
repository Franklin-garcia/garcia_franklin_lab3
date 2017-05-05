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
public class Portero extends Jugador {
//ivel de juego aéreo, nivel de juego con los pies
   private int aereo;
   private int pies;
    public Portero() {
        super();
    }

    public Portero(int aereo, int pies, String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, int precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.aereo = aereo;
        this.pies = pies;
    }

    public int getAereo() {
        return aereo;
    }

    public void setAereo(int aereo) {
        this.aereo = aereo;
    }

    public int getPies() {
        return pies;
    }

    public void setPies(int pies) {
        this.pies = pies;
    }

    @Override
    public String toString() {
        return super.toString()+"Portero"+"\n" + "aereo=" + aereo +"\n"+ ", pies=" + pies +"\n" ;
    }
   
}
