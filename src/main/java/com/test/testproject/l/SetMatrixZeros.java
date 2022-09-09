package com.test.testproject.l;

/**
 * Created by appu.yadav on 28/07/22
 */
public class SetMatrixZeros {

    public static void main(String[] args) {
        int[][] matrix;

     /*   for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
                matrix
            }
            System.out.println();

        }*/

        matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {

        boolean[][] newmatrix = new boolean[matrix.length][matrix[0].length];
        System.out.println(""+matrix.length+ " "+matrix[0].length);


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    storeZeros(i, j, newmatrix);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (newmatrix[i][j]) {
                    matrix[i][j] = 0;
                }
            }
        }

            for (int o =0; o<matrix.length; o++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[o][j] + " ");
                }
                System.out.println();

            }
        }

        static void storeZeros(int a, int b, boolean[][] ap){

            for (int k = 0; k < ap.length; k++) {
                ap[k][b] = true;
            }

            for (int l = 0; l < ap[0].length; l++) {
                ap[a][l] = true;
            }

        }
    }
