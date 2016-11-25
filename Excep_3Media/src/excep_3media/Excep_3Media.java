/**
 * Excep_3Media-3 Propagar excepciones
 * 1-Leer 5 numeros. Crear el metodo leerEntero(), lee y devuelve dato
 * controlar excepciones en el main().Mostrar media
 */
package excep_3media;

/**
 *
 * @author dam115
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Excep_3Media {

   public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
   
    public static void main(String[] args) throws IOException {
       int c, grado, total, entrada = 0;
       float media;
       boolean correcto = true;
       total = 0;
       c=1;
       try{
       while(c<=5){
           System.out.println("Calificacion numerica");
           do{
               try{
                    entrada= leerEntero();
               }catch(NumberFormatException o){
                   System.out.println("Dato no correcto");
                   correcto=false;
               }//fin try
           }while(correcto==false);
     
           total +=entrada;
           c++;
       }
       media=total/10;
           System.out.println("La media es "+ media);
      }catch(Exception o){
           System.out.println(o.getMessage());
           o.printStackTrace();
      }
    }//fin main
    public static int leerEntero() throws IOException{
        int numero = Integer.parseInt(teclado.readLine());
        return numero;
    }
}//fin class
