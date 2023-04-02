package homeWork1;

import java.util.Scanner;

public class Words {
    public void Codeword() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите слово: ");
            String Codeword = scanner.nextLine().toLowerCase();

            if (Codeword.equals("exit")) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Попробуйте ещё:" + Codeword);
            }
        }
        scanner.close();

    }
}
