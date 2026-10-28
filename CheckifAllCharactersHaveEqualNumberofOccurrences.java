class CheckifAllCharactersHaveEqualNumberofOccurrences{
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer>m=new HashMap<>();
		for(int i=0;i<s.length();i++){
		    m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
		}
		//System.out.println(m);
		List<Integer>l=new ArrayList<>(m.values());
		 for (int i = 0; i < l.size() - 1; i++) {
            if (!l.get(i).equals(l.get(i + 1))) {
                return false;
            }
        }

        return true;
    }
}