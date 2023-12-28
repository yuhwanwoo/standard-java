package ch10;

import java.text.ChoiceFormat;

public class ChoiceFormatTest {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90};
        String[] grades = {"D", "C", "B", "A"};

        int[] scores = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for (int score : scores) {
            System.out.println("score = " + score + ": " +form.format(score));
        }
    }
}
