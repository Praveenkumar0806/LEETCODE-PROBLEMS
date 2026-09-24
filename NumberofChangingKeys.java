class NumberofChangingKeys{
    public int countKeyChanges(String s) {
        String s1=s.toLowerCase();
		//System.out.println(s1);
		char[] c=s1.toCharArray();
		//System.out.println(Arrays.toString(c));
		int i=0,j=i+1,count=0;
		while(j<s.length()){
		    if(c[i]==c[j]){
		        i++;
		        j++;
		        continue;
		    }
		    else{
		        count++;
		        i++;
		        j++;
		    }
		}
        return count;
    }
}