package homeWork1;

import java.util.Scanner;

public class Alphabet {
    public void letter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи букву: ");
        String letter = scanner.nextLine();

        if (letter.equals("a")
                || letter.equals("i")
                || letter.equals("o")
                || letter.equals("u")
                || letter.equals("e")
                || letter.equals("y"))
        {
            System.out.println("Гласная буква");
        } else{
            System.out.println("Согласная буква");

       /* switch (letter) {
            case "a":
                System.out.println("Гласная буква");
                break;
            case "o":
                System.out.println("Гласная буква");
                break;
            case "y":
                System.out.println("Гласная буква");
                break;
            case "u":
                System.out.println("Гласная буква");
                break;
            case "e":
                System.out.println("Гласная буква");
                break;
            case "i":
                System.out.println("Гласная буква");
                break;
            default:
                System.out.println("Согласная буква");
                break;*/

        }
    }
}
