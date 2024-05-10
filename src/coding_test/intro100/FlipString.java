package coding_test.intro100;
// 문자열 뒤집기
public class FlipString {
    public static void main(String[] args) {
        // 문제
        // 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

        // 문자열 뒤집기 방법에 대해 알 필요가 있음

        String result1 = flipString1("jaron");
        String result2 = flipString2("jaron");

    }

    private static String flipString2(String my_string) {
        StringBuilder sb = new StringBuilder();
        // 💡 String / StringBuilder
        // String은 변경 불가능한 문자열이므로 문자열끼리 + 로 연산할때마다 또다른 문자열이 생성되어 메모리에 적재된다.
        // StringBuilder는 변경 가능한 문자열을 만들어주기 때문에 String을 합치는 작업 시 하나의 대안이 될 수 있다.
        // StringBuilder append() 사용
        sb.append(my_string);

        // 💡 StringBuilder reverse() 사용
        sb.reverse();

        return sb.toString();
    }

    // 내 풀이
    private static String flipString1(String my_string) {
        // 문자열을 뒤부터 한자하나 char[]에 담은 후 문자열로 변환
        char[] charArray = new char[my_string.length()];
        for(int i = 0; i < charArray.length; i++){
            //String charAt() 사용
            charArray[i] = my_string.charAt(charArray.length - i - 1);
        }
        // 💡 어떤 값을 String 으로 형변환 할 때 String.valueOf() 메소드 사용
        return String.valueOf(charArray);

        // 💡 String.valueOf() : 파라미터가 null이면 문자열 "null"을 만들어서 반환
        // 💡 toString() : 대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력
    }
}
