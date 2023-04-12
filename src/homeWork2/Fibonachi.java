package homeWork2;

public class Fibonachi {
    public int[] fib(int value) {
        int[] mas = new int [value];
        mas[1] = 1;
        for (int i = 2; i < mas.length; i++) {
            if (i < 2) {
                mas[i] = 1;
            } else {
                mas[i] = mas[i - 2] + mas[i - 1];
            }
        }
        return mas;
    }
}