class SumofAbsoluteDifferencesinaSortedArray{
    public int[] getSumAbsoluteDifferences(int[] a) {
        int n=a.length;
         int[] res = new int[n];
        //  int[] res=new int[a.length];
        // for(int i=0;i<a.length;i++){
        //     int num=a[i];
        //     int sum=0;
        //     for(int j=0;j<a.length;j++){
        //         int diff=Math.abs(num-a[j]);
        //         sum+=diff;
        //     }
        //     res[i]=sum;
        // }
        // return res;
          int total = 0;

        // Step 1: Total sum
        for (int i = 0; i < n; i++) {
            total += a[i];
        }

        int leftSum = 0;

        // Step 2: Calculate absolute differences
        for (int i = 0; i < n; i++) {

            int leftCount = i;
            int rightCount = n - i - 1;

            int rightSum = total - leftSum - a[i];

            int left = (a[i] * leftCount) - leftSum;
            int right = rightSum - (a[i] * rightCount);

            res[i] = left + right;

            leftSum += a[i];
        }

        return res;
    }
}