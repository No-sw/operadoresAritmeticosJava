/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesaritmeticas;
import java.util.Scanner;
/**
 *
 * @author Toshiba
 */
public class OperacionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int suma, resta, multiplicacion, opcion, numero1, numero2;
        float division, numero1divisor, numero2divisor;
        System.out.println("opcion1: Suma, opcion2: Resta, opcion3: Multiplicacion, opcion4: Division");
        System.out.print("Escoja una opcion: ");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Suma");
                System.out.print("Escoja su primer numero: ");
                numero1 = entrada.nextInt();
                System.out.print("Escoja su segundo numero: ");
                numero2 = entrada.nextInt();
                suma = numero1 + numero2;
                System.out.println("Resultado de suma: "+suma);
                break;
            case 2:
                System.out.println("Resta");
                System.out.print("Escoja su primer numero: ");
                numero1 = entrada.nextInt();
                System.out.print("Escoja su segundo numero: ");
                numero2 = entrada.nextInt();
                resta = numero1 - numero2;
                System.out.println("Resultado de resta: "+resta);
                break;
            case 3:
                System.out.println("Multiplicacion");
                System.out.print("Escoja su primer numero: ");
                numero1 = entrada.nextInt();
                System.out.print("Escoja su segundo numero: ");
                numero2 = entrada.nextInt();
                multiplicacion = numero1 * numero2;
                System.out.println("Resultado de multiplicacion: "+multiplicacion);
                break;
            case 4:
                System.out.println("Division");
                System.out.print("Escoja su primer numero: ");
                numero1divisor = entrada.nextFloat();
                System.out.print("Escoja su segundo numero: ");
                numero2divisor = entrada.nextFloat();
                division = numero1divisor/numero2divisor;
                System.out.println("Resultado de division: "+division);
                break;
            default:
                System.out.println("Ingreso un numero equivocado, intente de nuevo");
                break;
        }
    }
}
