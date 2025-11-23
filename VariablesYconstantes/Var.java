package VariablesYconstantes;

public class Var {

    public static void main(String[] args) { // var es una forma de declarar varaibles automaticamente segun el tipo de
                                             // valor q se le asigna
        var name = "Barcelona"; // JAVA INFIERE QUE ES STRING
        var age = 39; // JAVA INFIERE QUE ES INT
        var mundial = true; // JAVA INFIERE QUE ES BOOLEANO

        System.out.println(name);
        System.out.println(age);
        System.out.println(mundial);
    }

}
