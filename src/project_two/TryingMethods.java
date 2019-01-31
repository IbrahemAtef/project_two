/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_two;

/**
 *
 * @author Doctor
 */
public class TryingMethods {

    public static void main(String[] args) {
        int[][] A = {
            {91,26,75,98,86}
        };
        int[][] B = {
            {30,88},
            {57,12},
            {32,95},
            {93,13},
            {33,28}
        };
        System.out.println("hellow");
        int z [][] = MUL(A, B);
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                System.out.print(z[i][j] + "\t");
            }
        }
    }
//
//    public static void SUM(int[][] A, int[][] B) {
//        int[][] result = new int[A.length][A[0].length];
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                result[i][j] = A[i][j] * B[i][j];
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j] + "  ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static int[][] Transpose(int[][] A, int n1, int n2) {
//        int[][] result = new int[n2][n1];
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                result[i][j] = A[j][i];
//            }
//        }
//        return result;
//    }
//
    public static int[][] MUL(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
                sum = 0;
            }
            System.out.println();
        }
        return result;
    }
}

