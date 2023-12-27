class Solution {
    public String solution(String str1, String str2) {
        
        char[] str1_char = str1.toCharArray();
        char[] str2_char = str2.toCharArray();
        int str1_length = str1.length();
        String answer = "";
        
        for (int i=0; i<str1_length; i++) {
            
            answer += String.valueOf(str1_char[i]);
            answer += String.valueOf(str2_char[i]);
        }
        
        return answer;
    }
}