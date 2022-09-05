package TheCore.ListForestEdge;

public class ReplaceMiddle {

    int[] solution(int[] arr) {
        if (arr.length % 2 == 1) return arr;

        int[] result = new int[arr.length - 1];
        int middle = arr[arr.length / 2] + arr[arr.length / 2 - 1],
                resultCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length / 2 - 1) {
                result[resultCounter] = middle;
                i++;
            } else {
                result[resultCounter] = arr[i];
            }
            resultCounter++;
        }
        return result;
    }

    int[] solution2(int[] arr) {
        if (arr.length % 2 == 1)
            return arr;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length / 2; i++) {
            newArr[i] += arr[i];
            newArr[newArr.length - 1 - i] += arr[arr.length - 1 - i];
        }
        return newArr;
    }
}
