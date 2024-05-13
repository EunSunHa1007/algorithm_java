package coding_test.intro100;
// 특정 문자 제거하기
public class RemoveSpeChar {
    public static void main(String[] args) {
        // 문제
        // 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
        // my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

        // 더 간편한 메소드를 활용할 필요.

        String result1 = RemoveSpeChar1("abcdef", "f");
        String result2 = RemoveSpeChar2("BCBdbe", "B");
    }

    private static String RemoveSpeChar2(String my_string, String letter) {
        String answer = "";
        // 💡 문자열 제거 -> 특정 문자를 빈 문자로 변경 하는 방법!
        answer = my_string.replace(letter, "");

        return answer;
    }

    // 내 풀이
    private static String RemoveSpeChar1(String my_string, String letter) {
        String answer = "";
        // String을 char 하나하나로 나눠서 한글자 하나하나 비교해서 문자열 생성
        char[] charArray = my_string.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        for(char c : charArray){
            String sval = String.valueOf(c);
            if(!sval.equals(letter)){
                sb.append(sval);
            }
        }
        return sb.toString();
    }
}
