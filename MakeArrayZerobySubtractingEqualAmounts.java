class MakeArrayZerobySubtractingEqualAmounts{
    public int minimumOperations(int[] a) {
       	Arrays.sort(a);
		int min = 0, res = 0;

        while (true) {
            min = Integer.MAX_VALUE;

            for (int i = 0; i < a.length; i++) {
                if (a[i] < min && a[i] != 0) {
                    min = a[i];
                }
            }

            if (min == Integer.MAX_VALUE) {
                break;
            }

            for (int i = 0; i < a.length; i++) {
                int num = a[i];
                if (num != 0) {
                    a[i] = num - min;
                }
            }

           // System.out.println(Arrays.toString(a));
           // System.out.println(min);

            res++;
        }
        return res;
    }
}