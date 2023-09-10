import java.util.Scanner;
public class BDDriverA
{
    public static void main(String[] args) {
        // Create a "regular" die
        BiasedDie normal = new BiasedDie(6);
        // Create a "regular" die using the other constructor
        int[] sides = {1,2,3,4,5,6}; //a regular die
        BiasedDie normal2 = new BiasedDie(sides);
        // Create a weird nine-sided die
        int[] sidesNine = {2,4,6,6,8,8,8,8,8};
        BiasedDie weirdNine = new BiasedDie(sidesNine);
        //Create a weird eight-sided die
        int[] sidesEight = {1,4,4,4,5,5,5,8};
        BiasedDie weirdEight = new BiasedDie(sidesEight);
        // Print out descriptions of each die
        System.out.println("Normal:\n" + normal + "\n");
        System.out.println("Normal2:\n" + normal2 + "\n");
        System.out.println("Weird (9):\n" + weirdNine + "\n");
        System.out.println("Weird (8):\n" + weirdEight + "\n");
        //Scan in an input
        Scanner scnr = new Scanner(System.in);
        int m = scnr.nextInt();
        // Create Die A
        int[] Die1 = {3,3,3,3,3,6}; //a regular die
        BiasedDie DieA = new BiasedDie(Die1);
        
        // Create Die B
        int[] Die2 = {2,2,2,5,5,5};
        BiasedDie DieB = new BiasedDie(Die2);
        
        //Create Die C
        int[] Die3 = {1,4,4,4,4};
        BiasedDie DieC = new BiasedDie(Die3);
        int i = 0;
        double counterAvB = 0.0;
        //Counter that stores the amount of wins where A beats B
        for (i = 0; i < m; i++) {
            if (DieA.defeats(DieB)) {
                counterAvB++;
            }
        }
        double counterBvC = 0.0;
        //Counter that stores the amount of wins where B beats C
        for (i = 0; i < m; i++) {
            if (DieB.defeats(DieC)) {
                counterBvC++;
            }
        }
        double counterCvA = 0.0;
        //Counter that stores the amount of wins where C beats A
        for (i = 0; i < m; i++) {
            if (DieC.defeats(DieA)) {
                counterCvA++;
            }
        }
        // Print out descriptions of each die
        System.out.println(Die1.equals(Die2));
        System.out.println(Die1.equals(Die3));
        System.out.println(Die2.equals(Die3));
        System.out.println("Number of times games played: " + m);
        System.out.println("A beats B " + counterAvB * 100 / m + "% of the time.");
        System.out.println("B beats C " + counterBvC * 100 / m + "% of the time.");
        System.out.println("C beats A " + counterCvA * 100 / m + "% of the time.");
    }
}