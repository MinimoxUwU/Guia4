
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juanfra
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int cant = leer.nextInt();
        String rta = "s";
        int edad[];
        edad = new int[cant];
        Completar(cant, edad);
        Comparar(cant, edad, rta);

    }

    static void Completar(int cant, int edad[]) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese edad para la persona " + (i + 1));
            edad[i] = leer.nextInt();

        }
    }

    static void Comparar(int cant, int edad[], String rta) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < cant; i++) {
            if (!"No".equals(rta)) {
                System.out.print(edad[i]);
                if (edad[i] >= 18) {
                    System.out.println(" Mayor");
                } else {
                    System.out.println(" Menor");
                }
            }

            System.out.println("Desea seguir mostrando personas?");
            rta = leer.next();
            if ("No".equals(rta)) {
                break;
            }
            if (i == cant - 1) {
                System.out.println("No hay mas personas que mostrar");
            }

        }
    }
}
