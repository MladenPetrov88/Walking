import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        int stepsWalked = 0;
        while (stepsWalked < 10000) {
            String input = scanner.nextLine();
            if (input.equals("Going home")){
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                stepsWalked = stepsWalked + stepsToHome;
                break;
            }
            int currentStepsWalked = Integer.parseInt(input);
            stepsWalked = stepsWalked + currentStepsWalked;
        }

        if (stepsWalked >= goal) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", goal - stepsWalked);
        }


    }
}
