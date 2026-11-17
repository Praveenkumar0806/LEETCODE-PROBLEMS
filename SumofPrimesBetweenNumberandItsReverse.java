
class SumofPrimesBetweenNumberandItsReverse{
    static boolean check(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumOfPrimesInRange(int n) {

        int tmp = n;

        String s = String.valueOf(tmp);
        String fin = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            fin += s.charAt(i);
        }

        int reverse = Integer.parseInt(fin);

        int max = Math.max(reverse, n);
        int min = Math.min(reverse, n);

        int sum = 0;

        for (int i = min; i <= max; i++) {
            boolean found = check(i);

            if (found) {
                sum += i;
            }
        }

        return sum;
    }
}
