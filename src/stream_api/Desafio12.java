package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Utilizando Stream API para calcular o produto dos números da lista
        int produto = numeros.stream()
                /*
                 * O método "reduce()" é um recurso da Stream API do Java 8 que permite combinar os elementos de uma
                 * coleção de acordo com uma operação especificada e retornar um único resultado. Ele é usado para
                 * reduzir uma sequência de valores a um único valor.
                 * 
                 * A assinatura básica do método é a seguinte:
                 * 
                 *    T reduce(T identity, BinaryOperator<T> accumulator)
                 * 
                 *    identity: Este é um valor inicial que serve como base para a operação de redução.
                 *    É o valor retornado se a coleção estiver vazia. Também é usado como um dos operandos na primeira
                 *    chamada à função de acumulação.
                 * 
                 *    accumulator: Esta é uma função que define a operação de acumulação.
                 *    Ela recebe dois argumentos do mesmo tipo (T) e retorna um resultado do mesmo tipo.
                 *    Essa função é aplicada iterativamente aos elementos da coleção, acumulando os resultados parciais.
                 * 
                 * O método "reduce()" é bastante versátil e pode ser usado para calcular uma variedade de resultados,
                 * como soma, multiplicação, concatenação de strings, encontrar o máximo/mínimo, etc.
                 * Ele é uma ferramenta poderosa na Stream API para executar operações de agregação em coleções de maneira
                 * concisa e funcional.
                 */
                .reduce(1, (a, b) -> a * b);
        
        System.out.println("Produto dos números: " + produto);
    }
}
