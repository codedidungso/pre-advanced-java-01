package chuabai;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author thiennd
 */
public class Main {

    public static void main(String[] args) {
        int n = 1;
        int m = 1000;
        int[] arr = {1, 2};
        System.out.println(numberSteps(n, arr, m));
    }
    static boolean[] check = new boolean[1000005];

    static int numberSteps(int n, int[] arr, int m) {
        Queue<NODE> q = new LinkedList<NODE>();
        q.add(new NODE(n, 0));

        while (!q.isEmpty()) {
            System.out.println("NODE : " + q.element().value + " : " + q.element().time);
            if (q.peek().value == m) {
                return q.peek().time;
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] * q.peek().value <= m && !check[q.peek().value * arr[i]]) {
                    check[q.peek().value * arr[i]] = true;
                    q.add(new NODE(arr[i] * q.peek().value, q.peek().time + 1));
                }
                if (arr[i] + q.peek().value <= m && !check[q.peek().value + arr[i]]) {
                    check[q.peek().value + arr[i]] = true;
                    q.add(new NODE(arr[i] + q.peek().value, q.peek().time + 1));
                }
            }
            q.poll();

        }
        return -1;
    }
}

class NODE {

    int value;
    int time;

    public NODE(int value, int time) {
        this.value = value;
        this.time = time;
    }

}
