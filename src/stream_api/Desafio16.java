package stream_api;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Desafio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        /*
         * O método "close()" é um método definido na interface "java.io.Closeable" e em suas subclasses, como
         * "java.util.Scanner", que implementam essa interface. Ele é usado para liberar recursos associados a um
         * objeto após o uso, como arquivos, sockets, streams ou qualquer recurso que precise ser fechado para
         * evitar vazamentos de recursos e garantir um gerenciamento adequado.
         * No contexto do "java.util.Scanner", o método "close()" é usado para fechar o scanner e liberar qualquer
         * recurso que ele tenha alocado internamente, como leitores de entrada ou streams. É importante fechar o
         * scanner quando você não precisar mais ler a entrada, pois isso garante que os recursos sejam liberados.
         */
        entrada.close();

        // Utilizando Stream API para calcular o fatorial do número
        /*
         * O método "LongStream.rangeClosed()" é um método estático da classe "java.util.stream.LongStream" introduzido
         * no Java 8 como parte da Stream API. Ele é usado para criar um fluxo de números inteiros longos em um intervalo
         * fechado (inclusivo), ou seja, um intervalo que inclui os limites especificados. 
         * 
         * A assinatura básica do método é a seguinte:
         * 
         * public static LongStream rangeClosed(long startInclusive, long endInclusive)
         * 
         *      startInclusive: O valor de início do intervalo, que está incluído no fluxo.
         *      endInclusive: O valor final do intervalo, que também está incluído no fluxo.
         * 
         * Ele gera um fluxo de números inteiros longos a partir do "startInclusive" até o "endInclusive", inclusivamente.
         * Isso significa que ambos os limites do intervalo são incluídos no fluxo.
         */
        long fatorial = LongStream.rangeClosed(1, numero)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Fatorial de " + numero + ": " + fatorial);
    }
}
