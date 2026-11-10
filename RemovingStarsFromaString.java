class RemovingStarsFromaString{
    public String removeStars(String s) {
        	List<Character>l1=new ArrayList<>();
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='*') {
					l1.remove(l1.size()-1);
				}
				else {
					l1.add(s.charAt(i));
				}
				//System.out.println("L1 :"+l1);
			}
            String res="";
			for(int i=0;i<l1.size();i++){
		    res+=l1.get(i);
		}
        return res;
    }
}