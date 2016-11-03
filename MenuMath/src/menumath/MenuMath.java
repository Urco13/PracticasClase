/**Pulse 1 para hallar su valor absoluto
   * Pulse 2 para calcular su raiz cuadrada
   * Pulse 3 para devolver el numero entero
   * Pulse 4 para redondear hacia arriba
   * Pulse 5 para elevarlo a un exponente
   * Pulse 6 para devolver el mayor de 2 numeros
   * Pulse 7 para salir del programa
   * Admitir opcion correcta
   * Realizar calculo y mostrar resultado
   * --> explicar: menu, estructura siwtch
 */
package menumath;

/**
 *
 * @author dam115
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuMath {

    
    public static void main(String[] args) throws IOException {
        String cadena; int opcion; float numero, exp;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));//creamos el objeto teclado con la Clase BufferedRedader
        do{
            System.out.println("Dame un numero");
            cadena = teclado.readLine();//leemos la entrada del teclado con el meto readLine del ojeto teclado
            numero = Integer.parseInt(cadena);//transformamos la cadena aun entero
            System.out.println("Pulse 1 para hallar su valor absoluto");//Pedimos que eliga entre una opcion
            System.out.println("Pulse 2 para calcular su raiz cuadrada");
            System.out.println("Pulse 3 para devolver el numero entero");
            System.out.println("Pulse 4 para redondear hacia arriba");
            System.out.println("Pulse 5 para elevarlo a un exponente");
            System.out.println("Pulse 6 para devolver el mayor de 2 numeros");
            System.out.println("Pulse 7 para salir del programa");
            cadena = teclado.readLine();
            opcion = Integer.parseInt(cadena);
            switch(opcion){
                case(1):
                    System.out.println("El valor absoluto " + Math.abs(numero));
                    break;
                    case(2):
                        System.out.println("La raiz cuadrada " + Math.sqrt(numero));
                        break;
                        case(3):
                            System.out.println("El numero entero es" + Math.floor(numero) );//si no se va a guardar el valor no hace falta cambiar a (int)
                            break;
                            case(4):
                                System.out.println("Redondeado hacia arriba " + Math.ceil(numero));
                                break;
                                case(5):
                                    System.out.println("Dame el exponente");
                                    
                                    System.out.println("");
            }
        while(opcion!=7)
    }

    
    
}
/**
 * case '3'
 * system.out.print(introducca un numero)
 * n = intro.nextFloat();
 * system.out.println("el valor entero"
 * break
 * opcion = (char)teclado.readLine().charAT(0)
 */