/**
 * Crear un programa en Java que lea 2 datos año y mes
 * y nos muestre los dias correspondientes al mes.
 * Nota: 1 año es bisiesto si es multiplo de 4 y no de 100 o
 * cuando es multiplo de 400
 * año=1900
 */
package diasmes;

/**
 *
 * @author dam115
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DiasMes {
    
    public static void main(String[] args) {
        //Definimos variables
        int ano, mes; String cadena; 
        //Definimos el objeto teclado.
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dime el año");
        cadena = teclado.readLine();
        ano = Integer.parseInt(cadena);
        System.out.println("Dime el mes");
        cadena = teclado.readLine();
        mes = Integer.parseInt(cadena);
        switch(mes){
            case(1):
            case(3):
            case(5):
            case(7):
            case(8):
            case(10):
            case(12):
                System.out.println("Este mes tiene 31 dias");
                break;
            case(4):
            case(6):
            case(9):
            case(11):
                System.out.println("Este mes tiene 30 dias");
                break;
            case(2)://mes de febrero
                if(ano%4==0 && () )
                
        }
    }
    
}
/**
 * System.out.println("Dame mes:")
 * m= teclado.readline
 */