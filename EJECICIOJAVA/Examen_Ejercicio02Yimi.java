
package EJECICIOJAVA;

import pe.edu.upeu.subprogramas.LeerTeclado;

public class Examen_Ejercicio02Yimi {
    public static void main(String[] args) {
        String ap=null;
        int a=0, b=0;
        LeerTeclado lt=new LeerTeclado();
        System.out.println("Operaciones aritmeticas--->Seleccione una opcion:");
        System.out.println(" + ---->suma");
        System.out.println(" - ---->resta");
        System.out.println(" * ---->multiplicacion");
        System.out.println(" / ---->division");
        ap=lt.leer(ap, "Elija correctamente");
    }
}
