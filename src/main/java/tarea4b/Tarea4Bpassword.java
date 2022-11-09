/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tarea4b;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class Tarea4Bpassword {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String opcion = "";

        while (!opcion.equalsIgnoreCase("salir")) {
            
            System.out.println("""
                                 ESCOGE UNA OPCIÓN
                             -------------------------------
                              1 - Pin de 4 dígitos
                              2 - Secuencia alafanumérica
                              3 - Secuencia personalizada
                             -------------------------------
                                   Salir
                           """);

        opcion = teclado.nextLine();
        
            switch (opcion) {
                case "1":
                    String pin = opcion1();
                    System.out.println("Tu pin es: " + pin);
                    break;
                case "2":
                    String password = opcion2();
                    System.out.println("Tu contraseña alfanumérica es: " + password);
                    break;
                case "3":
                    String password2 = opcion3();
                    System.out.println("Tu contraseña personalizada es: " + password2);
                    break;
                case "salir":
                    System.out.println("Hasta luegui <3");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

    }

    private static String opcion1() {
        String pin = "";
        for (int i = 0; i < 10; i++) {
            pin = RandomStringUtils.randomNumeric(4);
        }
        return pin;
    }

    private static String opcion2() {
        String password = "";
        for (int i = 0; i < 10; i++) {
            password = RandomStringUtils.randomAlphabetic(8);
        }
        return password;
    }

    private static String opcion3() {
        Scanner teclado = new Scanner(System.in);
        char[] conjuntoCaracteres = {'a', 'z', 'b', '$', '&', '*', '1', '*', 'u', 'w'};
        int numero = 0;
        boolean repetir = true;
        while (repetir) {
            try {
                System.out.println("Introduzca el número de carácteres que desea");
                numero = teclado.nextInt();
                if (numero > 0){
                    repetir = false;
                } else{
                    System.out.println("El número debe ser mayor que 0");
                }
            } catch (InputMismatchException ime){
                System.out.println("Eso no es un número");
                teclado.nextLine();
            }
        }
        
        String password2 = "";
        for (int i = 0; i < 10; i++) {
            password2 = RandomStringUtils.random(numero, conjuntoCaracteres);
        }
        return password2;
    }
}
