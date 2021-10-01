/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test5;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author User
 */
public class Test5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Отсортировать по возрастанию зубчатый массив из 5 строк с 3, 5, 7, 8, 9 - тью ячейками.
        Заполнить его случайными числами от 50 до 100 и отсортировать.
        Вывести в консоль массив неотсортированный и отсортированный.
        Загрузить код проекта на удаленный репозиторий Git.
        */
        Random random = new Random();
        int[][] massive = new int [5][];
        massive [0] = new int[3];
        massive [1] = new int[5];
        massive [2] = new int[7];
        massive [3] = new int[8];
        massive [4] = new int[9];
        int min = 50, max = 100, k = 0;
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = random.nextInt(max - min + 1)+ min;
            }
        }
        System.out.println("----------------------------\nнеотсортированный массив\n");
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.printf("%4d",massive[i][j]);
            }
            System.out.println("");
        }
        System.out.println("----------------------------\nотсортированный массив\n");
        for (int i = 0; i < massive.length; i++) {
            Arrays.sort(massive[i]);
            for (int j = 0; j < massive[i].length; j++) {
                System.out.printf("%4d",massive[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
