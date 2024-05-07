package coding_test.intro100;
import java.util.Arrays;

//중앙값 구하기
public class Median {
    public static void main(String[] args) {
        // 문제
        // 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
        // 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
        // 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

        // 배열의 오름차순 정렬하는것이 어려웠음
        // 1. 첫번째 인덱스부터 최소값으로 채워나간다. 이중 for문 이용
        // 2. Arrays.sort() 오름차순 정렬
        // * 내림차순 정렬할때는 Collections.reverseOrder() 함수 사용
        // ex) Arrays.sort(new int[]{1,3,4,2,5}, Collections.reverseOrder());


        int result1 = getMedianFor(new int[]{5, 3, 1, 9, 7});
        int result2 = getMedianSort(new int[]{5, 3, 1, 9, 7});
        int result3 = getMedianFor(new int[]{7, 31, 6, 44, 1, -5, 20});
        int result4 = getMedianSort(new int[]{7, 31, 6, 44, 1, -5, 20});
    }

    private static int getMedianSort(int[] array) {
        int answer = 0;
        Arrays.sort(array); // 💡

        int index = array.length / 2 ;
        answer = array[index];
        return answer;
    }

    private static int getMedianFor(int[] array) {
        int answer = 0;

        for(int i = 0; i < array.length; i++){  // 💡
            for(int j = i; j< array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int index = array.length / 2 ;
        answer = array[index];
        return answer;
    }
}
