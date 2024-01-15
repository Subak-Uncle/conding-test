class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num_list_length = num_list.length;
        String odd = "";
        String even = "";
        
        for (int i : num_list) {
            
            if (i % 2 == 0) even += i;
            if (i % 2 == 1) odd += i;
            
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        
        return answer;
    }
}