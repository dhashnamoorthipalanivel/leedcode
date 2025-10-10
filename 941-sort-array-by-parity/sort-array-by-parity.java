class Solution {
    public int[] sortArrayByParity(int[] nums) {
    //    ArrayList<Integer> el = new ArrayList<>();
    //    ArrayList<Integer> ol = new ArrayList<>();
    //    for(int i=0;arr.length();i++){
    //     if(arr[i] % 2 == 0) el.add(arr[i]);
    //     else ol.add(arr[i]);
    //    }

    int[] arr = new int[nums.length];

    int l =0;
    int r = arr.length-1;
    int i = 0;
    while(i < nums.length){
        if(nums[i] % 2 == 0){
            arr[l] = nums[i];
            i++;
            l++;
        }else{
            arr[r] = nums[i];
            r--;
            i++;
        }
    }
    return arr;
    }
}