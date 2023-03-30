
import java.util.Scanner;
/**
 *
 * @author Juanfra
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros que desea cambiar");
        double euros=leer.nextInt();
        System.out.println("Ingrese la divisa que desea obtener:(Libras,Pesos o yenes)");
        String div=leer.next();
        convert(euros,div);
    }
    static void convert(double euros,String div){
        Scanner leer = new Scanner(System.in);
        double total=0;
        while (total==0){
        switch (div.toLowerCase()) {
            case "libras":
                total=euros*0.86;
                System.out.println("Sus euros son : "+ total + " Libras");
                break;
            case "pesos":
                total=euros*1.28611;
                System.out.println("Sus euros son : " + total + " Pesos");
                break;
            case "yenes":
                total=euros*129.852;
                System.out.println("Sus euros son " + total + " Yenes");
                break;
            default:
                System.out.println("Ingrese una divisa valida");
                div=leer.next();
                break;
        }
            
        }
    }
}
