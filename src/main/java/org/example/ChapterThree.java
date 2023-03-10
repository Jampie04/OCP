package org.example;

import java.util.Date;
import java.util.List;

public class ChapterThree {

    //Flow scoping

    public void timeOfDay() {
        Date date = new Date();
        int hourOfDay = date.getHours();
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");

        }
    }

    public void switchExpressionStatement() {

        //semicolon na elk case en ook na je switch statement

        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {
                yield "Trout";
            }
            case 3 -> {
                if (length > 10) yield "Blobfish";
                else yield "Green";

            }
            default -> "Swordfish";
        };


    }

    public void whileLoop() {
        int counter = 0;
        while (counter < 10) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }
        int full = 5;
        while (full < 5) {
            System.out.println("Not full!");
            full++;
        }
    }

    public void doWhileLoop() {

        // Let op de curly braces
        int lizard = 0;
        do {
            lizard++;
        } while (false);
        System.out.println(lizard);

    }

    public void forLoop() {
        //moet je variablen declaren anders ziet die sout het niet omdat sout buiten die loop is
        int i;
        for (i = 0; i < 10; i++)
            System.out.println("Value is: " + i);
//        System.out.println(i);

        // Hoef je geen variable te declaren
        for (int j = 0; j < 5; j++) {
            System.out.print(j + " ");
        }

        //Die loop print cijfers in reverse
        for (var counter = 5; counter >= 0; counter--) {
            System.out.print(counter + " ");
        }

        //Multiple terms in a for loop
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x + " ");

        // Infinite loop
//        for( ; ; )
//            System.out.println("Hello World");


    }

    public void printNames(String[] names) {
        for (int counter = 0; counter < names.length; counter++)
            System.out.println(names[counter]);
    }

    //shorter version of the method above
    public void printNames1(String[] names) {
        for (var name : names)
            System.out.println(name);
    }

    public void printNames2(List<String> names) {
        //inplaats van "var" kan je ook de datatype van je "List" zetten
        //dus in dit geval "String"
        for (var name : names)
            System.out.println(name);
    }

    public void nestedForLoops() {
//        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
//        for (int[] mySimpleArray : myComplexArray) {
//            for (int i = 0; i < mySimpleArray.length; i++) {
//                System.out.print(mySimpleArray[i] + "\t");
//            }
//            System.out.println();
//        }
        int hungryKeith = 8;
        while (hungryKeith > 0) {
            do {
                hungryKeith -= 2;
            } while (hungryKeith > 5);
            hungryKeith--;
            System.out.print(hungryKeith + ", ");
        }
    }

    public void continueInNestedLoops() {
        CLEANING:
        for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2) {
                    continue CLEANING;
                }
                System.out.println("Cleaning: " + stables + "," + leopard);
            }
        }
    }

}