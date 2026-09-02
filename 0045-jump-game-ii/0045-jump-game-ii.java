class Solution {
   public int jump(int[] nums) {
    int jump = 0;
    int x = 0;
    for (int i = 0; i < nums.length - 1; ) {
        if (i + nums[i] >= nums.length - 1) {
            jump++;
            break;
        }
        int max = 0;
        int next = i;
        for (int j = i + 1; j <= i + nums[i]; j++) {
            if (j + nums[j] > max) {
                max = j + nums[j];
                next = j;
            }
        }
        i = next;
        jump++;
    }
    return jump;
}
}
