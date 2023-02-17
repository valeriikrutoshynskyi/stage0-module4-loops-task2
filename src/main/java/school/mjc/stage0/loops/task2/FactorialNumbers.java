package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int fact = 1;
        while (i <= printToInclusive) {
            System.out.println(fact);
            i++;
            fact = fact * i;
        }
    }
}
