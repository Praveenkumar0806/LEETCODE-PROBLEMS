class CheckGoodInteger{
    public boolean checkGoodInteger(int n) {
        int digit=0,square=0;
        while(n!=0){
            int digits=n%10;
            digit+=digits;
            square+=digits*digits;
            n=n/10;
        }
        if(Math.abs(digit-square)>=50){
            return true;
        }
        return false;
    }
}