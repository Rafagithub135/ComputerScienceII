public class TDD {
    public static void main(String[] args) {
        convertTempFToC(34);
        System.out.println(convertTempFToC(93.2));
    }

    public static double convertTempFToC(double degF) {
        return (degF - 32) * (5.0 / 9.0);
    }

}
