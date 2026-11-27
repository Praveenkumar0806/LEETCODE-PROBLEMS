class FindMismatchedSegmentsBetweenTwoStrings
{
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        String s3 = "";
        String s4 = "";

        List<List<String>> l1 = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {

                s3 += s1.charAt(i);
                s4 += s2.charAt(i);

            } else {

                if (!s3.isEmpty()) {

                    List<String> tmp1 = new ArrayList<>();

                    tmp1.add(s3);
                    tmp1.add(s4);

                    l1.add(tmp1);

                    s3 = "";
                    s4 = "";
                }
            }
        }

        if (!s3.isEmpty()) {

            List<String> tmp2 = new ArrayList<>();

            tmp2.add(s3);
            tmp2.add(s4);

            l1.add(tmp2);
        }
        return l1;
    }
}