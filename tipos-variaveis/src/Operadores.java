public class Operadores {
    public static void main(String[] args) {
        /*
         * <- Exemplo de concatenação +, debugar o código para ver o resultado ->
         * 
         * String concatenacao = "?";
         * 
         * concatenacao = 1 + 1 + 1 + "1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + 1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + "1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + 1 + 1 + 1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + (1 + 1 + 1);
         * System.out.println(concatenacao);
         */

        /*
         * <-Operador unario +->
         * int numero = 5;
         * 
         * numero = - numero;
         * System.out.println(numero);
         * 
         * numero = numero * -1;
         * System.out.println(numero);
         */

        /*
         * System.out.println(++numero); -> soma +1 primeiro e depois imprime (o mesmo
         * para decremento)
         * System.out.println(++numero); -> imprime primeiro e depois soma + 1(o mesmo
         * para decremento)
         * <- incremento ->
         * int numero = 5;
         * System.out.println(numero++);
         * 
         * <- decremento ->
         * int numero = 5;
         * System.out.println(numero--);
         */

        /*
         * Boolean, inversão de valores
         * boolean verdadeiro = true;
         * verdadeiro = !verdadeiro;
         * System.out.println("Inverteu " + verdadeiro);
         */

        /*
         * <-If Ternário ->
         * 
         * int a, b;
         * 
         * a = 5;
         * b = 6;
         * String resultado = a==b ? "verdadeiro" : "falso";
         * 
         * System.out.println(resultado);
         */

        /*
         * Operadores Relacionais
         * 
         * String nome1 = "JASON";
         * String nome2 = new String("JASON");
         * 
         * System.out.println(nome1 == nome2); -> Resultado falso
         * System.out.println(nome1.equals(nome2)); -> Resultado verdadiro
         * 
         * int numero1 = 1;
         * int numero2 = 2;
         * 
         * boolean simNao = numero1 == numero2;
         * 
         * System.out.println("numeroUm é igual a numeroDois? "+ simNao);
         * 
         * simNao = numero1 != numero2;
         * 
         * System.out.println("numeroUm é diferente do numeroDois? "+ simNao);
         * 
         * simNao = numero1 > numero2;
         * 
         * System.out.println("numeroUm é maior que numeroDois? "+ simNao);
         */

        /*
         * <- Operadores Lógicos ->
         */

        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && (7 > 4)) {
            System.out.println("as duas condições são verdadeiras");
        } 

        if(condicao1 || condicao2) {
            System.out.println("Uma duas condições são verdadeiras");
        }
    }
}
