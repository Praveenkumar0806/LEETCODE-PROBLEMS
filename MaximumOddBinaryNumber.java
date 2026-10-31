class MaximumOddBinaryNumber{
    public String maximumOddBinaryNumber(String s) {
        int count=0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='1'){
		        count++;
		    }
		}
			int[] a=new int[s.length()];
		for(int i=0;i<a.length;i++){
		    
		    if(count==1){
		        a[a.length-1]=1;
		        break;
		    }
		    else{
		        a[i]=1;
		    count--;
		    }
		}
		String res="";
		for(int i=0;i<a.length;i++){
		    res+=String.valueOf(a[i]);
		}
        return res;
    }
}