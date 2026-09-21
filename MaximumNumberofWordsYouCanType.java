class MaximumNumberofWordsYouCanType{
    public int canBeTypedWords(String s1, String s2) {
        char[] ch=s2.toCharArray();
		String[] s=s1.split(" ");
		for(int i=0;i<s.length;i++){
		    String s3=s[i];
		    int x=0;
		    for(int j=0;j<ch.length;j++){
		        if(s3.contains(String.valueOf(ch[x++]))){
		            s[i]="-1";
		        }
		    }
		}
		
		int count=0;
		for(int i=0;i<s.length;i++){
		   if(!s[i].equals("-1"))
		        count++;
		    }
            
		return count;
    }
}