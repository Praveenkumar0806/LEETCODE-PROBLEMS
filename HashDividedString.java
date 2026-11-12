class HashDividedString{
    public String stringHash(String s, int k) {
        int n=s.length();
		//int k=2;
		char[] ch=new char[26];
		for(int i=0;i<ch.length;i++){
		    ch[i]=(char) (i+'a');
		}
		//System.out.println(Arrays.toString(ch));
		String tmp="";
		String res="";
		int sub=k;
		for(int i=0;i<s.length();i+=k){
		    tmp=s.substring(i,sub);
		    int j = 0, sum = 0;

            while (j < tmp.length()) {
                sum += tmp.charAt(j) - 'a';
                j++;
            }

            int index = sum % 26;

            tmp = "";
            res +=ch[index ];

            sub += k;
        }
        return res;
    }
}