package gr.aueb.cf.ch4;

/**
 * Demo of surrogate pairs.
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F600;

        System.out.println("Smile: \uD83D\uDE00");
        System.out.println("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
