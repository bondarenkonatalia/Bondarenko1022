package homeWork2;
public class Difference {
    public void residual() {
        int[] mas = {23, 4, 27, 7, 5, 8, 14, 41};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                even += mas[i];
            } else {
                odd += mas[i];
            }
        }
        int difference = even - odd;
        System.out.println("Разность между чётными и нечётными элементами равна: " + difference);
    }
}


