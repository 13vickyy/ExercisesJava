public class p10 { // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
    public static void main(String[] args) {
        int a = 1;
        int b = 13;
        int c = 22;

        if (a > b && a > c) {
            System.out.println("El mayor es: " + a);
        } else if (b > a && b > c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }
    }

}
