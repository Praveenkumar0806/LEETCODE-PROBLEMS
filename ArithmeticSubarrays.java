class ArithmeticSubarrays{
    public List<Boolean> checkArithmeticSubarrays(int[] a, int[] b, int[] c) {
        	List<Boolean>res=new ArrayList<>();
		int count=0;
		for(int i=0; i<b.length; i++) {
		    
			List<Integer>l2=new ArrayList<>();
			for(int j=b[i]; j<=c[i]; j++) {
				l2.add(a[j]);
			}
			count++;
			//System.out.println("L2 : "+l2);
		//	l1.add(l2);
		//	System.out.println("L1 : "+l1);
			
			Collections.sort(l2);
			List<Integer>l3=new ArrayList<>();
			for(int j=0; j<l2.size()-1; j++) {
				int diff=Math.abs(l2.get(j)-l2.get(j+1));
				l3.add(diff);
			}
			//System.out.println("L3 : "+l3);
			boolean found=true;
			for(int j=0; j<l3.size()-1; j++) {
				if (l3.get(j).equals(l3.get(j + 1))){
                    			continue;
				}
				else {
				    found=false;
					break;
				}
			}
			if(found){
			    res.add(true);
			}
			else{
			    res.add(false);
			}
			
		//	System.out.println("res : "+res);
       
		}
         return res;
    }
}