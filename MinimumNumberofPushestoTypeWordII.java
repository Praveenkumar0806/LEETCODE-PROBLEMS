class MinimumNumberofPushestoTypeWordII{
    public int minimumPushes(String s) {
        char[] ch=s.toCharArray();
		Map<Character,Integer> m = new HashMap<>();
		for(int i=0; i<ch.length; i++) {
			m.put(ch[i],m.getOrDefault(ch[i],0)+1);
		}
		//System.out.println(m);
		List<Integer>l=new ArrayList<>(m.values());
		Collections.sort(l,Collections.reverseOrder());
		//System.out.println(l);
		int count=0,sum=0,i=0,multi=1;
		while(i<l.size()){
		    multi=count/8+1;
		    sum+=multi*l.get(i);
		  
		    i++;
		    count++;
		   
		}
        return sum;
    }
}