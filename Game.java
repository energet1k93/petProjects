import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000); // Генерирует новое число от 0 до 1000

        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("I wish a number from 0 to 1000.");
        System.out.println("Your turn:");

        while (userInput != randomInt) { // Напишите условие цикла для запуска игры

            userInput = scanner.nextInt(); // В этой переменной должен сохраняться ввод пользователя

        if ( userInput > randomInt) { // Условие проверяется в цикле
            System.out.println("Less");
        } else if (userInput < randomInt) {
            System.out.println("More");
        } else {
            System.out.println("CONGRATULATION!");
        }
        }
    }
}