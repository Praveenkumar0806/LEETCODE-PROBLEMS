class GenerateaStringWithCharactersThatHaveOddCounts{
    public String generateTheString(int n) {
        String s="";
        if(n%2!=0){
            for(int i=0;i<n;i++){
                s+="a";
            }
        }
        else{
            int n1=n-1;
            for(int i=0;i<n1;i++){
                s+="a";
            }
            s+="b";
        }
        return s;
    }
}