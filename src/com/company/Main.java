package com.company;

public class Main {

    public static void main(String[] args) {
        final int N1 = 8;
        final int N2 = 10;
        SquaresList squaresList = new SquaresList();
        CubesList cubesList = new CubesList();
        double side = 0;
        for (int i = 0; i < N2; i++) {
            while (!Cube.CheckCorrectSide_length(side = Math.random() * 15)) ;
            {
                cubesList.add(new Cube(side));
            }
        }
        for (int i = 0; i < N1; i++) {
            while (!Square.CheckCorrectSide_length(side = Math.random() * 15)) ;
            {
                squaresList.add(new Square(side));
            }
        }

        System.out.println(squaresList);
        System.out.println("average area  of squares:\t" +squaresList.findAverage_Area());
        System.out.println(cubesList);
        System.out.println("amount max area cubes:\t" + cubesList.Cube_cubesMax());



    }
}