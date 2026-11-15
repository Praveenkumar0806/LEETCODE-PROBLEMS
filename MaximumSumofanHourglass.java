class MaximumSumofanHourglass{
    public int maxSum(int[][] a) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row <= a.length - 3; row++) {

            for (int col = 0; col <= a[0].length - 3; col++) {

                int sum = 0;

              
                sum += a[row][col];
                sum += a[row][col + 1];
                sum += a[row][col + 2];

       
                sum += a[row + 1][col + 1];

        
                sum += a[row + 2][col];
                sum += a[row + 2][col + 1];
                sum += a[row + 2][col + 2];

                max = Math.max(max, sum);
            }
        }
return max;
    }
}