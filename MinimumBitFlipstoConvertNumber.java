class MinimumBitFlipstoConvertNumber{
    public int minBitFlips(int a, int b) {
        String s1="",s2="";
		while(a>0){
		    int digit=a%2;
		    s1=digit+s1;
		    a=a/2;
		}
		while(b>0){
		    int digit=b%2;
		    s2=digit+s2;
		    b=b/2;
		}
			
		int max=Math.max(s1.length(),s2.length());
	    if(s1.length()!=max){
	        int diff=Math.abs(s1.length()-max);
	        for(int i=0;i<diff;i++){
	        s1='0'+s1;
	        }
	    }
	    else if(s2.length()!=max){
	        int diff=Math.abs(s2.length()-max);
	        for(int i=0;i<diff;i++){
	            s2='0'+s2;
	        }
	    }
	    //System.out.println(s1);
		//System.out.println(s2);
		int count=0;
		//int max=Math.max(s1.length(),s2.length());
		for(int i=0;i<max;i++){
		    if(s1.charAt(i)!=s2.charAt(i)){
		        count++;
		    }
		}
        return count;
    }
}