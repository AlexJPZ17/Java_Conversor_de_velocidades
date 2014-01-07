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
public class ConversorDeVelocidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos dos variable
        int opcion, repetir = 0;
        Scanner entrada = new Scanner(System.in);
       //Mandamos a llamar a la clase Conversor
        Conversor con = new Conversor();
        /*Instrucción do while que se repetirá de acuerdo 
          a lo que este en la variable repetir */
        do{
            //Mostramos los mensajes y obtenemos el dato ingresado
            System.out.println("Escoja una de las opciones");
            System.out.println("1 - Convertir m/s a km/h");
            System.out.println("2 - Convertir km/h a m/s");
            opcion = entrada.nextInt();
            //Instrucción switch que evalúa la variable opción
            switch(opcion){
                case 1:
                   con.Conversor1();
                    break;
                case 2:
                   con.Conversor2();
                    break;
                default:
                    System.out.println("Opción errónea");
                    break;
            }
            //Colocamos un mensaje con una opción 
            System.out.println("Si desea repetir coloque el valor de 1 o cualquier tecla para salir");
            repetir = entrada.nextInt();
        }while(repetir == 1);
    }
    
}
