
package EJECICIOJAVA;

import java.util.Scanner;

public class Examen_Ejercicio05Yimi {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        boolean salir=false; int opcion;
        while (!salir){
        System.out.println("Acesso a los siguientes ejercicios:");
        System.out.println("Ejercicio 1:");
        System.out.println("Ejercicio 2:");
        System.out.println("Ejercicio 3:");
        System.out.println("Ejercicio 4:");
        System.out.println("Salir : |5|");
        opcion=leer.nextByte();
        switch(opcion){
            case 1:
                Examen_Ejercicio01Yimi SI1=new Examen_Ejercicio01Yimi();
                SI1.main(args);
                break;
            case 2:
                Examen_Ejercicio02Yimi SI2=new Examen_Ejercicio02Yimi();
                SI2.main(args);
                break;
            case 3:
                Examen_Ejercicio03Yimi SI3=new Examen_Ejercicio03Yimi();
                SI3.main(args);
                break;
            case 4:
                Examen_Ejercicio04Yimi SI4=new Examen_Ejercicio04Yimi();
                SI4.main(args);
                break;
            case 5:
                salir=true;
                break;
            default:
                System.out.println("De la opcion 1 al 5 por favor");
                
                
        }
        }
    }
}
