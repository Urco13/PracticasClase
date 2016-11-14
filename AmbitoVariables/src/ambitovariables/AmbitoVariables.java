/*
 * Variables locales, y en bloque
 * variable local o de clase
 */
package ambitovariables;


public class AmbitoVariables {

    static int var1=333; //si le ponemos final la hacemos una constante
    
    public static void main(String[] args) {
       int var1=100;//avisa posibles errores
        
       System.out.println("2=var1(local) =" + var1);
            {
               int var2=88888;
                    //int var1 ==88; //error var local ya definida
                    System.out.println("3= var1(local) = " +var1);
                    metodoprueba();
            }//..................
    }//fin main()
    static void metodoprueba(){
        byte numero=88;
        //System.out.println("5- var1 = " + var1); Si lo descomentamos veriamos la variable gloval
    }
}
