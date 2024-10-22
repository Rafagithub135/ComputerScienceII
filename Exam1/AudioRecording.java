package Exam1;

public abstract class AudioRecording {
    public abstract void getFileSize(double size);
    public abstract void songLength(double length);
    public abstract void songName(String name);
    double size;
    double length;
    String name;
    String mediaType;
}