package homeWork2;
public class Difference {
    public void residual() {
        int[] mas = {23, 44, 2, 67, 5, 8, 14, 4};

        int even = 0;
        int odd = 0;
        for (int i = 0; 1 < mas.length; i++) {
            if (i % 2 == 0) {
                even += mas[i];
            } else {
                odd += mas[i];
            }
        }
        int differens = even - odd;
        System.out.println("Разность между чётными и нечётными элементами равна: " + differens);
    }
}


