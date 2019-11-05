package EJECICIOJAVA;

import java.util.Scanner;


public class Examen_Ejercicio01Yimi {
    public static void main(String[] args) {
       int CantidadAuto, ValorAuto, Clave, suma=0,impuesto=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese cantidad de Automoviles");
        CantidadAuto=leer.nextByte();
        System.out.println("Ingrese valor de Automovil");
        ValorAuto=leer.nextByte();
        for (int i = 0; i < CantidadAuto; i++) {
            System.out.println("Ingresar clave del automovil");
            Clave=leer.nextByte();
            if (Clave==1){
            impuesto=(int) (ValorAuto*0.1);
                System.out.println("El impuesto es: "+impuesto);
                suma=suma+impuesto;
            }else if(Clave==2){
                impuesto=(int) (ValorAuto*0.07);
                System.out.println("El impuesto es: "+impuesto);
                suma=suma+impuesto;
            }else if(Clave==3){
                impuesto=(int) (ValorAuto*0.05);
                System.out.println("El impuesto es: "+impuesto);
                suma=suma+impuesto;
            }
            System.out.println("El monto a pagar es: "+suma);
        }
        
    }
}

