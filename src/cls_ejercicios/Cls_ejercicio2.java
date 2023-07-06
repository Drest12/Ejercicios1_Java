package cls_ejercicios;

public class Cls_ejercicio2 {

    public int Salon_Belleza(int corteCabello, int laceadoColombiano,
            int pintadoUna, int descuento) {
        //Se calcula el cosot de servicio de corte de cabello con descuento
        int corteDescuencuento=corteCabello-descuento;
        // calcula todo el monto a pagar al salon de belleza
        int totalPagado=pintadoUna+laceadoColombiano+corteDescuencuento;
        //se retorna el monto total paagado de belleza
        return totalPagado;
        
    }
}
