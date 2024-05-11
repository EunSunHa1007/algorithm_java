package coding_test.intro100;
//문자 반복 출력하기
public class RepeatOutput {
    public static void main(String[] args) {
        // 문제
        // 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
        // my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
        
        //어렵지 않으나 다른 코드도 참고
        
        String result1 = ReapeatOutput1("hello", 3);
        String result2 = ReapeatOutput2("hello", 4);
        String result3 = ReapeatOutput3("hello", 5);
    }
    // 내 풀이
    private static String ReapeatOutput3(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        // 💡 string 의 문자를 하나의 배열의 요소(charAt())로 가져온 후 String 변환시켜 repeat() 메소드 사용
        // repeat() 한 문자열을 StringBuilder 에 append 시켜줌
        for(int i = 0; i < my_string.length(); i++){
            char oneChar = my_string.charAt(i);
            sb.append(String.valueOf(oneChar).repeat(n));
        }
        answer = sb.toString();
        return answer;
    }

    // 다른 풀이 1
    private static String ReapeatOutput2(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        // 💡 나와 비슷한 방식
        // 문자열을 toCharArray()를 통해 문자 배열로 만들어 문자열과의 연산을 통해 문자열로 변환시켜줌
        // 내 방식은 String.valueOf() 이 방식은 문자+문자열("") = 문자열 공식 사용
        // repeat() 사용하여 StringBuilder에 append 해주는것도 동일.
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }

    // 다른 풀이 2
    private static String ReapeatOutput1(String my_string, int n) {
        // 💡 문자열을 문자 char로 나누지 않고 문자열로 나누어 다른 변환과정 없이 반복해준다.
        // 문자열의 split() 메소드를 사용하여 문자열 배열에 담아 반복문을 돌려 repeat 해준다!
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }
}
