class CheckBalancedString{
    public boolean isBalanced(String s) {
       char[] c=s.toCharArray();
       int esum=0,osum=0;
       for(int i=0;i<c.length;i++){
        int num=c[i]-'0';
        if(i%2==0){
            esum+=num;
        }
        else{
            osum+=num;
        }
       }
    return esum==osum?true:false;
    }
}