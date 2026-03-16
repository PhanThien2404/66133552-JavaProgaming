package ntu.thienpnn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();

      
        System.out.print("Nhập số lượng phần tử của danh sách: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            inputList.add(scanner.nextInt());
        }

        
        NumberProcessor processor = new NumberProcessor(inputList);
        System.out.println("\n--- DANH SÁCH BAN ĐẦU ---");
        System.out.println(processor.getNumbers());

     
        processor.removeDuplicates();
        System.out.println("\n1. Sau khi loại bỏ trùng lặp:");
        System.out.println(processor.getNumbers());

  
        Integer secondLargest = processor.findSecondLargest();
        if (secondLargest != null) {
            System.out.println("\n2. Số lớn thứ 2 trong danh sách là: " + secondLargest);
        } else {
            System.out.println("\n2. Không có số lớn thứ 2 trong danh sách.");
        }

   
        double avgEven = processor.calculateEvenAverage();
        System.out.println("\n3. Trung bình cộng các số chẵn: " + avgEven);

 
        System.out.println("\n4. Tách danh sách:");
        System.out.println("   - Danh sách số chẵn: " + processor.getEvenNumbers());
        System.out.println("   - Danh sách số lẻ: " + processor.getOddNumbers());

      
        processor.reverseList();
        System.out.println("\n5. Danh sách sau khi đảo ngược:");
        System.out.println(processor.getNumbers());

        scanner.close();
    }
}