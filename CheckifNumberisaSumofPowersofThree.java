class CheckifNumberisaSumofPowersofThree{
    public boolean checkPowersOfThree(int n) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);

        int num = 3, multi = 1, value = 3;
        boolean found = false;

        for (int i = 1; i < n; i++) {
            value *= num;
            if (value > n) {
                break;
            } else {
                l1.add(value);
            }
        }

        int ans = 0;
        boolean check = true;

        while (check) {
            List<Integer> l2 = new ArrayList<>();
            int diff = n - ans;
            int max = 0;

            for (int j = 0; j < l1.size(); j++) {
                if (l1.get(j) <= diff) {
                    l2.add(l1.get(j));
                } else {
                    break;
                }
            }

            if (ans == n) {
                found = true;
                break;
            }

            if (l2.isEmpty()) {
                check = false;
                break;
            }

            max = l2.get(l2.size() - 1);

            ans += max;

            // Selected power-ah mattum remove panrom
            l1.remove(Integer.valueOf(max));
        }

        return found;
    }
}
