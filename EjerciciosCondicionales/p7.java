public class p7 { // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
    public static void main(String[] args) {
        double nota = 1;

        if (nota >=90 && nota <= 100){
            System.out.println("Sobresaliente");
        }
        else if (nota >= 60 && nota <=90){
            System.out.println("Aprobado");
        }
        else
            System.out.println("Desaprobado");
    }
    
}
