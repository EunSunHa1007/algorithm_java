package coding_test.intro100;

import java.util.Arrays;

// 배열 자르기
public class SliceArray {
    public static void main(String[] args) {
        // 문제
        // 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
        // numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

        // 정답이였으나 간단한 메소드 참고
        int[] result1 = SliceArray1(new int[]{1, 2, 3, 4, 5}, 1, 3);
        int[] result2 = SliceArray2(new int[]{1, 3, 5}, 1, 2);

    }
    // 내 풀이
    private static int[] SliceArray2(int[] numbers, int num1, int num2) {
        // 자르는 인덱스테 맞게 새로운 배열에 반복문을 사용해서 넣어줌
        int[] answer = new int[num2 - num1 + 1];

        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers[num1 + i];
        }

        return answer;
    }

    // 다른 방법
    private static int[] SliceArray1(int[] numbers, int num1, int num2) {
        // 💡 배열 복사
        // Arrays.copyOf(원본배열, 복사할 길이);
        // Arrays.copyOfRange(원본 배열, 복사할 시작 인덱스, 복사할 끝인덱스);
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
