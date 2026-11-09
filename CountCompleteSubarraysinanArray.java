class CountCompleteSubarraysinanArray{
    public int countCompleteSubarrays(int[] a) {
        int count=0;
		Set<Integer>s=new HashSet<>();
		for(int i=0; i<a.length; i++) {
			s.add(a[i]);
		}
	for(int i=0; i<a.length; i++) {
    Set<Integer> s1 = new HashSet<>();

    for(int j=i; j<a.length; j++) {
        s1.add(a[j]);

        if(s1.size() == s.size()) {
            count++;
        }
    }
}
return count;
    }
}