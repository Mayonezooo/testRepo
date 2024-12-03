package _3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int []inputNum = new int[5];
        for (int i = 0; i < 5; i++){
            inputNum[i] = scn.nextInt();
        }

        int []mode = new int[5];

        for (int i = 0; i < 5; i++) {
            int result = 1;
            for (int j = 0; j < 5; j++) {
                if (i!=j){
                    if (inputNum[i] == inputNum[j]){
                        result++;
                    }
                }
            }
            mode[i] = result;
            System.out.println(mode[i]);
        }

        int maxValue = 0;
        int resultNum = 0;

        for (int i = 0; i < mode.length-1; i++) {
            if (mode[i] < mode[i+1]) {
                mode[i] = mode[i+1];
            } else if (mode[i] == mode[i+1]){
                mode[i] = mode[i];
            }
            maxValue = mode[i];
            resultNum = inputNum[i];
        }
        System.out.println("maxValue : " + maxValue + ", resultNum : " + resultNum);
    }
}
