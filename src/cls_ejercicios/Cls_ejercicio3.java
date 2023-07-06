package cls_ejercicios;

public class Cls_ejercicio3 {

   public double[] Marathon(int pLima, int pIca, int pTumbes, int pTacna) {
       // calculo de total de concunsantes
        double totalConcursantes = pLima + pIca + pTumbes + pTacna;
        //calculo promedio de concursantes
        double promedioConcursantes = totalConcursantes / 4;
        //calculo porcentaje de participantes de Lima e Ica
        double porcentajeLimaIca = ((pLima + pIca) / totalConcursantes) * 100;
        //en este arreglo almacenamos las variables de los calculos
        double[] result = { totalConcursantes, porcentajeLimaIca, promedioConcursantes };
        // retornamos el arreglo con las variables
        return result;
    }
}
