class RemoveZerosinDecimalRepresentation{
    public long removeZeros(long n) {
        String res="";
        while(n!=0){
            long digit=n%10;
            if(digit!=0){
                res=digit+res;
            }
            n=n/10;
        }
        return Long.parseLong(res);
    }
}