package Monopoly;

public class BoardSquare {
    private String name;
    private String type;
    private int price;
    private int rent;
    private String color;

    public BoardSquare(String name, String type, int price, int rent, String color) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rent = rent;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
        return rent;
    }

    public String getColor() {
        return color;
    }
}
