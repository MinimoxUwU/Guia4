
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
public class ManosALaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase a codificar");
        frase=leer.next();
        String codigo=codif(frase);
        System.out.println("Su frase codificada es:"+codigo);
    }
    static String codif(String frase){
        String codif="";
       
        for (int i = 0; i < frase.length(); i++) {
        switch (frase.substring(i,i+1)) {
            case "a":
                codif+="@";
                break;
            case "e":
                codif+="#";
                 break;
            case "i":
                codif+="$";
                 break;
            case "o":
                codif+="%";
                 break;
            case "u":
                codif+="*";
                 break;    
            default:
                codif+=frase.substring(i,i+1);
        }
           
      }
        return codif;
    }
}

   