public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        /* <- Exemplos de variaveis -> */
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;
        System.out.println(salario);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; /* -> exemplo de casting */

        /*<- Variáveis e Constantes -> */

        /* Variáveis */
        int numero = 10;
        numero = 11;
        System.out.println(numero);

        /* Constantes */
        /*Nomes de Variáveis constantes devem ser escritas com CAIXA ALTA*/
        final double VALOR_DE_PI = 3.14;
    }
}
