/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garcia_franklin_lab3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Franklin Garcia
 */
public class Garcia_franklin_lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String opcion = "";
        ArrayList<Jugador> lista_jugadores = new ArrayList();
        ArrayList<Equipo>lista_equipo=new ArrayList();
        while (!opcion.equalsIgnoreCase("e")) {
            System.out.println("Ingrese opcion \n"
                    + "a.Operaciones basicas \n"
                    + "b.Hacer compras \n"
                    + "c.Organizar el equipo \n"
                    + "d.Listar \n"
                    + "e.Salir \n");
            opcion = lectura.next();
            switch (opcion) {
                case "1": {
                    String op = "";
                    while (!op.equalsIgnoreCase("4")) {
                        System.out.println("Ingrese opcion \n"
                                + "1.Agregar \n"
                                + "2.Modificar \n"
                                + "3.Eliminar \n");
                        op = lectura.next();
                        switch (op) {
                            case "1": {
                                String agregar = "";
                                while (!agregar.equalsIgnoreCase("3")) {
                                    System.out.println("Ingrese opcion \n"
                                            + "1.Jugadores \n"
                                            + "2.Equipos \n");
                                    agregar = lectura.next();
                                    switch (agregar) {
                                        case "1": {
                                            String jugadores = "";
                                            while (!jugadores.equalsIgnoreCase("5")) {
                                                System.out.println("Ingrese opcion \n"
                                                        + "1.Portero \n"
                                                        + "2.Defensa \n"
                                                        + "3.Medio \n"
                                                        + "4.Delantero \n");
                                                jugadores = lectura.next();
                                                switch (jugadores) {
                                                    case "1": {
                                                        System.out.println("Ingrees nivel de juego aereo");
                                                        int aereo = lectura.nextInt();
                                                        System.out.println("Ingrese nivel de juego con los pies");
                                                        int pies = lectura.nextInt();
                                                        //
                                                        System.out.println("Ingrese nombre");
                                                        String nombre = lectura.next();
                                                        System.out.println("Ingrese apellido");
                                                        String apellido = lectura.next();
                                                        System.out.println("Ingrese edad");
                                                        int edad = lectura.nextInt();
                                                        String estado = "Libre";
                                                        System.out.println("Ingrees pais");
                                                        String pais = lectura.next();
                                                        String pie = "";
                                                        System.out.println("Ingrese pie \n"
                                                                + "1.Derecho \n"
                                                                + "2.Izquierdo \n");
                                                        String piess = lectura.next();
                                                        if (piess.equals("1")) {
                                                            pie = "Derecho";
                                                        } else if (piess.equals("2")) {
                                                            pie = "Izquierdo";
                                                        }
                                                        int numero = 0;
                                                        System.out.println("Ingrees precio");
                                                        int precio = lectura.nextInt();
                                                        String equipo = "";
                                                        lista_jugadores.add(new Portero(aereo, pies, nombre, apellido, edad, estado, pais, pie, numero, precio, equipo));
                                                        System.out.println("Se agrego con exito");
                                                    }
                                                    break;
                                                    case "2": {
                                                        System.out.println("Ingrese agresividad");
                                                        int agresividad = lectura.nextInt();
                                                        System.out.println("Ingrese altura");
                                                        double altura = lectura.nextDouble();
                                                        System.out.println("Ingrese peso");
                                                        double peso = lectura.nextDouble();
                                                        System.out.println("Ingrese velocidad");
                                                        int velocidad = lectura.nextInt();
                                                        //
                                                        System.out.println("Ingrese nombre");
                                                        String nombre = lectura.next();
                                                        System.out.println("Ingrese apellido");
                                                        String apellido = lectura.next();
                                                        System.out.println("Ingrese edad");
                                                        int edad = lectura.nextInt();
                                                        String estado = "Libre";
                                                        System.out.println("Ingrees pais");
                                                        String pais = lectura.next();
                                                        String pie = "";
                                                        System.out.println("Ingrese pie \n"
                                                                + "1.Derecho \n"
                                                                + "2.Izquierdo \n");
                                                        String piess = lectura.next();
                                                        if (piess.equals("1")) {
                                                            pie = "Derecho";
                                                        } else if (piess.equals("2")) {
                                                            pie = "Izquierdo";
                                                        }
                                                        int numero = 0;
                                                        System.out.println("Ingrees precio");
                                                        int precio = lectura.nextInt();
                                                        String equipo = "";
                                                        lista_jugadores.add(new Defensa(agresividad, altura, peso, velocidad, nombre, apellido, edad, estado, pais, pie, numero, precio, equipo));
                                                        System.out.println("Se agrego con exito");
                                                    }
                                                    break;
                                                    case "3": {
                                                        System.out.println("Ingrese creatividad");
                                                        int creatividad = lectura.nextInt();
                                                        System.out.println("Ingrese dominio");
                                                        int domino = lectura.nextInt();
                                                        System.out.println("Ingrese promedio de asistencias");
                                                        double promedio_asistencias = lectura.nextInt();
                                                        //
                                                        System.out.println("Ingrese nombre");
                                                        String nombre = lectura.next();
                                                        System.out.println("Ingrese apellido");
                                                        String apellido = lectura.next();
                                                        System.out.println("Ingrese edad");
                                                        int edad = lectura.nextInt();
                                                        String estado = "Libre";
                                                        System.out.println("Ingrees pais");
                                                        String pais = lectura.next();
                                                        String pie = "";
                                                        System.out.println("Ingrese pie \n"
                                                                + "1.Derecho \n"
                                                                + "2.Izquierdo \n");
                                                        String piess = lectura.next();
                                                        if (piess.equals("1")) {
                                                            pie = "Derecho";
                                                        } else if (piess.equals("2")) {
                                                            pie = "Izquierdo";
                                                        }
                                                        int numero = 0;
                                                        System.out.println("Ingrees precio");
                                                        int precio = lectura.nextInt();
                                                        String equipo = "";
                                                        lista_jugadores.add(new Medio(creatividad, domino, promedio_asistencias, nombre, apellido, edad, estado, pais, pie, numero, precio, equipo));
                                                        System.out.println("Se agrego con exito");
                                                    }
                                                    break;
                                                    case "4": {
                                                        System.out.println("Ingrese definicion");
                                                        int definicion = lectura.nextInt();
                                                        System.out.println("Ingrese altura");
                                                        double altura = lectura.nextDouble();
                                                        System.out.println("Ingrese velocidad");
                                                        int velocidad = lectura.nextInt();
                                                        System.out.println("Ingrese pormedio gol");
                                                        double promedio_gol = lectura.nextDouble();
                                                        //
                                                        System.out.println("Ingrese nombre");
                                                        String nombre = lectura.next();
                                                        System.out.println("Ingrese apellido");
                                                        String apellido = lectura.next();
                                                        System.out.println("Ingrese edad");
                                                        int edad = lectura.nextInt();
                                                        String estado = "Libre";
                                                        System.out.println("Ingrees pais");
                                                        String pais = lectura.next();
                                                        String pie = "";
                                                        System.out.println("Ingrese pie \n"
                                                                + "1.Derecho \n"
                                                                + "2.Izquierdo \n");
                                                        String piess = lectura.next();
                                                        if (piess.equals("1")) {
                                                            pie = "Derecho";
                                                        } else if (piess.equals("2")) {
                                                            pie = "Izquierdo";
                                                        }
                                                        int numero = 0;
                                                        System.out.println("Ingrees precio");
                                                        int precio = lectura.nextInt();
                                                        String equipo = "";
                                                        lista_jugadores.add(new Delantero(definicion, altura, velocidad, promedio_gol, nombre, apellido, edad, estado, pais, pie, numero, precio, equipo));
                                                        System.out.println("Se agrego con exito");
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                        case "2": {
                                            System.out.println("Ingrees nombre");
                                            String nombre=lectura.next();
                                            System.out.println("Palmares ganados");
                                            int palmares=lectura.nextInt();
                                            System.out.println("Ingrees ciudad de origen");
                                            String ciudad=lectura.next();
                                            System.out.println("Ingrees presupuesto");
                                            int presupuesto=lectura.nextInt();
                                            lista_equipo.add(new Equipo(nombre,palmares,ciudad,presupuesto));
                                            System.out.println("Se agrego con exito");
                                        }
                                        break;
                                    }
                                }
                            }
                            break;

                            case "2": {
                                String modificar = "";
                                while (!modificar.equalsIgnoreCase("3")) {
                                    System.out.println("Ingrese opcion \n"
                                            + "1.Jugadores \n"
                                            + "2.Equipos \n");
                                    modificar = lectura.next();
                                    switch (modificar) {
                                        case "1": {

                                        }
                                        break;
                                        case "2": {

                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                            case "3": {
                                String eliminar = "";
                                while (!eliminar.equalsIgnoreCase("3")) {
                                    System.out.println("Ingrese opcion \n"
                                            + "1.Jugadores \n"
                                            + "2.Equipos \n");
                                    eliminar = lectura.next();
                                    switch (eliminar) {
                                        case "1": {

                                        }
                                        break;
                                        case "2": {

                                        }
                                        break;
                                    }
                                }
                            }
                            break;

                        }
                    }
                }
                break;

                case "2": {

                }
                break;
                case "3": {

                }
                break;
                case "4": {

                }
                break;
            }
        }
    }

}
