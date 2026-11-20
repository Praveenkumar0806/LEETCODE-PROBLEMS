class MinimumNumberofStepstoMakeTwoStringsAnagram{
    public int minSteps(String s1, String s2) {
        int[] c1=new int[26];
    int[] c2=new int[26];
    for(int i=0;i<s1.length();i++){
        c1[s1.charAt(i)-'a']++;
	}
	for(int i=0;i<s2.length();i++){
        c2[s2.charAt(i)-'a']++;
	}
	// System.out.println(Arrays.toString(c1));
	// System.out.println(Arrays.toString(c2));
	int count=0;
	for(int i=0;i<c1.length;i++){
	    if(c1[i]==c2[i]){
	        continue;
	    }
	    else if(c1[i]>c2[i]){
	        int diff=Math.abs(c1[i]-c2[i]);
	        count+=diff;
	    }
	}
    return count;
    }
}