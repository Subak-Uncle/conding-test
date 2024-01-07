class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
                
        char[] arr = code.toCharArray();
        int arr_length = arr.length;
        
        for (int i=0; i<arr_length; i++ ) {
            
            if (arr[i] == '1') {
                
                if (mode == 1) mode = 0;
                else mode = 1;

            } else {
                
                if ( mode == 0 && i % 2 == 0) answer += arr[i];                
                if ( mode == 1 && i % 2 == 1)  answer += arr[i];
                
            }
            
        }
        
        if ( answer=="" || answer.length() == 0) return "EMPTY";
        
        return answer;
    }
}