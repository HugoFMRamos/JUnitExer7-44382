package org.example;

public class NumberManager {

    public NumberManager() {
    }

    public boolean isPrime(int number) {
        for(int i = 2; i <= number - 1; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isMultiple(int number, int divisor) {
        return number % divisor == 0;
    }
}
