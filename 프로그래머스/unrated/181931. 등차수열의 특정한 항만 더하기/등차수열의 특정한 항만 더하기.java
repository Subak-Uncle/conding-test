class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int interval = included.length;
        
        for (int i=0; i<interval; i++) {
            
            if ( i != 0 ) a+=d;
            
            if ( included[i] ) {
                answer += a;
            } 
            
        }
        
        return answer;
    }
}