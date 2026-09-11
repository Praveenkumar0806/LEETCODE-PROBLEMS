class DigitFrequencyScore{
    public int digitFrequencyScore(int n) {
        List<Integer>l1=new ArrayList<>();
		while(n!=0){
		    int digit=n%10;
		    l1.add(digit);
		    n=n/10;
		}
		//System.out.println("List :"+l1);
		int max=l1.get(0);
		for(int i=1;i<l1.size();i++){
		    max=Math.max(max,l1.get(i));
		}
		//System.out.println("Max :"+max);
		int[] freq=new int[max+1];
		for(int i=0;i<l1.size();i++){
		    freq[l1.get(i)]++;
		   // System.out.println(Arrays.toString(freq));
		}
		int sum=0;
		for(int i=0;i<freq.length;i++){
		    int num=i*freq[i];
		    sum+=num;
		}
		return sum;
    }
}