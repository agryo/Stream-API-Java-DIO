package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontra o segundo número maior da lista
        Integer segundoMaior = numeros.stream()
            /*
             * O método "distinct()" é um método intermediário da Stream API em Java, que é usado para eliminar elementos
             * duplicados de um fluxo. Ele retorna um novo fluxo contendo apenas os elementos únicos da fonte original,
             * removendo repetições. O "distinct()" percorre os elementos do fluxo e mantém apenas a primeira ocorrência
             * de cada elemento, descartando as ocorrências subsequentes. Ele não garante a ordem dos elementos originais.
             * Os elementos únicos resultantes serão preservados, mas a ordem pode ser alterada.
             */
            .distinct() // Remove duplicatas
            .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
            /*
             * O método "skip()" é um método intermediário da Stream API em Java, que é usado para pular os primeiros "N"
             * elementos de um fluxo e retornar um novo fluxo que começa após esses elementos. "n" é o número de elementos
             * que você deseja pular. Ele percorre o fluxo, ignorando os primeiros "N" elementos especificados e retornando
             * um novo fluxo que começa após esses elementos.
             * Processamento de Lotes: Se você estiver processando uma grande quantidade de dados em lote e desejar processar
             * apenas parte dos elementos de cada vez, skip() pode ser útil.
             * Remoção de Cabeçalho: Quando você tem um fluxo de linhas em um arquivo, pode usar skip(1) para pular a primeira
             * linha (cabeçalho) antes de processar o restante.
             */
            .skip(1) // Pula o primeiro elemento (maior)
            /*
             * O método "findFirst()" é um método terminal da Stream API em Java, que é usado para encontrar o primeiro elemento
             * do fluxo que atende a uma determinada condição. Ele retorna um "Optional" contendo o primeiro elemento encontrado,
             * ou um "Optional" vazio se nenhum elemento atender à condição. Ele percorre o fluxo e retorna o primeiro elemento
             * que atende à condição especificada. Se nenhum elemento atender à condição, o método retorna um "Optional" vazio.
             * Busca do Primeiro Elemento: Quando você precisa encontrar o primeiro elemento que atende a uma condição específica.
             * Seleção Aleatória: Se você quiser selecionar um elemento aleatório de um fluxo (pode não ser verdadeiramente
             * aleatório, mas sim o primeiro que atende à condição).
             */
            .findFirst() // Pega o primeiro elemento restante (segundo maior)
            /*
             * O método "orElse()" é um método da classe "Optional" em Java, que é usado para obter o valor contido dentro do
             * "Optional" ou um valor padrão caso o "Optional" esteja vazio.
             * Ex.: "T orElse(T other)" "other" é o valor padrão que será retornado se o "Optional" estiver vazio.
             * O método "orElse()" retorna o valor contido dentro do "Optional" se ele estiver presente. Se o "Optional" estiver
             * vazio, o valor padrão (other) é retornado.
             */
            .orElse(null); // Se não houver, retorna null

        if (segundoMaior != null) {
            System.out.println("O segundo número maior da lista é: " + segundoMaior);
        } else {
            System.out.println("A lista não tem um segundo número maior.");
        }
    }
}
