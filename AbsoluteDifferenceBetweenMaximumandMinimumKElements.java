class AbsoluteDifferenceBetweenMaximumandMinimumKElements{
    public int absDifference(int[] a, int k) {
        if(a.length==1){return 0;}
        Arrays.sort(a);
        int sum=0;
        int diff=0,count=0;
        for(int i=a.length-1;i>=0;i--){
            sum+=a[i];
            count++;
            if(count==k){
                break;
            }
        }
        for(int i=0;i<k;i++){
            diff+=a[i];
        }
        
        return Math.abs(sum-diff);
    }
}