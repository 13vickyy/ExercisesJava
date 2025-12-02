package EjercicioStrings; // 10. Comprueba si dos strings tienen la misma longitud.

public class p10 {
    public static void main(String[] args) {
        var palabra_1 = "Samsung";
        var palabra_2 = "Motorola";

        boolean iguales = palabra_1.length() == palabra_2.length();
        System.out.println(iguales);
    }
}
