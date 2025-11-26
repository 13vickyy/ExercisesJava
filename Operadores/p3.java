package Operadores; // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

public class p3 {
    public static void main(String[] args) {
        
        int nro_1 = 5;
        int nro_2 = 10;

        boolean RtaMenor = nro_1 < nro_2;
        System.out.println(RtaMenor);

        boolean RtaMenorIgual = nro_1 <= nro_2;
        System.out.println(RtaMenorIgual);

        boolean RtaIndistinto = nro_1 != nro_2;
        System.out.println(RtaIndistinto);


    }
    
}
