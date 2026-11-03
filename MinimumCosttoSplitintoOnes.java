class MinimumCosttoSplitintoOnes{
    public int minCost(int n) {
        if(n==1){
            return 0;
        }
         int num1=0;
	        int num2=0;
	        int cost=0;
	    while(num2!=1){
	         num1=1;
	         num2=n-num1;
	         int multi=num1*num2;
	         cost+=multi;
	         n=num2;
	    }
        return cost;
    }
}