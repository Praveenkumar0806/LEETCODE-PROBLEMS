
class CountNumberofNiceSubarrays{
    public int numberOfSubarrays(int[] a, int x) {
        int ans = 0;
        int count = 0;
        int left = 0;
        int prev = 0;

        for (int right = 0; right < a.length; right++) {

            if (a[right] % 2 != 0) {
                count++;
                prev = 0;
            }

            while (count == x) {
                prev++;

                if (a[left] % 2 != 0) {
                    count--;
                }

                left++;
            }

            ans += prev;
        }

        return ans;
    }
}
