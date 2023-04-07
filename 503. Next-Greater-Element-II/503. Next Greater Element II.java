class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int result[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length-2;i>=0;i--){
            stack.push(nums[i]);
        }
        Outer:
        for(int i = nums.length-1;i>=0;i--){
            while(!stack.isEmpty()){
                if(nums[i]<stack.peek()){
                    result[i]=stack.peek();
                    stack.push(nums[i]);
                    continue Outer;
                }
                else{
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i] = -1;
                stack.push(nums[i]);
            }
        }
        
        return result;

    }
}
