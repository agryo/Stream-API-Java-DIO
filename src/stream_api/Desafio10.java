package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Agrupa os valores ímpares múltiplos de 3 ou 5
        Map<String, List<Integer>> grupos = numeros.stream()
            .filter(numero -> numero % 2 != 0 && (numero % 3 == 0 || numero % 5 == 0))
            /*
             * O método "Collectors.groupingBy()" dentro do "collect" é uma operação de coleta da Stream API em Java, que
             * é usada para agrupar elementos de um fluxo com base em uma função de classificação e criar um mapa onde as
             * chaves são os resultados da classificação e os valores são listas dos elementos correspondentes a cada chave.
             * 
             * Assinatura:
             *       static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> classifier)
             * Onde: 
             *       T é o tipo dos elementos no fluxo.
             *       K é o tipo das chaves do mapa resultante.
             *       "classifier" é uma função que mapeia um elemento "T" para uma chave "K" que será usada para agrupar
             *       os elementos.
             * O método "groupingBy()" percorre o fluxo e coleta os elementos em grupos com base nas chaves geradas pela
             * função de classificação. Ele cria um mapa onde as chaves são os resultados da classificação e os valores são
             * listas dos elementos que correspondem a cada chave. Ele é frequentemente usado quando você deseja agrupar
             * elementos em categorias com base em algum critério. Isso é útil para análise de dados, agregações e
             * organização de informações. Ele é usado para agrupar elementos de um fluxo com base em uma função de classificação
             * e criar um mapa onde as chaves representam as categorias e os valores são listas dos elementos correspondentes
             * a cada categoria.
             */
            .collect(Collectors.groupingBy(numero -> (numero % 3 == 0) ? "Múltiplo de 3" : "Múltiplo de 5"));

        // Exibe o resultado
        grupos.forEach((chave, valores) -> {
            System.out.println(chave + ": " + valores);
        });
    }
}
