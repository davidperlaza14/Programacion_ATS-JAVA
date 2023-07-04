package operadores;

import java.util.Scanner;

/**
 *
 * @author davidperlaza14
 */
public class Operadores {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        float numero1, numero2, suma, resta, mult, div, resto;
//        
//        System.out.println("Digita 2 numeros: ");
//        numero1 = entrada.nextFloat();
//        numero2 = entrada.nextFloat();
//        
//        suma = numero1 + numero2;
//        resta = numero1 - numero2;
//        mult = numero1 * numero2;
//        div = numero1 / numero2;
//        resto = numero1 % numero2;
//        
//        
//        System.out.println("La suma es: " + suma);
//        System.out.println("La resta es: " + resta);
//        System.out.println("L multiplicacion es: " + mult);
//        System.out.println("La division es: " + div);
//        System.out.println("El resto es: "+resto);
        
        

//        Operadores Aritméticos combinados con asignación

        int numero = 10;
        
        numero += 5; // numero =  numero - 5;
        numero -= 5; // numero =  numero - 5;
        numero *= 5; // numero =  numero * 5;
        numero /= 5; // numero =  numero / 5;
        numero %= 5; // numero =  numero % 5;
        
        System.out.println(numero);
                
        
    }
    
}
