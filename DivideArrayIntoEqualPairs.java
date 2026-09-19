class DivideArrayIntoEqualPairs{
    public boolean divideArray(int[] a) {
        if(a.length%2!=0){
            return false;
        }
        	List<List<Integer>> l1=new ArrayList<>();
		int n=a.length;
		int pair=n/2;
		for(int i=0; i<a.length; i++) {
			List<Integer>l2=new ArrayList<>();
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j] && a[j]!=-1) {
					l2.add(a[i]);
					l2.add(a[j]);
					a[j]=-1;
					break;
				}
			}
			//System.out.println("L2:"+l2);
			if(!l2.isEmpty())
			l1.add(l2);
			
		}
		//System.out.println("L1:"+l1);
        return l1.size()==pair?true:false;
    }
}