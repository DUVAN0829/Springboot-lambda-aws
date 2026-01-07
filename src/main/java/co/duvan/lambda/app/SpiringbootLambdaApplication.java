package co.duvan.lambda.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpiringbootLambdaApplication {

    @Bean
    public Supplier<String> gretting() { //* GET
        return () -> "Hello word";
    }

    @Bean
    public Consumer<String> printParam() { //* POST
        return System.out::println;
    }

    @Bean
    public Function<String, String> receiveParam() { //* POST
        return String::toUpperCase;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpiringbootLambdaApplication.class, args);
    }

    //* Generar un JSON
    @Bean
    public Supplier<Map<String, Object>> generatedCharacter() {

        return () -> {
            Map<String, Object> character = new HashMap<>();
            character.put("name", "Superman");
            character.put("healthPoints", 100);
            character.put("isHuman", true);
            return character;
        };

    }

    //* Receive a JSON and return String
    @Bean
    public Function<Map<String, Object>, String> receiveCharacter() {
        return (param) -> {
            param.forEach((key, value) -> System.out.println(key + " - " + value.toString()));
            return "Personaje receive";
        };
    }

    //* Receive and OBJECT and return an OBJECT
    @Bean
    public Function<Character, Character> receiveObject() {
        return (param) -> param;
    }

}
