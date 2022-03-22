package PrimerPunto;

public class PrimerPunto {

    public static void main(String[] args) {
        int x = 10;
        System.out.printf("x = %d\n", x);
        System.out.printf("El valor de %d + %d es %d\n", x, x, (x + x));
        System.out.printf("El valor de %d / 2 = %.2f\n", x, x / 2);//ESTA LINEA GENERARA ERROR YA QUE %.2f SE USA PARA IMPRIMIR UN DATO DE TIPO FLOAT
        System.out.printf("El valor de %d mod 3 = %d\n", x, x % 3);
    }

}
