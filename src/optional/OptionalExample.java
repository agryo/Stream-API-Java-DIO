package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // of(value)
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println("of(value): " + optionalValue.get());

        // ofNullable(value)
        String nullableValue = null;
        Optional<String> optionalNullableValue = Optional.ofNullable(nullableValue);
        System.out.println("ofNullable(value) isPresent: " + optionalNullableValue.isPresent());

        // empty()
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("empty() isPresent: " + emptyOptional.isPresent());

        // isPresent()
        Optional<String> presentOptional = Optional.of("Hello");
        System.out.println("isPresent(): " + presentOptional.isPresent());

        // isEmpty() (Java 11+)
        Optional<String> emptyOptionalJava11 = Optional.ofNullable(null);
        System.out.println("isEmpty() (Java 11+): " + emptyOptionalJava11.isEmpty());

        // get()
        Optional<String> getOptional = Optional.of("Hello");
        System.out.println("get(): " + getOptional.get());

        // orElse(defaultValue)
        Optional<String> orElseOptional = Optional.ofNullable(null);
        String resultOrElse = orElseOptional.orElse("Default");
        System.out.println("orElse(defaultValue): " + resultOrElse);

        // orElseGet(supplier)
        Optional<String> orElseGetOptional = Optional.ofNullable(null);
        String resultOrElseGet = orElseGetOptional.orElseGet(() -> "Value from Supplier");
        System.out.println("orElseGet(supplier): " + resultOrElseGet);

        // orElseThrow(exceptionSupplier)
        Optional<String> orElseThrowOptional = Optional.ofNullable(null);
        try {
            String resultOrElseThrow = orElseThrowOptional.orElseThrow(() -> new RuntimeException("Value not present"));
            System.out.println("orElseThrow(exceptionSupplier): " + resultOrElseThrow);
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // ifPresent(consumer)
        Optional<String> ifPresentOptional = Optional.of("Hello");
        ifPresentOptional.ifPresent(value -> System.out.println("Valor presente: " + value));
    }
}