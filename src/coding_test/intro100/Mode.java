package coding_test.intro100;

import java.util.HashMap;
import java.util.Map;
//최빈값 구하기
public class Mode {
    public static void main(String[] args) {
        // 문제
        // 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
        // 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
        // 최빈값이 여러 개면 -1을 return 합니다.

        // 배열의 각 요소별로 갯수를 count 하는것이 어려웠음
        // 각 요소별로 갯수를 저장하기 위해 Map 자료형 사용
        // Map - get(key) : key가 존재하지 않으면 null 반환
        // Map - getOrDefault(key, defaultValue) : key가 없을때 null 대신 기본값 반환
        // 하나하나 갯수를 count 해주고 map에 담아준다. 그리고 그떄그때 maxCount를 지정해주고 count와 비교하여 answer를 지정해준다.

        int[] intArray1 = {1, 2, 3, 3, 3, 4};
        int[] intArray2 = {1, 1, 2, 2};
        int[] intArray3 = {1};

        int result1 =  getMidResult(intArray1);
        int result2 =  getMidResult(intArray2);
        int result3 =  getMidResult(intArray3);
    }

    private static int getMidResult(int[] array){
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1; // 💡
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}
