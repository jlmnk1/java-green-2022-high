package site.metacoding.ex21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        while (check) {
            try {
                int x = sc.nextInt();
                System.out.println("받은 값 : " + x);
            } catch (InputMismatchException e) {
                System.out.println("==================");
                System.out.println("문자를 넣지 마세요");
                System.out.println("==================");
                e.printStackTrace();
            } catch (ArithmeticException e) {
                System.out.println("==================");
                System.out.println("0을 나누지 마세요");
                System.out.println("==================");
                e.printStackTrace();
            }
        }

    }
}
