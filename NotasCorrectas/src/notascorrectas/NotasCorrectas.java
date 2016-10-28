/*
 * Calcular la Media de 10 notas correctas solo se admitiran valores entre 1 y 10
 * Utilizar una variable switch
 * and open the template in the editor.
 */
package notascorrectas;

import java.util.Scanner;
public class NotasCorrectas {
    
    public static void main(String[] args) {
        int nota, i; boolean sw;//sw sea falso
        float media=0;
        final byte CANTIDAD=5;
        Scanner objetoLeer = new Scanner(System.in);
        for(i=1; i<=CANTIDAD; i++){
            sw=false;
            while(sw!=true){
            System.out.println("Dime la nota "+ i);
            nota = objetoLeer.nextInt();
            if(nota>=1 && nota<=10){
              media= media + nota;//tambien puede ser un sumador--> media +=nota
                sw=true;//cuando la nota se evalua sw es verdadero.
            }else{
                System.out.println("Nota no valida dime otra nota");
            }
          }
        }
        System.out.println("Media de las "+ CANTIDAD +" notas es "+ media/CANTIDAD);        
    }
    
}
