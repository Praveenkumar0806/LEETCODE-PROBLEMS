class SortIntegersbyThePowerValue
{
    public int getKth(int n1, int n2, int k) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (int i = n1; i <= n2; i++) {

            int num = i;
            int count = 0;

            while (num != 1) {

                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = (num * 3) + 1;
                }

                count++;
            }

            l1.add(count);
            l2.add(i);
        }

        for (int i = 0; i < l1.size(); i++) {
            for (int j = i + 1; j < l1.size(); j++) {

                if (l1.get(i) > l1.get(j) ||
                   (l1.get(i).equals(l1.get(j)) &&
                    l2.get(i) > l2.get(j))) {

                    int temp = l1.get(i);
                    l1.set(i, l1.get(j));
                    l1.set(j, temp);

                    int temp2 = l2.get(i);
                    l2.set(i, l2.get(j));
                    l2.set(j, temp2);
                }
            }
        }
        return l2.get(k-1);
    }
}