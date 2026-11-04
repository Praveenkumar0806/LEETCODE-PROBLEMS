class CheckIfDigitsAreEqualinStringAfterOperationsI{
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
		    String tmp="";
		    for(int i=0;i<s.length()-1;i++){
		        int digit=(int)s.charAt(i)-'0'+(int)s.charAt(i+1)-'0';
		        if(digit>9){
		            int value=digit%10;
		            digit=value;
		        }
		        tmp=tmp+digit;
		    }
		    s=tmp;
		}
        return s.charAt(0)==s.charAt(1)?true:false;
    }
}