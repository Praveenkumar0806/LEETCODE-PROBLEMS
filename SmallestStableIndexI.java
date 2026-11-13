class SmallestStableIndexI{
    public int firstStableIndex(int[] a, int k) {
        int i=0;
	    
	    while(i<a.length){
	        int max=a[0];
	        int min=a[i];
	        for(int j=0;j<=i;j++){
	            max=Math.max(max,a[j]);
	        }
	        for(int x=i;x<a.length;x++){
	            min=Math.min(min,a[x]);
	        }
	        
	        if(max-min<=k){
	            return i;
	           
	        }
	        i++;
	    }
        return -1;
    }
}