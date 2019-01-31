package project_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project_two {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("input.txt");
        Scanner s = new Scanner(f);
        int n_cases = s.nextInt();
        for (int i = 1; i <= n_cases; i++) {
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int[][] A = new int[n1][n2];
            for (int j = 0; j < A.length; j++) {
                for (int k = 0; k < A[j].length; k++) {
                    A[j][k] = s.nextInt();
                }
            }
            int n3 = s.nextInt();
            int n4 = s.nextInt();
            int[][] B = new int[n3][n4];
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < B[j].length; k++) {
                    B[j][k] = s.nextInt();
                }
            }
            int n_operation = s.nextInt();
            System.out.println("case #" + i + ":");
            for (int j = 1; j <= n_operation; j++) {
                String operationName = s.next();
                switch (operationName) {
                    case "SUM":
                        String c1 = s.next();
                        s.next();
                        if (c1.equals("A")) {
                            System.out.println("SUM A B");
                            int[][] z = SUM(A, B);
                            printArray(z);
                        } else {
                            System.out.println("SUM B A");
                            int[][] z = SUM(B, A);
                            printArray(z);
                        }
                        break;
                    case "SUBT":
                        c1 = s.next();
                        s.next();
                        if (c1.equals("A")) {
                            System.out.println("SUBT A B");
                            int[][] z = SUBT(A, B);
                            printArray(z);
                        } else {
                            System.out.println("SUBT B A");
                            int[][] z = SUBT(B, A);
                            printArray(z);
                        }
                        break;
                    case "MUL":
                        c1 = s.next();
                        if (c1.equals("A")) {
                            System.out.println("MUL A B");
                            int[][] z = MUL(A, B);
                            printArray(z);
                            s.next();
                        } else {
                            System.out.println("MUL B A");
                            int[][] z = MUL(B, A);
                            printArray(z);
                            s.next();
                        }
                        break;
                    case "Transpose":
                        c1 = s.next();
                        if (c1.equals("A")) {
                            System.out.println("Transpose A");
                            int[][] z = Transpose(A, n1, n2);
                            printArray(z);
                        } else {
                            System.out.println("Transpose B");
                            int[][] z = Transpose(B, n3, n4);
                            printArray(z);
                        }
                        break;
                    case "Det":
                        c1 = s.next();
                        if (c1.equals("A")) {
                            System.out.println("Det A");
                            Det(A);
                        } else {
                            System.out.println("Det B");
                            int z = Det(B);
                            System.out.println(z);
                        }
                        break;
                }
            }
            System.out.println();
        }
    }

    public static int[][] SUM(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] SUBT(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

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
        }
        return result;
    }

    public static int[][] Transpose(int[][] A, int n1, int n2) {
        int[][] result = new int[n2][n1];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = A[j][i];
            }
        }
        return result;
    }

    public static void printArray(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static int Det(int[][] m) {
        int temporary[][];
        int result = 0;

        if (m.length == 1) {
            result = m[0][0];
            return result;
        }
        if (m.length == 2) {
            result = ((m[0][0] * m[1][1]) - (m[0][1] * m[1][0]));
            return result;
        }
        for (int i = 0; i < m[0].length; i++) {
            temporary = new int[m.length - 1][m[0].length - 1];

            for (int j = 1; j < m.length; j++) {
                for (int k = 0; k < m[0].length; k++) {
                    if (k < i) {
                        temporary[j - 1][k] = m[j][k];
                    } else if (k > i) {
                        temporary[j - 1][k - 1] = m[j][k];
                    }
                }
            }

            result += m[0][i] * Math.pow(-1, i) * Det(temporary);
        }
        return result;
    }
}
