package Exam1;

public class CD extends AudioRecording {
    public static void main(String[] args) {

    }
    @Override
    public String toString() {
        return "CD{name, length, size}";
    }

    @Override
    public void getFileSize(double length) {
        size =length*10;
    }

    @Override
    public void songLength(double length) {

    }

    @Override
    public void songName(String name) {

    }

    public CD(double length, String name) {
        mediaType = "CD";
        this.length = length;
        this.name = name;
        getFileSize(length);
    }

}
