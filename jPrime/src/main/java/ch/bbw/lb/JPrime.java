package ch.bbw.lb;

public class JPrime {
    public static boolean isPrime(int i) {
        if (i <= 1) {
            return false;
        }
        for (int n = 2; n <= Math.sqrt(i); n++) {
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotPrime(int i) {
        return !isPrime(i);
    }
}
