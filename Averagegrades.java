import java.util.Arrays;
import java.util.Scanner;

public class Averagegrades {
    public static int[] averge_grades(int grades[][],int weights[]) {
        int[] average = new int[grades.length];
        int sum = 0;
        for(int i=0;i<grades.length;i++) {
            for(int j=0;j<weights.length;j++) {
                sum+=weights[j]*grades[i][j];
                average[i]=sum/100;


            }
            sum=0;
        }
        return average;

    }
    public static void main(String[] args) {
        int[][] grades={{51,83,28},{0,38,95}};
        int[] weights={30,40,30};
        int[] average=averge_grades(grades,weights);
        System.out.println(Arrays.toString(average));
    }

}
