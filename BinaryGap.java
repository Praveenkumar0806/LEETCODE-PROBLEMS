class BinaryGap{
    public int binaryGap(int n) {
        String s="";
while(n!=0){
int digit=n%2;
s=digit+s;
n=n/2;
}
int max=0;
char[] ch=s.toCharArray();
int i=0,j=1;
while(j<ch.length){
if(ch[i]=='1' && ch[j]=='1'){
int diff=Math.abs(i-j);
max=Math.max(max,diff);
i=j;
j++;
}
else if(ch[j]!='1'){
j++;
}
else{
i=j;
j++;
}
}
return max;
    }
}