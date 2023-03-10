package org.example;

public class ChapterTwo {
    int i = 0;

    static int cookies = 4;
    static double reward = 3 + 2 * --cookies;
    int fish = (int)1.0;
    short bird = (short)1921222; // Stored as 20678
    int mammal = (int)9f;
    int camel = 2, giraffe = 3;

    int owl = 5;
    int food;

    public Integer alsStatements() {
        if (owl < 2) {
            food = 3;
        } else {
            food = 4;
        }
        return food;
    }

    // Dit is t zelfde als bovenstaande if-statement
    int owl1 = 5;
    int food1 = owl < 2 ? 3 : 4;

}
