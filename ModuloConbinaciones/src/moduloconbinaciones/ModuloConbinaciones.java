/**
 * Calculo de P sobre Q (combinaciones de p elementos cogidos en grupos de q)
 * (Si p > 0, Q >= 0, y P > Q)
 *  Si Q=0 || p=Q resultado 1
 *  C(a,b)= a!/(b!*(a-b)!)//calculo
 *  Metodo que calcula: C(a,b) y mustra resultado
 * C(p,q)=P!/Q! * (P-Q)!
 */
package moduloconbinaciones;

/**
 *
 * @author dam115
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ModuloConbinaciones {

    public static void main(String[] args) throws IOException {
        int p , q, restaPQ; double nCombinatorio = 1 ;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dame el numero p ");
        p = Integer.parseInt(teclado.readLine());
        System.out.println("Dame el numero q");
        q = Integer.parseInt(teclado.readLine());
        restaPQ = p - q;
        if((p > 0) || (q >= 0) && (p >= q) ){
            if((q == 0) || (p == q)){
                System.out.println("Numero Combinatorio: " + nCombinatorio);
            }else{
               nCombinatorio = (double) (factorialNum(p)/(factorialNum(q)*factorialNum(restaPQ)));
                System.out.println("factorial " + factorialNum(restaPQ));//Para comprobar los valores
                System.out.println("Numero Combinatorio: " + nCombinatorio);
            }
        }
    }
    public static double factorialNum(int numero){
        
            double factorial = 1; int contador;
    
        if(numero>0){
            for(contador=1; contador<=numero; contador++){
                factorial *= contador;
            }
        }
        return factorial;
    }
}
