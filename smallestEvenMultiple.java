class smallestEvenMultiple{
    public int smallestEvenMultiple(int n) {
        int num=2;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n*num;i++){
            if(i%num==0 && i%n==0){
                min=Math.min(min,i);
            }
        }
        return min;
    }
}