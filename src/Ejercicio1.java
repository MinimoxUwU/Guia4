
import java.util.Scanner;
/**
 *
 * @author Juanfra
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String rta="n";
        System.out.println("Ingrese 2 numeros");
        int num1=leer.nextInt(),num2=leer.nextInt();
        while ("n".equals(rta)) {
            System.out.println("MENU");
            System.out.println("1-SUMA");
            System.out.println("2-RESTA");
            System.out.println("3-MULTIPLICACION");
            System.out.println("4-DIVISION");
            System.out.println("5-SALIR");
            int opc=leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma entre ambos numeros es: "+Suma(num1,num2));
                    break;
                case 2:
                    System.out.println("La resta entre ambos numeros es: "+Resta(num1,num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion entre ambos numeros es : "+Mult(num1,num2));
                    break;
                case 4:
                    System.out.println("La division entre ambos numeros es : "+Div(num1,num2));
                    break;
                case 5:
                    rta="s";
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
    static int Suma(int num1, int num2){
        int Suma;
        Suma=num1+num2;
        return Suma;
    }
    static int Resta(int num1, int num2){
        int Resta;
        Resta=num1-num2;
        return Resta;
    }
    static double Div(int num1, int num2){
        double Div;
        Div=num1/num2;
        return Div;
    }
    static int Mult(int num1, int num2){
        int Mult;
        Mult=num1*num2;
        return Mult;
    }
}
