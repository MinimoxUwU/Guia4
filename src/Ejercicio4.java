
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para averiguar si es primo:");
        int num1=leer.nextInt();
        System.out.println(Primo(num1));
    }
    static boolean Primo(int num1){
        boolean Primo;
        int cont=0,cont2=0;
            do {
                cont++;
                if (num1%cont==0) {
                    cont2++;
                }
            } while (cont<=num1||cont2<2);
        Primo = cont2 <= 2;
        return Primo;
    }
}
