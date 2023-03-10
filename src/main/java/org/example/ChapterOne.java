package org.example;

public class ChapterOne extends ChapterSix {

    public ChapterOne (char name) {

    }

    public ChapterOne (String name) {


    }

    public ChapterOne (int x){


    }
    static String greeting;
    static String reference = "hello";
    static int len = reference.length();


    static Integer number = Integer.parseInt("456");
    static int primitive = Integer.parseInt("123");
    static String eyeTest1 = "\" Java Study Guide\"\n by Scott Jeanne";
    static String eyeTest2 = """
               *
              * *
             * * *
            """;

    static String block = """
            doe \
            deer""";

    static String block1 = """
           doe \n
           deer
           """;
    short x = -128;
    char y = 1;






    //Part of Chapter Six
    public ChapterOne(){
        size = 10.2;
    }

    public void printDetails(){
        System.out.println(size);
    }

}
