package coding_test.intro100;

// 분수의 덧셈
public class AddFractions {
    public static void main(String[] args) {
        // 문제
        // 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
        // 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        // 기약분수를 구하는것이 어려웠다.

        int[] result1 = solution(1, 2, 3, 4);  //result [5,4]
        int[] result2 = solution(9,2,1,3);  //result [29,6]

    }

    private static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분자
        int numer = numer1 * denom2 + numer2 * denom1;
        // 분모
        int benom = denom1 * denom2;
        // 💡point! 분모를 1씩 감소하며 공통분모를 나누는것.
        for(int i = benom; i >= 1; i--){
            if(numer % i == 0 && benom % i == 0){
                numer /= i;
                benom /= i;
            }
        }

        int[] answer = {numer, benom};
        return answer;
    }

}
