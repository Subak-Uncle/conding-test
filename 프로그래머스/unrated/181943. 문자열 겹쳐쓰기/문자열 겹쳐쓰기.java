class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int overwrite_length = overwrite_string.length();
        
        String answer1 = my_string.substring(0,s);
        String answer2 = my_string.substring( s + overwrite_length);
        String answer = answer1 + overwrite_string + answer2;
            
        return answer;
    }
}