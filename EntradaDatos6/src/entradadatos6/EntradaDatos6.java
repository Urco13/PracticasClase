/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatos6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam115
 */
public class EntradaDatos6 {

    public static void main(String[] args) throws IOException {
        String nombre;
        int n;
        String s, cadena;
        float f;
        InputStreamReader flujo;
        flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        
        System.out.println("Introduzca un nombre: ");
        s = teclado.readLine();
        System.out.println("Su nombre: "+ s);
        
        System.out.println("Introduzca un numero: ");
        cadena=teclado.readLine();
        n=Integer.parseInt(cadena);
        System.out.println("el numero "+n);
        
        System.out.println("Introduzca un numero con decimales: ");
        f=Float.parseFloat(teclado.readLine());
        System.out.println("el numero "+ f);
        
        nombre="Cadenas probando";
        System.out.println(nombre+" " +nombre.charAt(0));
        //pruebas conversiones
        char c=Character.toUpperCase('a');
        String b=String.valueOf(true);
        float numero=Float.parseFloat("3.99");
        System.out.println("............");
        Integer objeto=Integer.valueOf(n);
        //objeto
        int unnumero=objeto.intValue();
        System.out.println(unnumero+"..."+objeto.toString());
    }
    
}
