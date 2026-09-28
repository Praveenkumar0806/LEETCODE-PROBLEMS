 class FindThePivotInteger{
    public int pivotInteger(int n) {
         int total = 0;
        int leftsum = 0;

        for(int i = 1; i <= n; i++){
            total += i;
        }

        for(int i = 1; i <= n; i++){
            leftsum += i;

            int rightsum = total - leftsum + i;

            if(leftsum == rightsum){
                return i;
            }
        }

        return -1;
    }
}