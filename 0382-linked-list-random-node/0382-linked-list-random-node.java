
class Solution {
    ListNode head;
    Random random;

    public Solution(ListNode head) {
        this.head = head;
        random = new Random();
    }

    public int getRandom() {
        ListNode curr = head;

        int ans = 0;
        int count = 1;

        while (curr != null) {

            if (random.nextInt(count) == 0) {
                ans = curr.val;
            }

            curr = curr.next;
            count++;
        }

        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */