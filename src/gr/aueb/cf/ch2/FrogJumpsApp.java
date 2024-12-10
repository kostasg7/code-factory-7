package gr.aueb.cf.ch2;

/**
 *  X = 10
 *  Y = 85
 *  D * 30
 *  Jumps = 3
 *  70 + 30 = 70
 *  70 + 30 = 100
 */
public class FrogJumpsApp {

    public static void main(String[] args) {

        final int HOP = 30;
        int start = 10;
        int target = 85;
        int jumps = 0;

        //calculate jumps
        jumps = (int) Math.ceil((target - start) / (double) HOP);
//        while (start < target) {
//            start = start + HOP;
//            jumps++;
//        }
        System.out.println("Jumps: " + jumps);
    }
}
