package org.example;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;


public class Main {

    //Chapter three return
    private static int[] searchForValue(int[][] list, int v) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == v) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {

        //              Chapter One

        ChapterOne chapterOne = new ChapterOne();
//        Main main = new Main();
//        ChapterOne.greeting = "How are you";
//        System.out.println(ChapterOne.greeting);
//        System.out.println(ChapterOne.len);
//        System.out.println(ChapterOne.number);
//        System.out.println(ChapterOne.primitive);
//        System.out.println(ChapterOne.eyeTest1);
//        System.out.println(ChapterOne.eyeTest2);
//        System.out.println(ChapterOne.block);
//        System.out.println(ChapterOne.block1);

        //                 Chapter Two
        ChapterTwo chapterTwo = new ChapterTwo();
//        System.out.println(chapterTwo.i++);
//        System.out.println("Child receives: "+ChapterTwo.reward+" reward points");
//        System.out.println(chapterTwo.i);
//        System.out.println(chapterTwo.fish);
//        System.out.println(chapterTwo.bird);
//        System.out.println(chapterTwo.mammal);
//        System.out.println(chapterTwo.camel *= chapterTwo.giraffe);
//        System.out.println(chapterTwo.camel *= chapterTwo.giraffe);
//        System.out.println(chapterTwo.alsStatements());

        //                  Chapter Three
        var chapterThree = new ChapterThree();
        String string = new String();

//        chapterThree.timeOfDay();
//        chapterThree.switchExpressionStatement();
//        chapterThree.whileLoop();
//        chapterThree.doWhileLoop();
//        chapterThree.forLoop();
//        chapterThree.printNames();
//        chapterThree.printNames1();
//        chapterThree.nestedForLoops();
//        chapterThree.continueInNestedLoops();
//        int[][] list = {{1, 13}, {5, 2}, {2, 2}};
//        int searchValue = 2;
//        int[] results = searchForValue(list, searchValue);
//        if (results == null) {
//            System.out.println("Value " + searchValue + " not found");
//        } else {
//            System.out.println("Value " + searchValue + " found at: " +
//                    "(" + results[0] + "," + results[1] + ")");
//        }


        //              Chapter Four

        ChapterFour chapterFour = new ChapterFour();

        //substring(startIndex, endIndex)
//        System.out.println(ChapterFour.name.substring(2,3));//m
//
//        System.out.println(ChapterFour.name.toUpperCase());
//        System.out.println("jamil".toUpperCase());
//        System.out.println(ChapterFour.name1.toLowerCase());
//        System.out.println("jamil".toLowerCase());

//        System.out.println(chapterFour.block.length());//6
//        System.out.println(chapterFour.concat.length());//9
//        System.out.println(chapterFour.block.indent(1).length());//10
//        System.out.println(chapterFour.concat.indent(-1).length());//7
//        System.out.println(chapterFour.concat.indent(-4).length());//6
//        System.out.println(chapterFour.concat.stripIndent().length());//6

//        System.out.println(ChapterFour.str.translateEscapes());

//        System.out.println("Hello "+chapterFour.name2+", order "+chapterFour.orderId+" is ready");
//        System.out.println(String.format("Hello %s, order %d is ready",
//                chapterFour.name, chapterFour.orderId));
//        System.out.println("Hello %s, order %d is ready"
//                .formatted(chapterFour.name, chapterFour.orderId));


//        var pi = 3.14159265359;
//
//        System.out.format("[%f]",pi); // [3.141593]
//        System.out.format("[%12.8f]",pi); // [ 3.14159265]
//        System.out.format("[%012f]",pi); // [00003.141593]
//        System.out.format("[%12.2f]",pi); // [ 3.14]
//        System.out.format("[%.3f]",pi); // [3.142]


        //immutable: de state van je object verandert niet
//        String alpha = "";
//        for (char current = 'a'; current <= 'z'; current++)
//            alpha += current;
//        System.out.println(alpha);
//
//
//        //Print hetzelfde als bovenstaande
//        //Mutable: Je state van je object verandert
//        StringBuilder alpha1 = new StringBuilder();
//        for (char current = 'a'; current <= 'z'; current++)
//            alpha1.append(current);
//        System.out.println(alpha);


        //Binary search geeft alleen correcte result wanneer de array al gesorteerd is
//        int[] numbers = {2,4,6,8};
//         System.out.println(Arrays.binarySearch(numbers, 2)); // 0
//         System.out.println(Arrays.binarySearch(numbers, 4)); // 1
//         System.out.println(Arrays.binarySearch(numbers, 1)); // - 1
//         System.out.println(Arrays.binarySearch(numbers, 3)); // - 2
//         System.out.println(Arrays.binarySearch(numbers, 9)); // - 5
//
//
//        //BinarySearch splits de array in 2 delen dan gaat hij zoeken waar het element zit
//        //Dit zorgt ervoor dat element "3" een "foute" index returned
//        int[] numbers1 = {3,2,1};
//         System.out.println(Arrays.binarySearch(numbers1, 2));//1
//         System.out.println(Arrays.binarySearch(numbers1, 3));//-4
//
        //vergelijken welke array groter is
//        Arrays.mismatch(numbers, numbers1);
//        Arrays.compare(numbers1, numbers);

//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//        System.out.println(ZonedDateTime.now());
//
//        //Date & Time optellen
//        var date = LocalDate.of(2022, Month.JANUARY, 20);
//        System.out.println(date); // 2022–01–20
//        date = date.plusDays(2);
//        System.out.println(date); // 2022–01–22
//        date = date.plusWeeks(1);
//        System.out.println(date); // 2022–01–29
//        date = date.plusMonths(1);
//        System.out.println(date); // 2022–02–28
//        date = date.plusYears(5);
//        System.out.println(date); // 2027–02–28


        //Datum Aftrekken
//        var date1 = LocalDate.of(2024, Month.JANUARY, 20);
//        var time = LocalTime.of(5, 15);
//        var dateTime = LocalDateTime.of(date1, time)
//                .minusDays(1).minusHours(10).minusSeconds(30).minusNanos(1000);
//        System.out.println(dateTime);

        //Periods
//        var annually = Period.ofYears(1); // every 1 year
//        System.out.println(annually);
//        var quarterly = Period.ofMonths(3); // every 3 months
//        System.out.println(quarterly);
//        var everyThreeWeeks = Period.ofWeeks(5); // every 3 weeks
//        System.out.println(everyThreeWeeks);
//        var everyOtherDay = Period.ofDays(2); // every 2 days
//        System.out.println(everyOtherDay);
//        var everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
//        System.out.println(everyYearAndAWeek);

//        var date = LocalDate.of(2022, 1, 29);
//        var time2 = LocalTime.of(6, 15);
//        var dateTime2 = LocalDateTime.of(date, time2);
//        var period = Period.ofMonths(1);
//        System.out.println(date.plus(period)); // 2022–02–20
//        System.out.println(dateTime2.plus(period)); // 2022–02–20T06:15
////        System.out.println(time2.plus(period)); // Exception
//
//        //Duration
//        var daily = Duration.ofDays(1); // PT24H
//
//        //kan ook geschreven worden als
//        var daily1 = Duration.of(1, ChronoUnit.DAYS);


                    //Chapter Five

        ChapterFive chapterFive = new ChapterFive();

//        chapterFive.swim(12);


       new ChapterSix();

        //Chapter One extends Chapter Six
        chapterOne.printDetails();



    }
}
