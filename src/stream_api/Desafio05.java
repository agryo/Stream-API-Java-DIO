package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtra os números maiores que 5
        numeros.stream()
                .filter(numero -> numero > 5)
                .mapToInt(Integer::intValue) // Converte para um stream de inteiros
                /*
                 * O método "average()" é um método terminal da Stream API que está disponível em fluxos de tipos numéricos, 
                 * como "IntStream", "LongStream" e "DoubleStream". Ele é usado para calcular a média dos elementos no fluxo.
                 * O retorno do método "average()" é um "OptionalDouble", que é um container que pode ou não conter um valor
                 * de ponto flutuante (double). Se o fluxo estiver vazio, o "OptionalDouble" estará vazio também.
                 * Caso contrário, ele conterá a média dos elementos no fluxo.
                 * O método "average()" percorre os elementos no fluxo e calcula a média dos valores numéricos presentes.
                 * Ele não modifica o fluxo original, apenas realiza uma operação terminal para produzir o resultado.
                 */
                .average()
                /*
                 * O método "ifPresent()" é um método da classe "Optional" em Java, que é usada para lidar com valores opcionais
                 * de maneira mais segura e expressiva, evitando verificações manuais de nulos. Ele permite executar um bloco de
                 * código somente se o valor dentro do "Optional" estiver presente, ou seja, não for nulo.
                 * Ex.: void ifPresent(Consumer<? super T> consumer)
                 * Consumer<? super T> consumer é uma função lambda ou referência a método que aceita um valor do tipo T (tipo do
                 * valor dentro do Optional) e não retorna nada.
                 * O método "ifPresent()" verifica se o valor dentro do "Optional" não é nulo. Se o valor estiver presente, ele
                 * chama a função fornecida (consumer) e passa o valor como argumento para essa função. Se o valor estiver ausente
                 * (nulo), a função não é chamada.
                 * O método abaixo pega a média (media) do "average()" e em seguia imprime a mensagem com a média.
                 */
                .ifPresent(media -> System.out.println("Média dos números maiores que 5: " + media));
    }
}
