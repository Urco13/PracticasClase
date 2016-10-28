/*
 * Crear un algoritmo que calcule la nota final
 *  de un alumno dads: nota y numero de faltas
 *  faltas < 5 --> igual nota
    faltas entre 5 y 10 --> nota -0,5
    faltas > 10 y < 20 nota -1
    faltas > 20 --> nota=3
    nota <=3 --> no cambia
 */

/**
 *
 * @author dam115
 */
public class NotaFinal3 {
    public static void main(String args[]){
        float nota = 10, faltas = 20, notaFinal = 0;
        if(faltas < 5){
            notaFinal = nota;
        }else if(faltas>=5 && faltas<=10){
            notaFinal = nota - 0.5F;
        }else if(faltas>10 && faltas<=20){
            notaFinal = nota -1F;
        }else if(faltas>20){
            notaFinal = 3;
        }else{
            notaFinal = 3;
        }
        System.out.println("Tu nota es " + notaFinal);
    }
}