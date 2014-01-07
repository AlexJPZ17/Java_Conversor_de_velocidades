/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversor.de.velocidades;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Conversor {
    //Declaramos una variable
    double velocidad;
    //Método Scanner
    Scanner entrada = new Scanner(System.in);
    //Método que obtiene el dato m/s y lo convierte a km/h
    public void Conversor1(){
        System.out.println("Introduzca una velocidad en m/s");
        velocidad = entrada.nextDouble();
        System.out.println(velocidad + " m/s = " + velocidad * 3600/1000 +" km/h");
    }
    //Método que obtiene el dato km/h y lo convierte a km/h
    public void Conversor2(){
        System.out.println("Introduzca una velocidad en km/h");
        velocidad = entrada.nextDouble();
        System.out.println(velocidad + " km/h = " + velocidad * 1000/3600 +" m/s");
    }
}
