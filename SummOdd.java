public class SumOddChecker {
    static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    static int sumOdd1(int start, int end) {
        int sum = 0;

        if (start > 0 && start <= end && end > 0) {
            for (int i = start; start < end; i++) {
                if (isOdd(i)) {
                    sum += i;
                    System.out.println(i);
                    return sum;
                }
            }

        }
            return -1;
        }

    }