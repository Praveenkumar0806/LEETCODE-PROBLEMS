class  MaximumXORAfterOperations {
    public int maximumXOR(int[] a) {
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            max |= a[i];
        }
        return max;
    }
}