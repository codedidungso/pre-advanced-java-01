
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thiennd
 */
public class sapxep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        
//        int[] a = new int[6];
//        
//        
//        for (int i = 0; i < 6; i++) {
//            System.out.println("Nhap");
//            a[i] = sc.nextInt();
//        }
//        
//        for (int i = 0; i < 6; i++) {
//            System.out.println(a[i]);
//        }

        System.out.print("Nhap vao kich thuoc: ");
        int N = sc.nextInt();

        int[][] arr1 = new int[N][N];
        int[][] arr2 = new int[N][N];
        int[][] arr3 = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Nhap vao arr1 " + i + ":" + j);
                arr1[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Nhap vao arr2 " + i + ":" + j);
                arr2[i][j] = sc.nextInt();
            }
        }
        
        //cong hai ma tran 
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        System.out.println("Key qua cong hai ma tran: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr3[i][j] + ", ");
            }
            System.out.println("");
        }
        //int[][] arr = new int[3][3];
    }
}
