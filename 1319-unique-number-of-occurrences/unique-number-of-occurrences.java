class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            m.put(num,m.getOrDefault(num,0)+1);
        }
        HashSet<Integer> s = new HashSet<>();
        for(int v : m.values()){
            if(s.contains(v)) return false;
            s.add(v);
        }
        return true;
    }
}