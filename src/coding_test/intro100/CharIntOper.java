package coding_test.intro100;

import java.util.stream.Stream;

//외계행성 나이
public class CharIntOper {
    public static void main(String[] args) {
        // 문제
        // 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 
        // 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. 
        // a는 0, b는 1, c는 2, ..., j는 9입니다. 
        // 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 
        // 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
    
        // char & int 연산과정 중 편리한 방법이 있을까.
        String result1 = CharIntOper1(23);
        String result2 = CharIntOper1(51);
        String result3 = CharIntOper1(100);
    }

    private static String CharIntOper1(int age) {
        String answer = "";

        // 💡 int -> int[]
        int[] nums = Stream.of(String.valueOf(age).split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        for(int num : nums){
            char code = (char)('a' + num);
            answer += String.valueOf(code);
        }

        return answer;
    }
}
