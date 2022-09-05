package Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxBlur {

    int[][] solution(int[][] image) {
        int[][] result = new int[image.length-2][];
        for (int i = 1; i < image.length-1; i++) {
            List<Integer> blurPixel = new ArrayList<>();

            for (int j = 1; j < image[i].length-1; j++) {
                int[] sCOne = Arrays.copyOfRange(image[i-1], j-1, j+2);
                int[] sCTwo = Arrays.copyOfRange(image[i], j-1, j+2);
                int[] sCThree = Arrays.copyOfRange(image[i+1], j-1, j+2);

                int intBlurPool = 0;
                intBlurPool += Arrays.stream(sCOne).sum();
                intBlurPool +=  Arrays.stream(sCTwo).sum();
                intBlurPool += Arrays.stream(sCThree).sum();

                blurPixel.add((int)Math.floor(intBlurPool/9));
            }
            result[i-1] = blurPixel.stream().mapToInt(num -> num).toArray();
        }
        return result;
    }


}
