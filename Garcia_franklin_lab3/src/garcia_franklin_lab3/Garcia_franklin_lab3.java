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
        ArrayList<Equipo> lista_equipo = new ArrayList();
        ArrayList<Equipo> lista_organizado = new ArrayList();
        ArrayList<Equipo> lista_suplentes = new ArrayList();
        while (!opcion.equalsIgnoreCase("5")) {
            System.out.println("Ingrese opcion \n"
                    + "1.Operaciones basicas \n"
                    + "2.Hacer compras \n"
                    + "3.Organizar el equipo \n"
                    + "4.Listar \n"
                    + "5.Salir \n");
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
                                            + "2.Equipos \n"
                                            + "3.Salir \n");
                                    agregar = lectura.next();
                                    switch (agregar) {
                                        case "1": {
                                            String jugadores = "";
                                            while (!jugadores.equalsIgnoreCase("5")) {
                                                System.out.println("Ingrese opcion \n"
                                                        + "1.Portero \n"
                                                        + "2.Defensa \n"
                                                        + "3.Medio \n"
                                                        + "4.Delantero \n"
                                                        + "5Salir \n");
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
                                            String nombre = lectura.next();
                                            System.out.println("Palmares ganados");
                                            int palmares = lectura.nextInt();
                                            System.out.println("Ingrees ciudad de origen");
                                            String ciudad = lectura.next();
                                            System.out.println("Ingrees presupuesto");
                                            int presupuesto = lectura.nextInt();
                                            lista_equipo.add(new Equipo(nombre, palmares, ciudad, presupuesto));
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
                                            String jugadores = "";
                                            while (!jugadores.equalsIgnoreCase("5")) {
                                                System.out.println("Ingrees opcion \n"
                                                        + "1.Portero \n"
                                                        + "2.Defensa \n"
                                                        + "3.Medio \n"
                                                        + "4.Delantero \n"
                                                        + "5.Salir \n");
                                                jugadores = lectura.next();
                                                switch (jugadores) {
                                                    case "1": {
                                                        String elementos = "";
                                                        for (Jugador p : lista_jugadores) {
                                                            if (p instanceof Portero) {
                                                                elementos += "\n" + lista_jugadores.indexOf(p) + " " + p;
                                                            }
                                                        }
                                                        System.out.println(elementos);
                                                        System.out.println("Ingrese posicion a modificar");
                                                        int pos = lectura.nextInt();
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
                                                        ((Portero) lista_jugadores.get(pos)).setAereo(aereo);
                                                        ((Portero) lista_jugadores.get(pos)).setApellido(apellido);
                                                        ((Portero) lista_jugadores.get(pos)).setEdad(edad);
                                                        ((Portero) lista_jugadores.get(pos)).setEquipo(equipo);
                                                        ((Portero) lista_jugadores.get(pos)).setEstado(estado);
                                                        ((Portero) lista_jugadores.get(pos)).setNombre(nombre);
                                                        ((Portero) lista_jugadores.get(pos)).setNumero(numero);
                                                        ((Portero) lista_jugadores.get(pos)).setPais(pais);
                                                        ((Portero) lista_jugadores.get(pos)).setPie(pie);
                                                        ((Portero) lista_jugadores.get(pos)).setPies(pies);
                                                        ((Portero) lista_jugadores.get(pos)).setPrecio(precio);
                                                        System.out.println("Se modifico con exito");
                                                    }
                                                    break;
                                                    case "2": {
                                                        String elementos = "";
                                                        for (Jugador p : lista_jugadores) {
                                                            if (p instanceof Defensa) {
                                                                elementos += "\n" + lista_jugadores.indexOf(p) + " " + p;
                                                            }
                                                        }
                                                        System.out.println(elementos);
                                                        System.out.println("Ingrese posicion a modificar");
                                                        int pos = lectura.nextInt();
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
                                                        ((Defensa) lista_jugadores.get(pos)).setAgresividad(agresividad);
                                                        ((Defensa) lista_jugadores.get(pos)).setAltura(altura);
                                                        ((Defensa) lista_jugadores.get(pos)).setApellido(apellido);
                                                        ((Defensa) lista_jugadores.get(pos)).setEdad(edad);
                                                        ((Defensa) lista_jugadores.get(pos)).setEquipo(equipo);
                                                        ((Defensa) lista_jugadores.get(pos)).setEstado(estado);
                                                        ((Defensa) lista_jugadores.get(pos)).setNombre(nombre);
                                                        ((Defensa) lista_jugadores.get(pos)).setNumero(numero);
                                                        ((Defensa) lista_jugadores.get(pos)).setPais(pais);
                                                        ((Defensa) lista_jugadores.get(pos)).setPeso(peso);
                                                        ((Defensa) lista_jugadores.get(pos)).setPie(pie);
                                                        ((Defensa) lista_jugadores.get(pos)).setPrecio(precio);
                                                        ((Defensa) lista_jugadores.get(pos)).setVelocidad(velocidad);
                                                        System.out.println("Se modifico con exito");
                                                    }
                                                    break;
                                                    case "3": {
                                                        String elementos = "";
                                                        for (Jugador p : lista_jugadores) {
                                                            if (p instanceof Medio) {
                                                                elementos += "\n" + lista_jugadores.indexOf(p) + " " + p;
                                                            }
                                                        }
                                                        System.out.println(elementos);
                                                        System.out.println("Ingrese posicion a modificar");
                                                        int pos = lectura.nextInt();
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
                                                        ((Medio) lista_jugadores.get(pos)).setApellido(apellido);
                                                        ((Medio) lista_jugadores.get(pos)).setCreatividad(creatividad);
                                                        ((Medio) lista_jugadores.get(pos)).setDomino(domino);
                                                        ((Medio) lista_jugadores.get(pos)).setEdad(edad);
                                                        ((Medio) lista_jugadores.get(pos)).setEquipo(equipo);
                                                        ((Medio) lista_jugadores.get(pos)).setEstado(estado);
                                                        ((Medio) lista_jugadores.get(pos)).setNombre(nombre);
                                                        ((Medio) lista_jugadores.get(pos)).setNumero(numero);
                                                        ((Medio) lista_jugadores.get(pos)).setPais(pais);
                                                        ((Medio) lista_jugadores.get(pos)).setPie(pie);
                                                        ((Medio) lista_jugadores.get(pos)).setPrecio(precio);
                                                        ((Medio) lista_jugadores.get(pos)).setPromedio_asistencias(promedio_asistencias);
                                                    }
                                                    break;
                                                    case "4": {
                                                        String elementos = "";
                                                        for (Jugador p : lista_jugadores) {
                                                            if (p instanceof Delantero) {
                                                                elementos += "\n" + lista_jugadores.indexOf(p) + " " + p;
                                                            }
                                                        }
                                                        System.out.println(elementos);
                                                        System.out.println("Ingrese posicion a modificar");
                                                        int pos = lectura.nextInt();
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
                                                        ((Delantero) lista_jugadores.get(pos)).setAltura(altura);
                                                        ((Delantero) lista_jugadores.get(pos)).setApellido(apellido);
                                                        ((Delantero) lista_jugadores.get(pos)).setDefinicion(definicion);
                                                        ((Delantero) lista_jugadores.get(pos)).setEdad(edad);
                                                        ((Delantero) lista_jugadores.get(pos)).setEquipo(equipo);
                                                        ((Delantero) lista_jugadores.get(pos)).setEstado(estado);
                                                        ((Delantero) lista_jugadores.get(pos)).setNombre(nombre);
                                                        ((Delantero) lista_jugadores.get(pos)).setNumero(numero);
                                                        ((Delantero) lista_jugadores.get(pos)).setPais(pais);
                                                        ((Delantero) lista_jugadores.get(pos)).setPie(pie);
                                                        ((Delantero) lista_jugadores.get(pos)).setPrecio(precio);
                                                        ((Delantero) lista_jugadores.get(pos)).setPromedio_gol(promedio_gol);
                                                        ((Delantero) lista_jugadores.get(pos)).setVelocidad(velocidad);
                                                        System.out.println("Se modifico con exito");
                                                    }
                                                    break;
                                                }

                                            }
                                        }
                                        break;
                                        case "2": {
                                            String ee = "";
                                            for (Equipo e : lista_equipo) {
                                                ee += "\n" + lista_equipo.indexOf(e) + " " + e;
                                            }
                                            System.out.println(ee);
                                            System.out.println("Ingrese posicion");
                                            int pos = lectura.nextInt();
                                            System.out.println("Ingrese que quiere modificasr \n"
                                                    + "1.Nombre \n"
                                                    + "2.Palmares \n"
                                                    + "3.Ciudad \n"
                                                    + "4.Presupuesto");
                                            int iii = lectura.nextInt();
                                            if (iii == 1) {
                                                System.out.println("Ingrees nombre");
                                                String nombre = lectura.next();
                                                ((Equipo) lista_equipo.get(pos)).setNombre(nombre);
                                            } else if (iii == 2) {
                                                System.out.println("Palmares ganados");
                                                int palmares = lectura.nextInt();
                                                ((Equipo) lista_equipo.get(pos)).setPalmares(palmares);
                                            } else if (iii == 3) {
                                                System.out.println("Ingrees ciudad de origen");
                                                String ciudad = lectura.next();
                                                ((Equipo) lista_equipo.get(pos)).setCiudad(ciudad);
                                            } else if (iii == 4) {
                                                System.out.println("Ingrees presupuesto");
                                                int presupuesto = lectura.nextInt();
                                                ((Equipo) lista_equipo.get(pos)).setPresupuesto(presupuesto);
                                            } else {
                                                System.out.println("Numero Invalido");
                                            }

                                            System.out.println("Se modifico con exito");
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
                                            String elementos = "";
                                            for (Jugador j : lista_jugadores) {
                                                elementos += "\n" + lista_jugadores.indexOf(j) + " " + j;
                                            }
                                            System.out.println(elementos);
                                            System.out.println("Ingrese posicion a eliminar");
                                            int pos = lectura.nextInt();
                                            lista_jugadores.remove(pos);
                                            System.out.println("Se elimino con exito");

                                        }
                                        break;
                                        case "2": {
                                            String elementos = "";
                                            for (Equipo e : lista_equipo) {
                                                elementos += "\n" + lista_equipo.indexOf(e) + " " + e;
                                            }
                                            System.out.println(elementos);
                                            System.out.println("Ingrese posicion a eliminar");
                                            int pos = lectura.nextInt();
                                            lista_jugadores.remove(pos);
                                            System.out.println("Se elimino con exito");

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
                    System.out.println("Bienvenido a la tienda de jugadores");
                    String equipos = "";
                    for (Equipo e : lista_equipo) {
                        equipos += "\n" + lista_equipo.indexOf(e) + " " + e;
                    }
                    System.out.println(equipos);
                    System.out.println("Elegir equipo");
                    int equipo = lectura.nextInt();
                    String eq = "";
                    for (Jugador j : lista_jugadores) {
                        eq += "\n" + lista_jugadores.indexOf(j) + " " + j;
                    }
                    System.out.println(eq);
                    System.out.println("Ingrese jugador a comprar");
                    int jugador = lectura.nextInt();
                    while (lista_jugadores.get(equipo).getPrecio() > lista_equipo.get(equipo).getPresupuesto()) {
                        System.out.println("No se puede comprar es muy caro");
                        equipos = "";
                        for (Equipo e : lista_equipo) {
                            equipos += "\n" + lista_equipo.indexOf(e) + " " + e;
                        }
                        System.out.println(equipos);
                        System.out.println("Elegir equipo");
                        equipo = lectura.nextInt();
                        eq = "";
                        for (Jugador j : lista_jugadores) {
                            eq += "\n" + lista_jugadores.indexOf(j) + " " + j;
                        }
                        System.out.println(eq);
                        System.out.println("Ingrese jugador a comprar");
                        jugador = lectura.nextInt();
                    }
                    System.out.println("Ingrese el numero que quiere asignar");
                    int nuevo_numero = lectura.nextInt();
                    for (Equipo r : lista_equipo) {
                        for (Object p : r.getJugadores()) {
                            Jugador temp = ((Jugador) p);
                            while (temp.getNumero() == nuevo_numero) {
                                System.out.println("Numero invalido");
                                System.out.println("Ingrese el numero que quiere  asignar");
                                nuevo_numero = lectura.nextInt();
                            }
                        }
                    }
                    lista_jugadores.get(jugador).setNumero(nuevo_numero);
                    lista_jugadores.get(jugador).setEstado("Numero");
                    lista_jugadores.get(jugador).setEquipo(lista_equipo.get(equipo).getNombre());
                    int nuevo_presuspuesto = lista_equipo.get(equipo).getPresupuesto() - lista_jugadores.get(jugador).getPrecio();
                    lista_equipo.get(equipo).setPresupuesto(nuevo_presuspuesto);

                    Jugador Seleccionado = lista_jugadores.get(jugador);
                    if (Seleccionado instanceof Delantero) {
                        Delantero EsDelantero = ((Delantero) Seleccionado);
                        lista_equipo.get(equipo).getJugadores().add(EsDelantero);
                    } else if (Seleccionado instanceof Medio) {
                        Medio EsMedio = ((Medio) Seleccionado);
                        lista_equipo.get(equipo).getJugadores().add(EsMedio);
                    } else if (Seleccionado instanceof Defensa) {
                        Defensa esDefensa = ((Defensa) Seleccionado);
                        lista_equipo.get(equipo).getJugadores().add(esDefensa);
                    } else if (Seleccionado instanceof Portero) {
                        Portero esPortero = ((Portero) Seleccionado);
                        lista_equipo.get(equipo).getJugadores().add(esPortero);
                    }
                    lista_jugadores.remove(jugador);//esta borrando
                    System.out.println("Se compro con exito");
                }
                break;
                case "3": {
                    String elemento = "";
                    for (Equipo e : lista_equipo) {
                        elemento += "\n" + lista_equipo.indexOf(e) + " " + e;
                    }
                    System.out.println(elemento);
                    System.out.println("Elije equipo");
                    int pos = lectura.nextInt();
                    int cont = 0, portero, medios, defensas, delanteros;

                    System.out.println("Ingrees numero de defensas");
                    defensas = lectura.nextInt();
                    System.out.println("Ingrese numero de medios");
                    medios = lectura.nextInt();
                    System.out.println("Ingrese numero de delanteros");
                    delanteros = lectura.nextInt();
                    cont = 1 + defensas + medios + delanteros;

                    int cont_portero = 0, cont_Defensa = 0, cont_Medio = 0, cont_Delantero = 0;
                    for (Equipo d : lista_equipo) {
                        for (Object p : d.getJugadores()) {
                            if (p instanceof Defensa) {
                                cont_Defensa++;
                            }
                            if (p instanceof Medio) {
                                cont_Medio++;
                            }
                            if (p instanceof Delantero) {
                                cont_Delantero++;
                            }
                            if (p instanceof Portero) {
                                cont_portero++;
                            }
                        }
                    }
                    while (cont < 11 && cont_portero < 1 && cont_Defensa < defensas && cont_Medio < medios && cont_Delantero < delanteros) {
                        System.out.println("No hay suficientes jugadores en las posiciones o formacion invalida");
                        System.out.println("Ingrees numero de defensas");
                        defensas = lectura.nextInt();
                        System.out.println("Ingrese numero de medios");
                        medios = lectura.nextInt();
                        System.out.println("Ingrese numero de delanteros");
                        delanteros = lectura.nextInt();
                        cont = 1 + defensas + medios + delanteros;
                    }
                    String elementos = "";
                    for (Object p : lista_equipo.get(pos).getJugadores()) {
                        elementos += "\n" + ((Jugador) p) + " ";
                    }
                    System.out.println("Ingrese Jugadores");
                    int cont_portero2 = 0, cont_Defensa2 = 0, cont_Medio2 = 0, cont_Delantero2 = 0;
                    int por,def,med,del;
                    
                    while(cont_portero2<=1){
                        System.out.println("Ingreese psicion del portero");
                        por=lectura.nextInt();
                        lista_organizado.add((Equipo) lista_equipo.get(pos).getJugadores().get(por));
                        cont_portero2++; 
                    }
                    while(cont_Defensa2<=defensas){
                        System.out.println("Ingrese posicion de los defensas");
                        def=lectura.nextInt();
                        lista_organizado.add((Equipo) lista_equipo.get(pos).getJugadores().get(def));
                        cont_Defensa2++;
                    }
                    while(cont_Medio2<=medios){
                        System.out.println("Ingrese posicion de medios");
                        med=lectura.nextInt();
                        lista_organizado.add((Equipo) lista_equipo.get(pos).getJugadores().get(med));
                        cont_Medio2++;
                    }
                    while(cont_Delantero2<=delanteros){
                        System.out.println("Ingrese posicion de Delanteros");
                        del=lectura.nextInt();
                        lista_organizado.add((Equipo) lista_equipo.get(pos).getJugadores().get(del));
                        cont_Delantero2++;
                    }
                    System.out.println("Equipo armado");
                    
                }
                break;
                case "4": {
                    System.out.println("Ingrees opcion \n"
                            + "1.Equipos \n"
                            + "2.Jugadores \n");
                    int opp = lectura.nextInt();
                    if (opp == 1) {
                        String todos = "";
                        for (Equipo l : lista_equipo) {
                            todos += "\n" + lista_equipo.indexOf(l) + " " + l;
                        }

                        ////////////////
                    } else if (opp == 2) {
                        String elementos = "";
                        for (Jugador t : lista_jugadores) {
                            elementos += "\n" + lista_jugadores.indexOf(t) + " " + t;
                        }
                        for (Equipo r : lista_equipo) {
                            for (Object p : r.getJugadores()) {
                                elementos += "\n" + ((Jugador) p);
                            }
                        }

                        System.out.println(elementos);
                    } else {
                        System.out.println("Numero invalido");
                    }
                }
                break;
            }
        }
    }

}
