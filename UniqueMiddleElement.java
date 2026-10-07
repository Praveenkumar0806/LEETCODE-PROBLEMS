class UniqueMiddleElement{
    public boolean isMiddleElementUnique(int[] a) {
       HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        int mid = a.length / 2;

        
        return map.get(a[mid]) == 1?true:false;

        
    }
}