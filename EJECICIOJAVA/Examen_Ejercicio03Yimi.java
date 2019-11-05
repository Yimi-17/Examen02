package EJECICIOJAVA;

import java.util.Scanner;


public class Examen_Ejercicio03Yimi {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[] vector={42,57,14,40,96,19,8,68,1,4};
        int temp; String orden,DES = null;
        System.out.println("Ordenar de ascendente a descendente");
        System.out.println("Ascendiente= Asc");
        System.out.println("Descendente= Des");
        orden=leer.nextLine();
        if (orden.equals("Des")){
            for (int i = 1; i < vector.length; i++) {//DESCENDIENTE
            for (int j = 0; j < vector.length-i; j++) {
                if(vector[j]<vector[j+1]){
                temp=vector[j];
                vector[j]=vector[j+1];
                vector [j+1]=temp;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[1]+"|");
            }
        }else if (orden.equals("Asc")){
            for (int i = 1; i < vector.length; i++) {
                for (int j = 0; j < vector.length-i; j++) {
                    if(vector[j]>vector[j+1]){
                    temp=vector[j];
                    vector[j]=vector[j+1];
                    vector [j+1]=temp;
                    }
                }
            }
            for (int i = 0; i < vector.length; i++) {
                System.out.println(vector[i]+"|");
            }
        }
    }
 
}
