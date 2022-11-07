/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tarea4b;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class Tarea4Bpassword {

    public static void main(String[] args) {
    
        //opcion 1 - pin de 4 digitos
        for (int i = 0; i< 10; i++){
        String pin = RandomStringUtils.randomNumeric(4);
            System.out.println(pin);
        }
        
        System.out.println("------------------------");
        
        //opcion 2 - pin de 8 letras y numeros
        for (int i = 0; i< 10; i++){
        String password = RandomStringUtils.randomAlphabetic(8);
            System.out.println(password);
        }
        
        System.out.println("---------------------------");
        
        //opcion 3 - 
        char[] conjuntoCaracteres = {'a', 'z', 'b', '$', '&', '*', '1'};
        int numero = 6;
        for (int i = 0; i< 10; i++){
        String password2 = RandomStringUtils.random(numero, conjuntoCaracteres);
            System.out.println(password2);
        }
        
        
    }
}
