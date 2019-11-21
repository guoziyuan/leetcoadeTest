class Solution {
    public void rotate(int[] nums, int k) {
        //第一步，k对数组长度取余
        k = k % nums.length;
        //第二步，翻转整个数组
        reverse(nums, 0, nums.length -1);
        //第三步，翻转前k个数据
        reverse(nums, 0, k-1);
        //第四步,翻转后n-k个数据
        reverse(nums, k, nums.length-1);
    }

    private void reverse(int[] array, int startPosition, int endPosition) {
        while (startPosition < endPosition) {
            int temp = array[startPosition];
            array[startPosition] = array[endPosition];
            array[endPosition] = temp;
            startPosition++;
            endPosition--;
        }
    }
}