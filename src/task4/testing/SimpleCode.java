package task4.testing;

import java.util.*;

class SimpleCode {

    int a = 0;
    static int b = 10;

    public static void main(String[] args) {
        args[0] = null;
        int c = new Random().nextInt();
        int d = b % 10;
        int res = c * (d + 1) - (10 + new Random().nextInt());
    }
}
