class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> el = new ArrayList<>();
        ArrayList<Integer> ol = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0) el.add(nums[i]);
            else ol.add(nums[i]);
        }
        int[] arr = new int[nums.length];
        int e = 0;
        int o = 0;
        int n = 0;
        while( n < arr.length){
            if(n % 2 == 0){
                arr[n] = el.get(e);
                e++;
                n++;
            }else{
                arr[n] = ol.get(o);
                o++;
                n++;
            }
        }
        return arr;
    }
}