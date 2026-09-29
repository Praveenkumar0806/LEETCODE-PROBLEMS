class UniqueMorseCodeWords{
    public int uniqueMorseRepresentations(String[] s) {
        String[] ch={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	    HashSet<String>h=new HashSet<>();
	    int x=0;
	    for(int i=0;i<s.length;i++){
	        String s1=s[i];
	        String s2="";
	        for(int j=0;j<s1.length();j++){
	            int num=s1.charAt(j)-'a';
	            s2+=ch[num];
	        }
	        //System.out.println(s2);
	        h.add(s2);
	    }
        return h.size();
    }
}