package montague;

import capulet.Juliet;

public class Romeo {
    public static final class Love { private Love() {} }
    private static final Love love = new Love();

    public static void cuddleJuliet() {
        Juliet.cuddle(love);
    }
}