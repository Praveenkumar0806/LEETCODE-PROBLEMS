class TotalWavinessofNumbersinRangeI{
    public int totalWaviness(int n1, int n2) {
        int size=Math.abs(n1-n2);
		int[] a=new int[size+1];
		int x=0,count=0;
		for(int i=n1;i<=n2;i++){
		    a[x++]=i;
		}
		//System.out.println(Arrays.toString(a));
		int j=0;
		while(j<a.length){
		    int num1=a[j];
		    List<Integer>l=new ArrayList<>();
		    while(num1!=0){
		        int digit=num1%10;
		        l.add(digit);
		        num1/=10;
		    }
		   // System.out.println("L :"+l);
		    for(int i=1;i<l.size()-1;i++){
		        if((l.get(i-1)<l.get(i)) && l.get(i)>l.get(i+1)){
		            count++;
		        }
		        else if((l.get(i-1)>l.get(i)) && l.get(i)<l.get(i+1)){
		            count++;
		        }
		    }
		    j++;
		}
        return count;
    }
}