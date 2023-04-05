class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length_1 = nums1.length;
        int length_2 = nums2.length;
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        //Added NGE value in the hashmap of all elements of nums2 array
          Outer:
        for(int i = length_2-1 ;i>=0;i-- ){
          
            while(!stack.isEmpty()){
                if(nums2[i]<stack.peek()){
                    map.put(nums2[i],stack.peek());
                    stack.push(nums2[i]);
                    continue Outer;
                }
                else{
                     stack.pop();
                }

            }
            if(stack.isEmpty()){
                map.put(nums2[i],-1);
                stack.push(nums2[i]);

            }            
        }       
        //Adding the NGE value of the elements in nums1
        for(int i = 0;i<length_1;i++){
           
                nums1[i] = map.get(nums1[i]);
            

        }
        return nums1;
    }
}
