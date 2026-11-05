class SelfDividingNumbers{
    public List<Integer> selfDividingNumbers(int n1, int n2) {
       List<Integer>res=new ArrayList<>();
        for(int i=n1;i<=n2;i++){
            int num=i;
            int val=num;
            boolean found=true;
            while(num!=0){
                int digit=num%10;
                
                if( digit!=0 && val%digit==0){
                    found=true;
                }
                else{
                    found=false;
                    break;
                }
                num=num/10;
            }
            if(found){
                res.add(val);
            }
        }
        return res;
    }
}