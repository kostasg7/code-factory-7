package gr.aueb.cf.ch14.ch14exercises;

public class Main {

    public static void main(String[] args) {
        int[] arr ={5, 10, 15, 1, 33, -5};

        Logger logger = Logger.getInstance();
        logger.log("This is an error");

        MathHelper.findMax(arr);
        MathHelper.findMin(arr);
        MathHelper.findAverage(arr);

        StringUtils.uppercase("ambulance is a vehicle");
        StringUtils.reverse("reverse");
        StringUtils.regress("serres");
    }
}
