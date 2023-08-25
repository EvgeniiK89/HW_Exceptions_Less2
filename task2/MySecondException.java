package task2;

import java.util.Scanner;

public class MySecondException {
    
    public static double divide(int dividend, int divisor) throws DivisionByZeroException{
        if(divisor == 0) {
            throw new DivisionByZeroException("Деление на 0 недопустимо");
        }
        return (double) dividend / divisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите первое целое число: ");
            int num1 = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            int num2 = sc.nextInt();
            System.out.println(divide(num1, num2));
            
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}


class DivisionByZeroException extends Exception {

    public DivisionByZeroException(String message){
        super(message);
    }
}



