class FindtheSumofEncryptedIntegers{
    public int sumOfEncryptedInt(int[] a) {
        int x=0,sum=0;
		for(int i=0;i<a.length;i++){
		    int num=a[i],value=num,max=Integer.MIN_VALUE;
		    while(num!=0){
		        int digit=num%10;
		        max=Math.max(max,digit);
		        num=num/10;
		    }
		   // System.out.println(max);
		    String tmp="";
		    while(value!=0){
		        tmp+=String.valueOf(max);
		        value/=10;
		    }
		   //System.out.println(tmp);
		    int res=Integer.parseInt(tmp);
		    sum+=res;
		   // System.out.println(res);
           
		   
		}
        return sum;
    }
}