package ntu.thienpnn;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class NumberProcessor {
    private ArrayList<Integer> numbers;


    public NumberProcessor(ArrayList<Integer> numbers) {
        
        this.numbers = new ArrayList<>(numbers);
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

   
    public void removeDuplicates() {
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>(numbers);
        numbers.clear();
        numbers.addAll(set);
    }


    public Integer findSecondLargest() {
        if (numbers.size() < 2) {
            return null; 
        }

        Integer max1 = null;
        Integer max2 = null;

        for (Integer n : numbers) {
            if (max1 == null || n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n < max1 && (max2 == null || n > max2)) {
                max2 = n;
            }
        }
        return max2;
    }


    public double calculateEvenAverage() {
        int sum = 0;
        int count = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                sum += n;
                count++;
            }
        }
        return count == 0 ? 0.0 : (double) sum / count;
    }


    public ArrayList<Integer> getEvenNumbers() {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) evens.add(n);
        }
        return evens;
    }


    public ArrayList<Integer> getOddNumbers() {
        ArrayList<Integer> odds = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 != 0) odds.add(n);
        }
        return odds;
    }


    public void reverseList() {
        int left = 0;
        int right = numbers.size() - 1;
        
        while (left < right) {
 
            int temp = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temp);
            
            left++;
            right--;
        }
    }
}