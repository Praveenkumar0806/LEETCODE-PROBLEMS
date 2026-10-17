class MaximumNumberofCoinsYouCanGet{
    public int maxCoins(int[] a) {
        if(a.length==3){
            return a[a.length/2];
        }
        Arrays.sort(a);
		List<List<Integer>>l1=new ArrayList<>();
		    int x=0;
	        int y=a.length-1;
	    while(x<y){
	        List<Integer>l2=new ArrayList<>();
	        for(int i=0;i<3;i++){
	            if(i==0)
	            l2.add(a[x++]);
	            else  
	            l2.add(a[y--]);
	        }
	        //System.out.println(l2);
	        Collections.sort(l2);
	        l1.add(l2);
	      //  System.out.println(l1);
	    }
	    int sum=0;
	    for(int i=0;i<l1.size();i++){
	        List<Integer>l3=l1.get(i);
	        sum+=l3.get(l3.size()/2);
	    }
        return sum;
    }
}