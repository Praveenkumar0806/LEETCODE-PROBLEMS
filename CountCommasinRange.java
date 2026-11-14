class CountCommasinRange{
    public int countCommas(int n) {
        String s=String.valueOf(n);
        int count=0;
        if(s.length()<3){
            return 0;
        }
        else if(s.length()>3 && s.length()<5){
             int num1=Integer.parseInt(s);
             for(int i=1000;i<=num1;i++){
                count++;
             }
        }
         else if(s.length()>4 && s.length()<=6){
             int num1=Integer.parseInt(s);
             for(int i=1000;i<=num1;i++){
                count++;
             }
        }
        return count;
    }
}