package homeWork2;
public class Difference {
    public void razn() {
        int[] mas = {23, 44, 2, 67, 5, 8, 21,4};
        int a = 0;
        int b = 0;
        for (int i = 0; 1 < mas.length; i++) {
            if (i % 2 == 0) {
                a += mas[i];
            } else {
                b += mas[i];
            }
        }
        int differens = a - b;
        System.out.println("Разность между чётными и нечётными элементами равна: " + differens);
    }
}


