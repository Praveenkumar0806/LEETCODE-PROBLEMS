
class CenterofStarGraph{
    public int findCenter(int[][] a) {
     Set<Integer> s1 = new HashSet<>();

        for (int j = 0; j < a[0].length; j++) {
            s1.add(a[0][j]);
        }

        for (int i = 1; i < a.length; i++) {

            Set<Integer> s2 = new HashSet<>();

            for (int j = 0; j < a[0].length; j++) {
                s2.add(a[i][j]);
            }

            s1.retainAll(s2);
        }

        return s1.iterator().next();
    }
}