import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 입력 값
        String output = ""; // 출력 값
        int b; // 문자 비교 값
        
        for (int i=0; i<a.length(); i++) {
            b = (int) a.charAt(i); // ASCII 코드 실수화
            if (b <= 90) b += 32; // if 대문자 -> 소문자
            else b -= 32; // else if 소문자 -> 대문자
            
            output += (char) b; // 다시 문자로 변경
        }
            System.out.print(output);
    }
}