package homeWork1;

import java.util.Scanner;

public class Sum {

    public void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int first = scanner.nextInt();

        System.out.println("Введите ещё оно число: ");
        int second = scanner.nextInt();

        int sum = 0;

        for (int i = first + 1; i < second; i++) {

            if (i % 3 == 0) {
                sum += 1;
            }
        }
            System.out.println("Сумма всех чисел, которые делятся на 3 и расположены между "
                    + first + " и " + second + " = " + sum);

        }
    }
