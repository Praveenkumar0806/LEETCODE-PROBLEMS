class RemoveAllOccurrencesofaSubstring{
    public String removeOccurrences(String s1, String s2) {
        List<Character> l1 = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            l1.add(s1.charAt(i));
        }

      //  System.out.println(l1);

        int x = 0;

        while (x + s2.length() <= l1.size()) {

            String tmp = "";

            for (int i = x; i < x + s2.length(); i++) {
                tmp += l1.get(i);
            }

            System.out.println(tmp);

            if (tmp.equals(s2)) {
                l1.subList(x, x + s2.length()).clear();

                
                x = 0;
            } else {
                x++;
            }

            //System.out.println(l1);
        }

        String result = "";

        for (Character ch : l1) {
            result += ch;
        }
return result;
    }
}



