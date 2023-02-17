package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int currentNumber = 0;
        while (true) {
            int result = currentNumber * multiplyByAndToInclusive;
            if (multiplyByAndToInclusive != 0) {
                System.out.println(result);
            }
            if (multiplyByAndToInclusive > 0) {
                if (currentNumber == multiplyByAndToInclusive) {
                    break;
                }
            } else if (multiplyByAndToInclusive < 0) {
                if (currentNumber == -multiplyByAndToInclusive) {
                    break;
                }
            } else if (multiplyByAndToInclusive == 0) {
                break;
            }
            currentNumber++;
        }
    }
}
