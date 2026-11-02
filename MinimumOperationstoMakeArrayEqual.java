class MinimumOperationstoMakeArrayEqual{
    public int minOperations(int n) {
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (2 * i) + 1;
        }

        //System.out.println(Arrays.toString(a));

        int sum = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        int temp = sum / a.length;
        //System.out.println("Target: " + temp);

        int x = 0;
        int y = a.length - 1;

        while (x < y) {

            if (a[x] < temp && a[y] > temp) {

                int diff1 = temp - a[x];
                int diff2 = a[y] - temp;

                int operations = Math.min(diff1, diff2);

                a[x] += operations;
                a[y] -= operations;

                count += operations;
            }

            if (a[x] == temp) {
                x++;
            }

            if (a[y] == temp) {
                y--;
            }
        }
        return count;
    }
}