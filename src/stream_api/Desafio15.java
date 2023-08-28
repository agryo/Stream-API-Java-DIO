package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        /*
         * O método "asList()" aceita um número variável de argumentos do tipo especificado (exemplo  T) e retorna
         * uma lista contendo esses elementos. Os elementos podem ser objetos individuais ou um array.
         * Array para Lista: Se você passar um array como argumento para o método asList(), ele criará uma lista que
         * "envolve" o array existente. Isso significa que a lista criada é uma visão da mesma memória que o array
         * original, ou seja, quaisquer alterações feitas na lista serão refletidas no array e vice-versa.
         * Tamanho Fixo: Se a lista é criada a partir de um array existente, a lista resultante terá um tamanho fixo
         * que corresponde ao tamanho do array. Isso significa que você não pode adicionar ou remover elementos dessa
         * lista, apenas modificar os valores dos elementos existentes.
         * Não Suporta Operações de Modificação: Como mencionado acima, a lista criada pelo asList() não suporta adição,
         * remoção ou redimensionamento de elementos. Tentar realizar essas operações lançará uma exceção
         * "UnsupportedOperationException".
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando Stream API para verificar se a lista contém pelo menos um número negativo
        boolean contemNegativo = numeros.stream()
                                       .anyMatch(num -> num < 0);

        System.out.println("A lista contém número negativo? " + contemNegativo);
    }
}
