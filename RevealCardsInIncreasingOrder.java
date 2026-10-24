class RevealCardsInIncreasingOrder{
    public int[] deckRevealedIncreasing(int[] a) {
        
        
        int[] b = new int[a.length];

        Arrays.sort(a);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < a.length; i++) {
            q.add(i);
        }

        for (int i = 0; i < a.length; i++) {
            int index = q.poll();
            b[index] = a[i];

            if (!q.isEmpty()) {
                q.add(q.poll());
            }
        }
return b;
    }
}