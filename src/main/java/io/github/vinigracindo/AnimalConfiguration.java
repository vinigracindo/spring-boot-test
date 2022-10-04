package io.github.vinigracindo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {

    @Bean(name = "dog")
    public Animal dog() {
        return new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Au au");
            }
        };
    }

    @Bean(name = "cat")
    public Animal cat() {
        return new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Miau");
            }
        };
    }
}
