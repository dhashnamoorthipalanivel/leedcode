class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),i);
        }

        ArrayList<Integer> l = new ArrayList<>();
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            end = Math.max(end,m.get(s.charAt(i)));

            if(i == end){
                l.add(end-start+1);
                start = end + 1;
            }
        }
        return l;
    }
}