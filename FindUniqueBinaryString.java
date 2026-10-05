class FindUniqueBinaryString{
     public void permutate(int n, String s1, List<String> l1) {

        if (s1.length() == n) {
            l1.add(s1);
            return;
        }

        permutate(n, s1 + "0", l1);
        permutate(n, s1 + "1", l1);
    }

    public String findDifferentBinaryString(String[] s) {

        int n = s[0].length();

        List<String> l = new ArrayList<>();

        permutate(n, "", l);

        for (int i = 0; i < l.size(); i++) {

            boolean found = false;

            for (int j = 0; j < s.length; j++) {

                if (l.get(i).equals(s[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return l.get(i);
            }
        }

        return "";
    }
}