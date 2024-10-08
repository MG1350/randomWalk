import java.util.Random;
public class randomWalk {
    public static void main(String[] args) {
        int totalSteps = 0;
        int maxSteps = 0;
        for (int i = 0; i < 50; i++) {
            int steps = simWalk(7);
            totalSteps += steps;
            if (steps > maxSteps) {
                maxSteps = steps;
            }
        }
        double averageSteps = (double) totalSteps / 50;
        System.out.println("Average number of steps: " + averageSteps);
        System.out.println("Greatest number of steps: " + maxSteps);
    }
    public static int simWalk(int length) {
        int position = length / 2;
        int steps = 0;
        while (position >= 0 && position < length) {
            steps++;
            int random = (int) (Math.random() + 0.5);
            if (random!=1)
            {
                position -=1;
            }
            else
            {
                position +=1;
            }
        }
        return steps;
    }
}
