class FirstUniqueEvenElement{
    public int firstUniqueEven(int[] a) {
        int[] b=new int[a.length];
	    for(int i=0;i<a.length;i++){
	        if(b[i]==-1){
	            continue;
	        }
	        int count=1;
	        for(int j=i+1;j<a.length;j++){
	            if(a[i]==a[j]){
	                count++;
	                b[j]=-1;
	            }
	        }
	        b[i]=count;
	    }
	    // for(int i=0;i<a.length;i++){
	    //     if(b[i]!=-1){
	    //         System.out.println(a[i]+" "+b[i]);
	    //     }
	    // }
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<a.length;i++){
	        if(a[i]%2==0 && b[i]==1){
	            min=Math.min(min,a[i]);
                break;
	        }
	    }
	    return min==Integer.MAX_VALUE?-1:min;
    }
}