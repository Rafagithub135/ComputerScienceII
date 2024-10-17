package Exam1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createItem();
    }

    public static void createItem() {
        Scanner kbInput = new Scanner(System.in);
        int type;
        String media;
        double size;
        String name;
        for (int i = 1; i < 4; i++) {
            System.out.println("Select recording type # " + i + "...");
            System.out.println("1. CD");
            System.out.println("2. DVD");
            System.out.println("3. Blu-ray");
            System.out.println();
            System.out.println("Enter choice:  ");
            type = Integer.parseInt(kbInput.nextLine());
            if (type == 1) {
                media = "CD";
            } else if (type == 2) {
                media = "DVD";
            } else {
                media = "Blu-ray";
            }
            System.out.println("You selected " + media + ".");
            System.out.println("How long is the recording?");
            double length = Double.parseDouble(kbInput.nextLine());
            System.out.println("What is the name of the song?");
            name = kbInput.nextLine();
            System.out.println(media + ", " + length + ", " + name);
            createArray(media, length, name);
        }
    }
    public static void createArray(String media, double length, String name) {
        AudioRecording[] recordings = new AudioRecording[3];
        for (int i = 0; i < recordings.length; i++) {
            if (media.equals("CD")) {
                recordings[i] = new CD();
            } else if (media.equals("DVD")) {
                recordings[i] = new DVD();
            } else {
                recordings[i] = new BluRay();
            }
            recordings[i].songLength(length);
            recordings[i].songName(name);
        }
    }
}