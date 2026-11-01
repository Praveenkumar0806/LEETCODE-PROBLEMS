
class CountDominantIndices{
    public int dominantIndices(int[] a) {
        int res=0;
        for (int i = 0; i < a.length - 1; i++) {
            int num = a[i];
            double sum = 0;
            double count = 0;
            
            for (int j = i + 1; j < a.length; j++) {
                sum += a[j];
                count++;
            }
            
            double avg = sum / count;
            if (num > avg) {
                res++;
            }
        }
        return res;
    }
}