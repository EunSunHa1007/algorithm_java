package coding_test.intro100;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OrderArrayArrange {
    public static void main(String[] args) {
        // 진료 순서 정하기
        int[] result1 = OrderArrayArrange1(new int[]{3, 76, 24});
        //순서쌍의 개수
        int result2 = Solution(20);
    }
    
    // 내 풀이
    private static int Solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            // 💡 분모, 분자 위치 주의 (분모 / 분자)
            int intval = n % i;
            if(intval == 0) {
                answer++;
            }
        }
        return answer;
    }

    // 내 풀이
    private static int[] OrderArrayArrange1(int[] emergency) {
        int[] copyArray = emergency.clone();
        // 💡 내림차순 정렬
        // String - Arrays.sort(arr, Collections.reverseOrder());
        // int - Integer 타입으로 변경해주어야한다.
        //       Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        //       Arrays.sort(arr2, Collections.reverseOrder());
        Integer[] integerArray = Arrays.stream(copyArray).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray, Collections.reverseOrder());

        // Map에 내림차순 한 순서대로 순번을 value로 넣는다.
        Map<Integer, Integer> sortMap = new HashMap<>();
        int index = 0;
        for(Integer copyVal : integerArray){
            sortMap.put(copyVal, ++index);
        }

        // 초기 배열의 원소와 대응하는 순서로 값 변경
        for(int i = 0; i < emergency.length; i++){
            emergency[i] = sortMap.get(emergency[i]);
        }

        return emergency;
    }
}
