package homeWork2;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Difference {
    private static final IntPredicate MAIN_TEAM = (index) -> index % 2 == 0;
    private static final IntPredicate RESERVE_TEAM = (index) -> index % 2 != 0;

    public void razn() {
        int points[] = {1, 2, 3, 4, 5, 6, 7};

        int mainTeamPointsSum = CalculatePointsSum(points, MAIN_TEAM);
        int reserveTeamPointsSum = CalculatePointsSum(points, RESERVE_TEAM);

        System.out.println("Difference: " + (mainTeamPointsSum - reserveTeamPointsSum));
    }

    private static int CalculatePointsSum(int points[], IntPredicate teamFilter) {
        return IntStream.range(0, points.length)
                .filter(teamFilter)
                .map(index -> points[index])
                .sum();
    }
}
