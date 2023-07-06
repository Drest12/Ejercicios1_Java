package cls_programas;

import cls_ejercicios.Cls_ejercicio3;

public class Prog03 {

    public static void main(String[] args) {
        //definimos las variables
        int pLima = 100;
        int pIca = 80;
        int pTumbes = 50;
        int pTacna = 70;
        //hacemos la instancia de clase
        Cls_ejercicio3 oCls_ejercicio3 = new Cls_ejercicio3();
        //traemos el metodo de la clase que hemos instancia
        double[] result = oCls_ejercicio3.Marathon(pLima, pIca, pTumbes, pTacna);
        //asignamos valores al arreglo result a variables individuales
        double totalConcursantes = result[0];
        double porcentajeLimaIca = result[1];
        double promedioConcursantes = result[2];
        //finalmente se imprime el resultado
        System.out.println("Total de concursantes: " + totalConcursantes);
        System.out.println("Porcentaje de participantes de Lima e Ica: " + porcentajeLimaIca + "%");
        System.out.println("Promedio de concursantes: " + promedioConcursantes);
    }

}
