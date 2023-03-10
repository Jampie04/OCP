package org.example;

public class ChapterFive {

    public void swim(int distance) {
        if(distance <= 0) {
// Exit early, nothing to do!
            return;
        }
        System.out.print("Fish is swimming " + distance + " meters");
    }
}
