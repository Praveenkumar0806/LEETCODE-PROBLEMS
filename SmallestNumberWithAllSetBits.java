class SmallestNumberWithAllSetBits{
    public int smallestNumber(int n) {
        String s="";
		while(n!=0){
		    int digit=n%2;
		    if(digit==0){
		        s+="1";
		    }
		    else{
		    s+=digit;
		    }
		    n=n/2;
		    
		}
		System.out.println(s);
		int num=Integer.parseInt(s);
	int res = Integer.parseInt(String.valueOf(num), 2);
    return res;
    }
}