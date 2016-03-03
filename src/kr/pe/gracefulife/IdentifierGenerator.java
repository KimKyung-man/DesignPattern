package kr.pe.gracefulife;

/**
 * Created by Gracefulife on 2016-02-14.
 */
public class IdentifierGenerator {
    private static int id;

    static {
        id = 0;
    }

    public static synchronized int generate() {
        id++;
        return id;
    }
}
