/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class PintarCuadrado {
    public static void main(String[]args){
        int lado, i;
        Scanner teclado = new Scanner(System.in);
        //Scanner teclado = null; new Scanner(System.in) Se define el objeto
        //pero se deja en null; Si esta definido el ojeto como null nos saltarina
        //la exception NullPointerException
        try{
        System.out.println("Dime el numero de lados de tu cuadrado");
        lado = teclado.nextInt();
        for(int a=1; a<=lado; a++){
            for(i=1; i<=lado; i++){
                System.out.printf("* ");
        }
            System.out.print("\n");
        } 
        }catch(InputMismatchException objeto){//Esta exception salta con dos errores
            //numero decimal con punto y numero mas caracter
            System.out.println(objeto.getCause());
            System.out.println(objeto.getClass());
            System.out.println("Esto es otra prueba");
            System.out.println(objeto.toString());
            objeto.printStackTrace();
        }catch(NullPointerException objeto){
            System.out.println("Objeto no existe: "+ objeto.getMessage());
        }catch(Exception objeto){
            System.out.println(objeto.getCause());
           
        }
    }
}
