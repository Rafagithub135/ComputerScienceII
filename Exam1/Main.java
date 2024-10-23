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
//        System.out.println("The largest song is " + name + " and it takes up " + med + " Megabites.");
    }
    public static void createArray(String media, double length, String name) {
        AudioRecording[] recordings = new AudioRecording[3];
        int counter =0;
        double size = 0;
        double med = 0;
        if(media.equals("CD")) {

            med=10;
        }else if(media.equals("DVD")) {
            med=70;
        }else if(media.equals("Blu-ray")) {
            med=140;
        }else{
            System.out.println("That is not a valid recording media.");
        }
        size = med * length;
        counter++;
        System.out.println("the size of the media is:  " + size);
//        for (int i = 0; i < recordings.length; i++) {
//            if (media.equals("CD")) {
//                recordings[i] = new CD();
//            } else if (media.equals("DVD")) {
//                recordings[i] = new DVD();
//            } else {
//                recordings[i] = new BluRay();
//            }
//            recordings[i].songLength(length);
//            recordings[i].songName(name);
//        }
    }
}