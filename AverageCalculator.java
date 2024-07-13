
package com.mycompany.averagecalculator;
public class AverageCalculator {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}