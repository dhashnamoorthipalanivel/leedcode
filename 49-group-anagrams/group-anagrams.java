class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> m = new HashMap<>();

       for(String s : strs){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String cs = String.valueOf(ch);

        if(!m.containsKey(cs)){
            m.put(cs,new ArrayList<>());
        }

        m.get(cs).add(s);
       }

       return new ArrayList<>(m.values());
    }
}