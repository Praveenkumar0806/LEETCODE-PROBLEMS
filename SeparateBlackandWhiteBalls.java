class SeparateBlackandWhiteBalls{
    public long minimumSteps(String s) {
        char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		long res=0;
		while(i<j){
		    if(ch[j]=='1'){
		        j--;
		    }
		    else if(ch[i]=='0'){
		        i++;
		    }
		    else if(ch[i]=='1' && ch[j]=='0'){
		        char tmp=ch[i];
		        ch[i]=ch[j];
		        ch[j]=tmp;
		        int diff=Math.abs(i-j);
		        res+=diff;
		        i++;
		        j--;
		    }
		}
    return res;
    }
}