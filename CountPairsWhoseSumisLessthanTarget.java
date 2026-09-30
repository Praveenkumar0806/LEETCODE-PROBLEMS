class CountPairsWhoseSumisLessthanTarget{
    public int countPairs(List<Integer> l, int key) {
        int count=0;
		
		for(int i=0;i<l.size();i++){
		    for(int j=i+1;j<l.size();j++){
		        if(l.get(i)+l.get(j)<key){
		            count++;
		        }
		    }
		}
        return count;
    }
}