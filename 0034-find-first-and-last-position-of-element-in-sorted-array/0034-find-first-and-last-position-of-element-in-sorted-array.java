class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] temp = new int [2];
        temp[0] = search( 0, nums.length-1, true, target, nums);
        temp[1] = search ( 0, nums.length-1, false, target, nums);
        return temp ;
    }
    public static int search(int first, int last, boolean isstarting, int target, int[]array)
    { int mid = 0;
        int ans = -1;
        while(first<=last){
            mid = first+(last-first)/2;
            if(target==array[mid]){
                ans=mid;
                if(isstarting){last=mid-1;}
                else {first=mid+1;}
            } else if (array[mid]<target){
                first=mid+1;
            } else  {last=mid-1;}
        }
         return ans ;
    }
}        