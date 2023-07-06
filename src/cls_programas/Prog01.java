package cls_programas;

import cls_ejercicios.Cls_ejercicio1;

public class Prog01 {

    public static void main(String[] args) {
        
        //las variables 
        int cantidadPersonas = 3;
        double precioPollo = 19.50;
        int cantidadGaseosas = 4;
        double precioGaseosa = 6.20;
        int cantidadHeladosPromo = 2;
        int cantidadHeladosNormal = 2;
        double precioHeladoPromo = 7.90;
        double precioHeladoNormal = 3.50;
        //instancia  a la clase cls_ejercicio1 
        Cls_ejercicio1 objEje1 = new Cls_ejercicio1();
        //se llama  al metodo polleria de la instancia  y el resultado  se almacenara en rpta
        double rpta = objEje1.polleria(cantidadPersonas, precioPollo, cantidadGaseosas, precioGaseosa, cantidadHeladosPromo, 
                precioHeladoPromo, cantidadHeladosNormal, precioHeladoNormal);
        // final se imprime el mensaje en la consola del resultado de monto total a pagar 
        System.out.println("El monto total pagado por Manuel y sus amigos en la pollería 'Three Chicken' es: " + rpta + " soles");
    }

}
