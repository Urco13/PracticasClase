/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam115
 */
public class Execp1 {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int i,j;
        String texto;
        InputStreamReader flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        try{
            System.out.println("Numero");
            texto=teclado.readLine();
            i=(Integer.valueOf(texto)).intValue();
            System.out.println("Otro numero");
            texto=teclado.readLine();
            j=(Integer.valueOf(texto)).intValue();
            System.out.println("division "+i+"/"+j+"="+i/j);
        }catch(Exception objeto){
            System.out.println("Error");
            System.out.println(objeto.getMessage());
            objeto.printStackTrace();
        }//catch(NumberFormatException objeto){
//            System.out.println("No es un numero");
//            System.out.println(objeto.getMessage());
//        }catch(ArithmeticException objeto){
//             System.out.println("Division por cero");
//        }catch(Exception objeto){
//            System.out.println("Error no controlado");
//        }
        System.out.println("FIN..........");
    }//fin main
    
}//fin class
