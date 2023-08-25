package task1;

import java.util.Scanner;


public class MyNewException{

    public static void checkPositivNumb(int numb) throws InvalidNumberException{
        if(numb <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
        System.out.println("Число корректно");
    }

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     
        try {
            System.out.print("Введите целое число: ");
            int number = sc.nextInt();
            checkPositivNumb(number);
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}


class InvalidNumberException extends Exception {

    public InvalidNumberException(String message){
        super(message);
    }
}

