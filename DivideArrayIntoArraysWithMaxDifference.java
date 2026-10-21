class DivideArrayIntoArraysWithMaxDifference{
    public int[][] divideArray(int[] a, int k) {
        Arrays.sort(a);
        int n=a.length/3;
        int[][] res = new int[n][3];

        int index = 0;

        for (int i = 0; i < n; i++) {
            int[] tmp = new int[3];
            int x = 0;

            for (int j = index; j < index + 3; j++) {
                tmp[x++] = a[j];
            }

            if (tmp[2] - tmp[0] > k) {
                return new int[0][0];
            }

            res[i] = tmp;
            index += 3;
        }
return res;
    }
}