/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author 84859
 */
public class Part1 {
    public static void main(String[] args) {
        int rows;
        int cols;
        int count = 0;

        //input rows and columns
        Scanner sc = new Scanner(System.in);
        System.out.print("Input rows:");
        rows = sc.nextInt();
        System.out.print("Input cols:");
        cols = sc.nextInt();

        //input values in matrix[][]
        int matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextInt();
                count++;
            }
        //output values of matrix[][]
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        //Calculate sum
        int sum = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        System.out.println("Sum of matrix[][] is " + sum);

        //calculate average of matrix
        System.out.println("Ave of matrix[][] is " + (sum/count));
    }
}
