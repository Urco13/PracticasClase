/*
 * Mecanizar, compilar, ejecutar, entender orden de operaciones
 * y comentar cada linea de codigo
 * 
 */

/**
 *
 * @author dam115
 */
public class OperadoresLogicos2 {
    public static void main(String args[]){
    //Definicion de variables
        int y = 1, x = 5;
        int x_mas, mas_y, mayor, q;
        boolean positivo=false;
        
        y *= x+1;//y = y*(x + 1)
        System.out.println("1- y*(x+1)="+ y);
        y /=(5+x);// y / (5 + x)
        System.out.println("2- y/(5+x)=" + y);
        y = --x+2;//x-1, y=x+2
        System.out.println("3- --x + 2 = "+ y);
        x_mas = x++;// x_mas = x, x=x+1
        mas_y = ++y;
        System.out.println("4- x_mas = "+ x_mas + "mas_y= "+ mas_y +"x= "+ x + "y= "+ y);
        q = 2 * ++y;
        System.out.println(" 2 * (y+1) =" + q);
        q = 2 * x++;
        System.out.println(" 2 * x = " +q);
        mayor = x>y ? x++ : --y;
        if (mayor>0){
            System.out.println(" mayor es distinto de cero");
            // positivo=true
        }
        if (!positivo)
            System.out.println("positivo es ???????");
    }
}
