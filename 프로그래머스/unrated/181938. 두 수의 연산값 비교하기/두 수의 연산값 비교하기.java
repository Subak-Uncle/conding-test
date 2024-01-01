class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.valueOf("" + a + b);
        int num2 = 2*a*b;
        int answer = num1>num2? num1 : num2;
        return answer;
    }
}