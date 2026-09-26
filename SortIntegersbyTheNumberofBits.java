class SortIntegersbyTheNumberofBits{
    public int[] sortByBits(int[] a) {
List<Integer> l1 = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++) {

            int num = a[i];
            int count = 0;

            while(num != 0) {

                int digit = num % 2;

                if(digit == 1) {
                    count++;
                }

                num = num / 2;
            }

            max = Math.max(max, count);
            l1.add(count);
        }

        List<List<Integer>> l2 = new ArrayList<>();

     
        for(int i = 0; i <= max; i++) {

            List<Integer> l3 = new ArrayList<>();

            for(int j = 0; j < l1.size(); j++) {

                if(l1.get(j) == i) {
                    l3.add(a[j]);
                }
            }

          
            Collections.sort(l3);

            l2.add(l3);
        }

      
        int[] result = new int[a.length];
        int k = 0;

        for(int i = 0; i < l2.size(); i++) {

            for(int j = 0; j < l2.get(i).size(); j++) {

                result[k] = l2.get(i).get(j);
                k++;
            }
        }

        return result;
    }
}