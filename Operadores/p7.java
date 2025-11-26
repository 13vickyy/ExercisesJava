package Operadores; // 7. Combina ambos operadores lógicos.

public class p7 {
     public static void main(String[] args) {
        
        int nro_1 = 3;
        int nro_2 = 6;
        int nro_3 = 0;

        boolean rta = (nro_1 == nro_2 || nro_2 != nro_3) && nro_1 != nro_3;
        System.out.println(rta);

    }
}
