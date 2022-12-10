class findFirstLast {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        
        int l = 0;
        int r = nums.length-1;
        if (nums.length == 1 && target == nums[0]) {
            return result;
            
        }
        else if (nums.length == 1 && target != nums[0]) {
            result[0]=-1;
            result[1]=-1;
        }
        else {
            result[0]=-1;
            result[1]=-1;
            while (l<=r) {
            int mid = l+(r-l)/2;
            
            if (target == nums[mid]) {
                l = mid;
                r = mid;
                while (nums[l] == target && l >=0) {
                    l--;
                    if (l < 0) {
                        break;
                    }
                }
                while (nums[r] == target) {
                    r++;
                    if (r >= nums.length) {
                        break;
                    }
                }
                result[0] = l+1;
                result[1] = r-1;
                break;
            }
            else if (target > nums[mid]) {
                l = mid+1;
            }
            else if (target < nums[mid]) {
                r = mid -1;
            }
        }
        }
        return result;
    }
}