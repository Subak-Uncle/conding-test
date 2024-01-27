import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        // int[] -> IntStream
        IntStream intStream = Arrays.stream(num_list);
        
        // IntStream -> stream<Integer>
        Stream<Integer> stream = intStream.boxed();
        
        // stream<Integer> -> list<Integer>
        List<Integer> answer = stream.collect(Collectors.toList());
        
        int last_num = num_list.length - 1;
        System.out.print(last_num);
        
        if ( num_list[last_num] > num_list[last_num - 1] ) last_num = num_list[last_num] - num_list[last_num - 1];
        else last_num = num_list[last_num] * 2;
        
        answer.add(last_num);
        
        // list<Integer> -> int[]
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}