package cls_programas;

import cls_ejercicios.Cls_ejercicio2;

public class Prog02 {

    public static void main(String[] args) {
        //se define las variables
        int corteCabello = 130;
        int laceadoColombiano=190;
        int pintadoUna=20;
        int descuento=75;
        //hacemos la instancia
        Cls_ejercicio2 objEje2=new Cls_ejercicio2();
        //llamamos al metodo salon_belleza de la instancia y almacenamos en la variable rpta
        int rpta = objEje2.Salon_Belleza(corteCabello, laceadoColombiano, pintadoUna, descuento);
        //al final imprimo el mensaje con el resultado que se almaceno en la variable rpta
        System.out.println("El total que debe pagar Macarena al Salon de Belleza es "+rpta+" soles");
    }
}
