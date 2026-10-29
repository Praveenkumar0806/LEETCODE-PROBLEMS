class SmallestMissingMultipleofK{
    public int missingMultiple(int[] a, int k) {
        boolean found=true;
         int num=k;
         int num1=num;
        while(found){
           boolean boo=false;
        	for(int i=0;i<a.length;i++){
                if(a[i]==num){
                   num=num+k;
                  boo=true;
                    break;
                }
            }
            if(!boo){
                found=false;
            }
        }
        return num;
    }
}
            
