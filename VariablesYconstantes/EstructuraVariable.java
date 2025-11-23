package VariablesYconstantes; //Estrucura basica para declarar variables

public class EstructuraVariable {

    public static void main(String[] args) {
        String name = "Alexandra";  //Primero coloco el TIPO DE DATO (string), luego el nombre de la variable (name), y por ultimo le asigno valor (Alexandra)
        System.out.println(name); //Muestro por pantalla mi variable name

        name = "Olivia";  //No me da error, java lo permite
        System.out.println(name);

        /*name = 29;  java ya no permite esta operacion, porque defini la variable con el tipo de dato STRING previamente, y 29 es un tipo de dato INT. 
        System.out.println(name);*/

        name = "29";  //Ahora si me permite ingresar el 29, porque lo coloco entre " ", y java lo interpreta como un STRING
        System.out.println(name);
    }
    
}
