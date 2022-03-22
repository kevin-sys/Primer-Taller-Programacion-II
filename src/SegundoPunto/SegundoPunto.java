package SegundoPunto;

/*Escriba una aplicación que defina tres variables numéricas, con sus valores iniciales, y muestre la suma, promedio,
producto, cociente y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas.*/
public class SegundoPunto {

    public static void main(String[] args) {
        float N1 = 20, N2 = 20, N3 = 20;
        System.out.printf("El valor de %.2f + %.2f + %.2f es: %.2f\n", N1, N2, N3, (N1 + N2 + N3));
        System.out.printf("El promedio de las 3 variables es: %.2f\n ", (N1 + N2 + N3) / 3);
        System.out.printf("El valor de %.2f * %.2f * %.2f es: %.2f\n", N1, N2, N3, (N1 * N2 * N3));
        System.out.printf("El valor de %.2f / %.2f / %.2f es: %.2f\n", N1, N2, N3, (N1 / N2 / N3));

    }

}
