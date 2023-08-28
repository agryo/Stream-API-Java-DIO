package optional;

import java.util.Optional;

public class OptionalExample {
    /*
     * O "Optional" é uma classe introduzida no Java 8 para lidar com a possibilidade de valores nulos de maneira mais
     * segura e expressiva. Ele é projetado para ajudar a evitar exceções do tipo "NullPointerException" (NPE) ao lidar
     * com valores que podem ser nulos. O objetivo principal do Optional é deixar claro em seu código quando um valor
     * pode ser ausente (null) e forçá-lo a tratar esse cenário de forma explícita.
     * Casos de uso:
     * 1 - Encapsulamento de valores nulos: O Optional permite encapsular um valor que pode ser nulo. Ele pode conter um
     * valor do tipo específico ou ser vazio.
     * 2 - Expressividade: Ao usar Optional, você está explicitamente declarando que um valor pode estar ausente, o que
     * torna o código mais legível e compreensível.
     * 3 - Evitar NPE: O Optional ajuda a evitar exceções NullPointerException, já que você precisa chamar métodos
     * específicos para obter ou manipular o valor encapsulado. Isso obriga o programador a considerar a possibilidade de
     * o valor estar ausente.
     * 4 - Métodos de manipulação: A classe Optional fornece uma variedade de métodos para manipular o valor encapsulado,
     * como "orElse", "orElseGet", "orElseThrow", "ifPresent", "map", "flatMap", entre outros.
     */
    public static void main(String[] args) {
        System.out.println("1 - Optional Of");
        /* 1 - of(value)
         * O método "Optional.of()" é um dos métodos estáticos fornecidos pela classe "Optional" no Java. Ele é usado para
         * criar uma instância de "Optional" que contém um valor presente (não nulo).
         * Aqui está a assinatura do método:
         * 
         *      public static <T> Optional<T> of(T value)
         * 
         *      O parâmetro "value" é o valor que você deseja encapsular no "Optional". A ideia é que esse valor não seja
         *      nulo. Se você passar um valor nulo para o método "of()", ele lançará uma exceção do tipo
         *      "NullPointerException".
         * 
         * O método "Optional.of()" não permite que o valor passado seja nulo.
         * Normalmente usado na criação do método "getter".
         */
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println("of(value): " + optionalValue.get() + "\n");

        System.out.println("2 - Optional Of Nullable");
        /* 2 - ofNullable(value)
         * O método "Optional.ofNullable()" é um dos métodos estáticos fornecidos pela classe "Optional" no Java. Ele é
         * usado para criar uma instância de "Optional" que pode conter um valor nulo ou um valor não nulo.
         * Aqui está a assinatura do método:
         * 
         *      public static <T> Optional<T> ofNullable(T value)
         * 
         *      O parâmetro "value" é o valor que você deseja encapsular no "Optional". Se o valor for não nulo, ele será
         *      encapsulado normalmente. Se o valor for nulo, o Optional resultante será vazio.
         * 
         * Dessa forma, o uso do "Optional.ofNullable()" permite que você trabalhe com valores que podem ser nulos de
         * maneira mais expressiva, evitando "NullPointerException" e indicando claramente a possibilidade de um valor
         * ausente. Normalmente usado na criação do método "getter".
         */
        String nullableValue = null;
        Optional<String> optionalNullableValue = Optional.ofNullable(nullableValue);
        System.out.println("ofNullable(value) isPresent: " + optionalNullableValue.isPresent() + "\n");

        System.out.println("3 - Optional Empty");
        /* 3 - empty()
         * O método "Optional.empty()" é um método estático fornecido pela classe "Optional" no Java. Ele é usado para
         * criar uma instância de Optional "vazia", o que significa que não contém nenhum valor.
         * Aqui está a assinatura do método:
         * 
         *      public static <T> Optional<T> empty()
         * 
         *      O método "empty()" não aceita nenhum parâmetro, pois ele sempre cria um "Optional vazio", ou seja, sem valor.
         * 
         * O "Optional.empty()" pode ser usado em cenários onde você deseja indicar explicitamente que um valor está
         * ausente, sem precisar usar um valor nulo. Isso torna o código mais claro sobre a intenção de não ter um valor e
         * evita possíveis exceções "NullPointerException". Normalmente usado na criação do método "getter".
         */
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("empty() isPresent: " + emptyOptional.isPresent() + "\n");

        System.out.println("4 - Optional isPresent");
        /* 4 - isPresent()
         * O método "isPresent()" é um método fornecido pela classe "Optional" no Java que verifica se um valor está
         * presente no "Optional" ou se ele está vazio (não contém um valor). Ele retorna "true" se o valor estiver
         * presente e "false" se estiver vazio.
         * Aqui está a assinatura do método:
         * 
         *      public boolean isPresent()
         * 
         *      O método "isPresent()" é usado para verificar se você pode extrair com segurança um valor do "Optional" sem
         *      causar uma exceção. Ele é uma maneira de testar se um valor está disponível para uso.
         * 
         * "isPresent()": Este método retorna "true" se um valor está "presente" no Optional e "false" caso contrário. Ou seja,
         * ele verifica se o "Optional" contém um valor "não nulo". Pode ser usado diretamente para fazer a verificação.
         * O uso do método "isPresent()" é uma maneira segura de verificar a presença de um valor dentro de um "Optional" e
         * ajuda a evitar possíveis exceções "NullPointerException".
         */
        Optional<String> presentOptional = Optional.of("Hello");
        System.out.println("isPresent(): " + presentOptional.isPresent() + "\n");

        System.out.println("5 - Optional isEmpty");
        /* 5 - isEmpty() (Java 11+)
         * O método "isEmpty()" é um método introduzido no Java 11 na classe "Optional". Ele verifica se um "Optional" está
         * vazio, o que significa que "não contém um valor presente". O método retorna "true" se o Optional estiver "vazio"
         * e "false" se contiver um valor.
         */
        Optional<String> emptyOptionalJava11 = Optional.ofNullable(null);
        System.out.println("isEmpty() (Java 11+): " + emptyOptionalJava11.isEmpty() + "\n");

        System.out.println("6 - Optional Get");
        /* 6 - get()
         * O método "get()" é usado para obter o valor encapsulado dentro de um "Optional", se estiver presente.
         * No entanto, ele deve ser usado com cuidado, pois se o valor não estiver presente (ou seja, se o Optional
         * estiver vazio), ele lançará uma exceção "NoSuchElementException".
         * No entanto, é importante usar o "get()" somente quando você tem certeza de que um valor está presente, caso
         * contrário, é melhor usar métodos como "orElse()", "orElseGet()" ou "orElseThrow()" para lidar com o caso em
         * que o Optional está vazio. Isso ajuda a evitar exceções indesejadas em tempo de execução.
         */
        Optional<String> getOptional = Optional.of("Hello");
        System.out.println("get(): " + getOptional.get() + "\n");

        System.out.println("7 - Optional orElse");
        /* 7 - orElse(defaultValue)
         * O método "orElse()" faz parte da classe "Optional" em Java e é usado para fornecer um "valor padrão" quando
         * o valor encapsulado no Optional não está presente, ou seja, quando o Optional está vazio. Esse método ajuda
         * a evitar exceções do tipo "NoSuchElementException" que poderiam ocorrer se você usasse o método "get()" em
         * um Optional vazio.
         * 
         * Caso de uso:
         * O uso de "orElse()" é útil em situações em que você deseja fornecer um valor de "substituição" quando o valor
         * original não está presente. Isso é especialmente útil para evitar exceções de "NullPointerException" ao acessar
         * valores nulos ou quando o valor pode estar ausente em determinados cenários. Alguns casos de uso comuns incluem:
         * 1 - Configurações Padrão: Imagine um aplicativo que busca uma configuração específica. Se a configuração não
         * estiver disponível, você pode usar "orElse()" para fornecer um valor padrão para evitar problemas no
         * funcionamentodo aplicativo.
         * 2 - Carregamento de Dados: Ao recuperar dados de um banco de dados ou de um serviço, você pode usar "orElse()"
         * para retornar um valor padrão caso o dado não esteja presente.
         * 3 - Processamento de Resultados: Em algoritmos de busca, você pode usar "orElse()" para retornar um resultado
         * padrão quando a busca não encontra nenhum resultado.
         * 
         * Lembre-se de que "orElse()" sempre retorna um valor, independentemente do Optional estar vazio ou não. Se você
         * quiser um comportamento mais flexível que permite a geração do valor padrão apenas quando necessário (ou seja,
         * quando o Optional estiver vazio), você pode considerar o uso de orElseGet() em vez de orElse().
         */
        Optional<String> orElseOptional = Optional.ofNullable(null);
        String resultOrElse = orElseOptional.orElse("Mensagem Padrão");
        System.out.println("orElse(defaultValue): " + resultOrElse + "\n");

        System.out.println("8 - Optional orElseGet");
        /* 8 - orElseGet(supplier)
         * O método "orElseGet()" também faz parte da classe Optional em Java e é usado para fornecer um valor padrão
         * gerado por uma função (ou método) quando o valor encapsulado no Optional não está presente, ou seja, quando
         * o Optional está vazio. A principal diferença entre "orElseGet()" e "orElse()" é que o valor padrão em
         * "orElseGet()" é calculado apenas quando necessário, ou seja, somente se o Optional estiver vazio. Isso pode
         * ser útil quando calcular o valor padrão é uma operação mais complexa ou dispendiosa.
         * Ele recebe um "Supplier" (um tipo de função que não recebe argumentos e retorna um valor) que é usado para
         * gerar o valor padrão apenas se o "Optional" estiver vazio.
         * 
         * Caso de uso:
         * O uso de "orElseGet()" é recomendado quando o valor padrão requer algum cálculo ou processamento significativo,
         * que só deve ser realizado quando o valor não está presente. Alguns casos de uso incluem:
         * 1 - Carregamento Tardio (Lazy Loading): Quando o cálculo do valor padrão é dispendioso em termos de tempo ou
         * recursos, usar "orElseGet()" garante que esse cálculo só seja realizado quando o valor for necessário.
         * 2 - Dados Dinâmicos: Se o valor padrão depende de dados externos ou de alguma lógica dinâmica, você pode usar
         * "orElseGet()" para calcular esse valor apenas quando necessário.
         * 3 - Geração de Valores Aleatórios: Se o valor padrão for um valor aleatório, você pode usar "orElseGet()" para
         * gerar esse valor somente quando ele for realmente utilizado.
         * 
         * Lembre-se de que a abordagem de usar "orElseGet()" em vez de "orElse()" é uma otimização para evitar cálculos
         * desnecessários. Se o cálculo do valor padrão for simples e não dispendioso, orElse() também pode ser uma opção
         * viável.
         */
        Optional<String> orElseGetOptional = Optional.ofNullable(null);
        String resultOrElseGet = orElseGetOptional.orElseGet(() -> "Value from Supplier");
        System.out.println("orElseGet(supplier): " + resultOrElseGet + "\n");

        System.out.println("9 - Optional orElseThrow");
        /* 9 - orElseThrow(exceptionSupplier)
         * O método "orElseThrow()" faz parte da classe Optional em Java e é usado para lançar uma exceção personalizada
         * quando o valor encapsulado no Optional não está presente, ou seja, quando o Optional está vazio. Isso é útil
         * quando você deseja garantir que um valor esteja presente e, se não estiver, deseja sinalizar isso por meio de
         * uma exceção específica.
         * Ele recebe um "Supplier" (um tipo de função que não recebe argumentos e retorna um valor) que é usado para gerar
         * a exceção a ser lançada quando o "Optional" está vazio. Por exemplo, no caso de uma exceção do tipo
         * "RuntimeException" com a mensagem "Valor não encontrado", caso o Optional esteja vazio, será lançada a mensagem.
         * 
         * Caso de uso:
         * O uso de "orElseThrow()" é apropriado quando você considera que um valor deve estar presente e a ausência desse
         * valor é uma condição excepcional que precisa ser tratada de forma específica. Alguns casos de uso incluem.
         * 1 - Requisitos Essenciais: Quando você espera que um valor esteja presente para o funcionamento correto do seu
         * código ou para cumprir um requisito essencial.
         * 2 - Validação e Pré-condições: Se um valor ausente representar uma falha na validação ou nas pré-condições do
         * seu código, você pode usar "orElseThrow()" para lançar uma exceção indicando a violação.
         * 3 - Tratamento de Erros Específicos: Se você deseja lançar um tipo específico de exceção quando um valor não está
         * presente, isso pode ajudar a identificar mais facilmente o problema em situações de depuração.
         * 
         * Lembre-se de que, ao usar "orElseThrow()", é importante escolher o tipo de exceção adequado para a situação e
         * fornecer informações relevantes na mensagem de exceção para facilitar a depuração e o entendimento do problema.
         */
        Optional<String> orElseThrowOptional = Optional.ofNullable(null);
        try {
            String resultOrElseThrow = orElseThrowOptional.orElseThrow(() -> new RuntimeException("Value not present"));
            System.out.println("orElseThrow(exceptionSupplier): " + resultOrElseThrow + "\n");
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage() + "\n");
        }

        System.out.println("10 - Optional ifPresent");
        /* 10 - ifPresent(consumer)
         * O método "ifPresent()" é um método da classe Optional em Java, e é usado para executar um bloco de código
         * somente se o valor encapsulado no Optional estiver presente, ou seja, quando o Optional não estiver vazio.
         * Ele fornece uma maneira concisa de executar ações somente quando um valor está disponível, evitando a
         * necessidade de verificar explicitamente a presença do valor.
         * Ele recebe um "Consumer" (um tipo de função que aceita um argumento, mas não retorna nenhum valor) e executa
         * essa função somente se o "Optional" não estiver vazio. No caso, a função lambda imprime o valor somente se
         * ele estiver presente.
         * 
         * Caso de uso:
         * O método "ifPresent()" é útil em situações em que você deseja realizar uma ação somente se um valor estiver
         * presente, sem a necessidade de verificar manualmente a presença do valor usando "isPresent()" ou "get()".
         * Alguns casos de uso incluem:
         * 1 - Notificações e Logs Opcionais: Quando você deseja registrar informações, enviar notificações ou realizar
         * ações de log somente quando um valor está presente.
         * 2 - Manipulação Opcional: Em vez de envolver todo o bloco de código com verificações de nulidade, você pode
         * usar "ifPresent()" para executar uma manipulação específica se um valor estiver disponível.
         * 3 - Integração com APIs Funcionais: O método "ifPresent()" é particularmente útil quando você trabalha com
         * APIs funcionais, como expressões lambda e streams, onde operações precisam ser executadas apenas se um valor
         * estiver presente. 
         * 
         * Lembre-se de que "ifPresent()" é uma alternativa conveniente para situações em que você deseja realizar uma
         * ação específica somente se um valor estiver presente. Se você precisar executar ações diferentes com base na
         * presença ou ausência do valor, pode ser necessário considerar outros métodos e abordagens do Optional, como
         * "orElse()", "orElseGet()" ou "orElseThrow()".
         */
        Optional<String> ifPresentOptional = Optional.of("Hello");
        ifPresentOptional.ifPresent(value -> System.out.println("Valor presente: " + value + "\n"));
    }
}