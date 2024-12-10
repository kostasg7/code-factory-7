package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (>100) OR is dark.
 */
public class LightsOn {

    public static void main(String[] args) {
        boolean lightsOn = false;
        boolean isRaining = false;
        boolean isDark = false;
        Scanner in = new Scanner(System.in);
        int speed = 0;

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();
        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();
        System.out.println("Please insert the speed");
        speed = in.nextInt();

        lightsOn = isRaining && (speed > 100 || isDark);
        System.out.println("Lights On: " + lightsOn);
    }
}
