package Operadores; // 10. Combina operadores aritméticos, de comparación y lógicos.

public class p10 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;

        //aritméticos
        int suma = a + b;    
        int resto = a % b;  

        //comparación
        boolean comp1 = suma > 10; 
        boolean comp2 = resto == 1; 

        //lógicos
        boolean resultado = comp1 && comp2;  

        System.out.println("Suma: " + suma);
        System.out.println("Resto: " + resto);
        System.out.println("Resultado final: " + resultado);

    }
}
