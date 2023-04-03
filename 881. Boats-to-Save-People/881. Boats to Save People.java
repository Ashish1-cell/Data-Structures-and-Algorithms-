class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int count = 0;
        int sum = 0;
        Arrays.sort(people);
        int i = 0,j = people.length-1;
       
        while(i<j){
            sum = people[i] + people[j];            
            if(sum<=limit){
                count++;
                i++;
                j--;
            }
            // else if(sum==limit){
            //     count++;
            //     i++;
            //     j--;
            // }
          
            else{
                j--;
                count++;
            }
        }
         if(i==j)
            count++;

        return count;
    }
}
