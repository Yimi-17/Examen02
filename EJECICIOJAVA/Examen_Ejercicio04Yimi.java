
package EJECICIOJAVA;

import java.util.Scanner;

public class Examen_Ejercicio04Yimi {
    public static void main(String[] args) {
        int[] vector={1,10,9,8,11,7,6,12,2,3,4,5};
        int i=0; boolean marca=false;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el mes:"); System.out.println("1=Enero"); System.out.println("2=Febrero"); System.out.println("3=Marzo"); System.out.println("4=Abril");
        System.out.println("5=Mayo"); System.out.println("6=Junio"); System.out.println("7=Julio"); System.out.println("8=Agosto");
        System.out.println("9=Setiembre"); System.out.println("10=Octubre"); System.out.println("11=Noviembre"); System.out.println("12=Diciembre");
        int mes=leer.nextByte();
        while (i<vector.length && marca==false){
            if(vector[i]==mes){
            marca=true;
            }
            i++;
        }
        if(marca==false){
            System.out.println("Mes de encontrado");
        }else {
            System.out.println("El mes fue encontrado en la posicion: "+(i));
        }
    }
}
