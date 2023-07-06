package cls_ejercicios;
//clase para sacar cuanto pago Manuel a la polleria
public class Cls_ejercicio1 {

    public double polleria(int cantidadPersonas, double precioPollo, int cantidadGaseosas,
            double precioGaseosa, int cantidadHeladosPromo, double precioHeladoPromo,
            int cantidadHeladosNormal, double precioHeladoNormal) {
        //Calcula el costo total de los pollos comprados multiplicando la cantidad 
        //de personas por el precio del pollo y luego multiplicando por 0.25.
        double totalPollos = cantidadPersonas * (precioPollo * 0.25);
        //Calcula el costo total de las gaseosas compradas multiplicando la cantidad de gaseosas por el precio de cada una.
        double totalGaseosas = cantidadGaseosas * precioGaseosa;
        //Calcula el costo total de los helados en promoción comprados multiplicando la cantidad de helados en promoción 
        //por el precio de cada uno.
        double totalHeladosPromo = cantidadHeladosPromo * precioHeladoPromo;
        // Calcula el costo total de los helados normales comprados multiplicando la cantidad de helados normales 
        //por el precio de cada uno.
        double totalHeladosNormal = cantidadHeladosNormal * precioHeladoNormal;
        // Suma todos los costos totales calculados anteriormente 
        double totalPagado = totalPollos + totalGaseosas + totalHeladosPromo + totalHeladosNormal;
        //devuelve el monto total pagado en la polleria 
        return totalPagado;
    }

}
