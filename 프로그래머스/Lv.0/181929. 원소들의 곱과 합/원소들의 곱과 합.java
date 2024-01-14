

class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int sum = 0;
        int num_list_length = num_list.length;
        
        for (int i=0; i<num_list_length; i++) {
            
            multiply *= num_list[i];
            sum += num_list[i];
            
        } 
        sum = sum*sum;
        
        if ( sum > multiply ) return 1;
        else return 0;
        
    }
}