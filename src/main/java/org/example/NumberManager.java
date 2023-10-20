package org.example;

public class NumberManager {

    public NumberManager() {

    }

    public boolean isPrime(int number) {
        int counter = 0;

        for(int i = 1; i < number + 1; i++) {

            if(number % i == 0) {
                counter++;
            }
        }

        return counter == 2;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isMultiple(int number, int divisor) {
        return number % divisor == 0;
    }

}
