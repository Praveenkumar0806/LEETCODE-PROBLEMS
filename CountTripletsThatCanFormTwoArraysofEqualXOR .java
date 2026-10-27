class CountTripletsThatCanFormTwoArraysofEqualXOR {
    public int countTriplets(int[] arr) {
         int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {

                    int a = 0;
                    int b = 0;

                    for (int x = i; x < j; x++) {
                        a ^= arr[x];
                    }

                    for (int x = j; x <= k; x++) {
                        b ^= arr[x];
                    }

                    if (a == b) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}