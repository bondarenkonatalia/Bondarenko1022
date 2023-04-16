package homeWork2;

import java.util.Arrays;

public class SumElementov {

    public void sloj() {
        {
            int[] aray = {6, 8, 3, 5, 1, 9};
            Arrays.sort(aray);
            int sum = aray[0] + aray[aray.length-1];

            System.out.println(sum);
        }
    }
}