package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
            /*
             * O método "filter()" é usado para filtrar os elementos do "Stream" com base em uma 
             * condição especificada. Ele retorna um novo Stream contendo apenas os elementos que 
             * atendem à condição. No método abaixo, ele filtra os números e verifica se o resultado 
             * do número dividido por dois é igual a zero. (Verifica se é par)
             * Pode ser feito um novo "filter()" encadeado para filtar mais.
             * (Ex.: ".filter(n -> n > 5)") Nesse exemplo ele verifica os números pares maiores que cinco.
             * E assim sucessivamente caso precise.
             */
            .filter(n -> n % 2 == 0)
            /*
             * O método "mapToInt()" é uma operação intermediária em Streams do Java que é usada para transformar
             * os elementos de um Stream em valores inteiros. Serve para mapear os elementos para tipos primitivos "int"
             * em vez de objetos. A principal vantagem de usar "mapToInt()" é que ele retorna um "IntStream", que é uma 
             * subinterface de Stream otimizada para lidar com valores inteiros primitivos. Resulta em melhor desempenho 
             * e economia de memória em relaçao ao "map()".
             * No método abaixo, ele está transformando os elementos em valores inteiros primitivos "int". (".mapToInt()")
             * Em seguia dentro dos parênteses ele faz referência a classe "Integer" (da List la em cima) e usa o método
             * "intValue" da classe "Integer" para pegar os valores inteiros dessa "List" com o nome "numeros".
             */
            .mapToInt(Integer::intValue)
            /*
             * O método "sum()" é uma operação terminal disponível em Streams do Java que é usada para calcular a soma dos 
             * elementos de um Stream de valores numéricos. Essa operação é bastante útil quando você deseja obter a soma 
             * total dos valores contidos no Stream.
             * O método sum() só está disponível em Streams de tipos numéricos, como "IntStream", "LongStream" e "DoubleStream".
             * Ele retorna o resultado da soma como um valor do mesmo tipo numérico do Stream. 
             * Se o Stream estiver vazio, o "sum()" retornará "0".
             * O sum() é uma operação de redução, o que significa que é uma operação terminal que combina os elementos do 
             * Stream em um único resultado.
             */
            .sum();

        System.out.println(somaPares);
    }
}
