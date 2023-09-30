class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        // Start of Solution
        int size = nums.length;
        int sum = 0;
        int arr[] = new int[2];
        boolean check = false;

        for(int ctr = 0; ctr < size; ctr++){
            for(int ctr2 = 0; ctr2 < size && ctr != ctr2; ctr2++){
                sum = nums[ctr] + nums[ctr2];
                if(sum == target){
                    arr[0] = ctr;
                    arr[1] = ctr2;
                    check = true;
                    break;
                }
            }
            if(check){
                break;
            }
        }

        return arr;
        // End of Solution

    }
}
