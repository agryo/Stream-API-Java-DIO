package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> ordenados = numeros.stream() //O método "Stream", transforma a lista "numeros" em uma stream.
                /* 
                 * O método "Sorted" abaixo, ordena a lista que agora é um Stream.
                 * Se for "Integer" é ordem crescente, "String" em ordem alfabética, segue a ordem natural.
                 * Ele também pode receber uma ordenação personalizada como um outro método dentro dos parenteses.
                 * Essa ordenação personalizada é um Comparator. "Ex. sorted(Comparator<T> comparator)"
                 * Ex.: ".sorted(Comparator.comparing(Person::getAge))"
                 * Nesse exemplo o método "sorted()" com um comparador criado por "Comparator.comparing()" que se 
                 * baseia no método "getAge()" da classe "Person".
                 * Isso ordenará as pessoas com base em suas idades, do mais jovem ao mais velho.
                 */
                .sorted()
                /*
                 * O método "collect" abaixo, coleta todos os dados do "Stream" e pode transformar em um outro tipo.
                 * Como uma lista, um conjunto, um mapa ou até mesmo realizar uma operação personalizada de agregação.
                 * Na chamada abaixo, ele apenas coleta os dados do "Stream" para uma "List".
                 * Coleta com Filtros e Transformações: Você pode combinar o "collect()" com outras operações intermediárias, 
                 * como "filter()" e "map()", para coletar apenas elementos que atendem a certos critérios ou transformar 
                 * os elementos antes da coleta.
                 */
                .collect(Collectors.toList());

        System.out.println(ordenados);
    }
}
