/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author thiennd
 */
public class heapSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] sort = new int[x * y];
        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sort[count] = arr[i][j];
            }
        }
        Arrays.sort(sort);
        count = 0;
        int p = 0; //x
        int q = 0; //y
        int temp = 0;
        int countLoops = 1;
        

    }

}
