class SortCharactersByFrequency{
    public String frequencySort(String s) {
           	char[] ch=s.toCharArray();
		int[] tmp=new int[s.length()];
		for(int i=0;i<ch.length;i++){
		    tmp[i]=ch[i];
		}
		//System.out.println(Arrays.toString(tmp));
        int[] b=new int[ch.length];
        for(int i=0;i<tmp.length;i++){
            int count=1;
            if(b[i]==-1){
                continue;
            }
            for(int j=i+1;j<tmp.length;j++){
                if(tmp[i]==tmp[j]){
                    count++;
                    b[j]=-1;
                }
            }
            b[i]=count;
        }
       for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] != -1 && b[j] != -1 && b[i] < b[j]) {
                    int t = b[i];
                    b[i] = b[j];
                    b[j] = t;

                    t = tmp[i];
                    tmp[i] = tmp[j];
                    tmp[j] = t;
                }
            }
        }

        // CHANGE 2: Result create pannuradhu
        String res1 = "";

        for (int i = 0; i < b.length; i++) {
            if (b[i] != -1) {
                for (int j = 0; j < b[i]; j++) {
                    res1 += (char) tmp[i];
                }
            }
        }

        return res1;
}
}