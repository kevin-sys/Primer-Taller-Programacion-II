package QuintoPunto;

/*En la Tabla 1 se muestran el número de calorías que contienen las principales frutas. ¿Si Juan cena una ensalada de
frutas que contiene 2 manzanas, 3 peras, 1 naranja y 1 melón, cuantas calorías ha consumido? Cree una aplicación en
java que le permita realizar el cálculo, para ello defina e inicialice las variables que considere.*/
public class QuintoPunto {

    public static void main(String[] args) {
        int Manzana = 52;
        int Pera = 55;
        int Naranja = 45;
        int Melon = 54;
        int Piña=55;
        int Fresa=32;
        
        System.out.printf("JUAN HA CONSUMIDO %d CALORIAS\n\n", (Manzana * 2) + (Pera * 3) + (Naranja * 1) + (Melon * 1));
        System.out.printf("SEGUNDA COMBINACIÓN DE FRUTAS\n");

        System.out.printf("JUAN HA CONSUMIDO %d CALORIAS\n", (Piña * 3) + (Pera * 3) + (Naranja * 1) + (Fresa * 10));

    }

}
