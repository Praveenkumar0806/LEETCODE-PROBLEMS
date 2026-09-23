class RearrangeStringtoAvoidCharacterPair{
    public String rearrangeString(String s, char x, char y) {
       
        int i=0;
	    int j=s.length()-1;
	    String tmp="";
	    int count=s.length();
	    while(count!=0){
	        if(s.charAt(j)==y){
	            tmp+=s.charAt(j);
	        }
	        j--;
	        count--;
	    }
	    String tmp1="";
	    while(i<s.length()){
	        if(s.charAt(i)==y){
	            i++;
	            continue;
	        }
	        tmp1+=s.charAt(i);
	        i++;
	    }
	    //System.out.println(tmp+tmp1);
        return tmp+tmp1;
    }
}