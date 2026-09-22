class NumberofCommonFactors{
    public int commonFactors(int a, int b) {
        int count=0,x=1;
		while(x<=a) {
			if(a%x==0 && b%x==0) {
				count++;
			}
				x++;
		}
        return count;
    }
}