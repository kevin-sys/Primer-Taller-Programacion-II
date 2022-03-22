package TercerPunto;

/*El precio de venta de los artículos de una tienda se calcula a partir de su valor de costo fijo, el porcentaje de iva y su
porcentaje de utilidad. Cree una aplicación en Java, en la que defina e inicialice dichos valores para un artículo, y
calcule y muestre su precio de venta.*/
public class TercerPunto {

    public static void main(String[] args) {
        float CostoFijo = 100000;
        float PorcentajeIva = 19;
        float PorcentajeUtilidad = 4;

        System.out.printf("El costo fijo del articulo es: %.0f, el porcentaje de IVA es: %.0f, el porcentaje de utilidad es de: %.0f, POR LO TANTO EL PRECIO DE VENTA ES DE: %.0f\n",
                CostoFijo, PorcentajeIva, PorcentajeUtilidad, (CostoFijo * (PorcentajeIva / 100) + CostoFijo * (PorcentajeUtilidad / 100) + CostoFijo));

    }

}
