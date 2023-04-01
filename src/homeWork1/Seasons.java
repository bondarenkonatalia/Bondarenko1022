package homeWork1;

import java.util.Scanner;

public class Seasons {

    public static void Month(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String Month = scanner.nextLine().toLowerCase();

        switch (Month) {
            case "декабрь":
                System.out.println("зима");
                break;
            case "январь":
                System.out.println("зима");
                break;
            case "февраль":
                System.out.println("зима");
                break;
            case "март":
                System.out.println("весна");
                break;
            case "апрель":
                System.out.println("весна");
                break;
            case "май":
                System.out.println("весна");
                break;
            case "июнь":
                System.out.println("лето");
                break;
            case "июль":
                System.out.println("лето");
                break;
            case "август":
                System.out.println("лето");
                break;
            case "сентябрь":
                System.out.println("осень");
                break;
            case "октябрь":
                System.out.println("осень");
                break;
            case "ноябрь":
                System.out.println("осень");
                break;
            default:
                System.out.println("Проверьте правильность написания месяца");
                break;

    }
    }
}
