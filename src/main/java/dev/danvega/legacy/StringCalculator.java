package dev.danvega.legacy;

public class StringCalculator {

    public int add(String numbers) {
        int sum = 0;
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

    public int subtract(String numbers) {
        int difference = 0;
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            difference = Integer.parseInt(numbersArray[0]) - Integer.parseInt(numbersArray[1]);
        }
        return difference;
    }

}
