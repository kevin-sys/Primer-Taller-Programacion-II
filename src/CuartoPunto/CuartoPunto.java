/*Se desea construir un programa en java que permita calcular el costo total de un viaje que tiene una duración en días.
Para ello, se requiere los siguientes datos: Número de días del viaje, Total de kilómetros conducidos por día, costo por
litro de gasolina, promedio de kilometro por litro de gasolina, pago por estacionamiento por día, pago de peajes por día.
Imprima en consola el resultado.*/
package CuartoPunto;

public class CuartoPunto {

    public static void main(String[] args) {
        float NumeroDiasViaje = 20;
        float TotalKilometrosConducidosDia = 400;
        float CostoLitroGasolina = 1000;
        float PromedioKilometrosLitrosGasolina = 1;
        float PagoEstacionamientoDia = 10000;
        float PagoPeajesDia = 17000;

        System.out.printf("EL COSTO TOTAL DEL VIAJE ES DE: %.0f\n",
                ((TotalKilometrosConducidosDia * CostoLitroGasolina) / PromedioKilometrosLitrosGasolina) * (NumeroDiasViaje) + ((PagoEstacionamientoDia+PagoPeajesDia) * NumeroDiasViaje));

    }

}
