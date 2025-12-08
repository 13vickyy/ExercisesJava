public class p8 {// 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
    public static void main(String[] args) {
        int age = 1;

        if (age >=15){
            System.out.println("Mayor de 15 años, puede ingresar sin acompañante");
        }
        else
            System.out.println("Menor de 15 años, necesita acompañante");
    }
}
