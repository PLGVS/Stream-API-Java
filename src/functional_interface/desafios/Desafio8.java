package functional_interface.desafios;

// Somar os dígitos de todos os números da lista:
// Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 44);

        int somaDigitos = numeros.stream()
                .map(n -> String.valueOf(n))
                .flatMapToInt(s -> s.chars())
                .map(s -> Character.getNumericValue(s))
                .sum();

        System.out.println("A soma de todos os digitos é " + somaDigitos);
    }
}
