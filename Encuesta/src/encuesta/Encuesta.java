/*
Se realiza una encuesta a varias/100 personas y se pregunta por el mes de nacimiento
Crear un vector con nombre de los meses y el vector para contar cada caso
Mostrar cuantas personas nacieron en cada mes:
Enero....xx
Febrero...
*/
package encuesta;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author dam115
 */
public class Encuesta {

    /**
     * @param args the command line arguments
     */
    static BufferedReader  flujo = new BufferedReader(new InputStreamReader(System.in));
    //inicio main
    public static void main(String[] args) {
        int mesNacimiento=0;
        String meses[] ={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int contadorArray[];
        mesNacimiento = datosPantalla("En que mes as nacido 1-12");
        contadorArray=contadorEncuesta(mesNacimiento);
        
      
    }//fin main
    
    //Contador encuesta
    public static int[] contadorEncuesta(int mesNacimiento){
        int contador[]= new int [12];
        contador [mesNacimiento-1]++;
        return contador;
    }//fin contador encuesta
    
    //Datos pantalla
    public static int datosPantalla(String texto){
        int mes =0;
        do{
            System.out.println(texto);
             try {
             mes = Integer.parseInt(flujo.readLine());
            } catch (NullPointerException ex) {
              System.out.println("Dato incorrecto dime el mes en que nacistes");
            } catch (Exception ex) {
                System.out.println("Dato erroneo");
            }
        }while(mes<0 || mes>11);
        return mes;
        
    }//fin datos pantalla
}//fin class
