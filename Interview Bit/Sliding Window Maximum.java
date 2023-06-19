public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        int i =0,j=0,max = -1;
        int N = A.size();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        while(j<N){

                    while(!queue.isEmpty() && A.get(j)>queue.getLast()){
                        queue.removeLast();    
                    }   
                    queue.addLast(A.get(j));
                    
                

            if(j-i+1==B){
                
                result.add(queue.getFirst());
                if(A.get(i)==queue.getFirst()){
                    queue.removeFirst();
                }
               
                i++;    
            }
            j++;
        }
        
        if(B>A.size()){
            result.add(queue.getFirst()); // edge case
        }
        return result;
    }
}
