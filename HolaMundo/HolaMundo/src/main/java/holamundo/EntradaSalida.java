package holamundo;

import java.util.Scanner;

/**
 *Entrada y salida de datos por consola
 * @author davidperlaza14
 */
public class EntradaSalida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //int numero;
        //float numero;
        //double numero;
        String cadena;
        
        
        //System.out.println("Digite un numero");
//        numero = entrada.nextInt();
//        numero = entrada.nextFloat();
//        numero = entrada.nextDouble();
       // System.out.println("El numero que digitaste fue: " + numero);
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        System.out.println("La cadena es: " + cadena);
        
    }
    
}
