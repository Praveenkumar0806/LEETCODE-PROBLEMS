class ElevatorRequests{
    public int elevatorRequests(int n, int[] a) {
        int sum=a[0];
        for(int i=0;i<a.length-1;i++){
            int diff=Math.abs(a[i]-a[i+1]);
            sum+=diff;
        }
        return sum;
    }
}