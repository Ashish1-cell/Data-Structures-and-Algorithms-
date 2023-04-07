class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
       Stack<Integer> index = new Stack<>();
       index.push(-1);
        int count = 0;
        // int max = 0;
        if(s.length()==0)
        return 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='(' ){
                stack.push(s.charAt(i));
                index.push(i);

            }
            else{
                if(!stack.isEmpty()){
                    if(s.charAt(i)==')' && stack.peek()=='(' ){
                        stack.pop();
                        index.pop();
                        count = Math.max(count,i-index.peek());
                        
                    }
                }
                else{
                    index.push(i);
                }
      
            }
        }

    return count;     
        
    }
}
