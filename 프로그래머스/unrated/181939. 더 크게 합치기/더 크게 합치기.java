class Solution {
    public int solution(int a, int b) {
        String answer_1 = a + "" + b;
        String answer_2 = b + "" + a;
        
        if (Integer.parseInt(answer_1) > Integer.parseInt(answer_2)) {
            return Integer.parseInt(answer_1);
        }
        return Integer.parseInt(answer_2);
    }
}