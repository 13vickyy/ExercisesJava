public class p9 { // 9. Crea un programa que diga si una letra es vocal o consonante.
    public static void main(String[] args) {
        char letra = 'a';

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("Es vocal");
        }
        else if (Character.isLetter(letra)){
            System.out.println("Es consonante");
        }
        else
            System.out.println("No ingreso una letra valida, intente nuevamente");
    }
    
}
