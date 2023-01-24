package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    protected Ball(int num, String col) {
        number = num;
        color = col;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "number='" + getNumber() + '\''
                +
                ", color='" + getColor() + '\''
                +
                '}';
    }
}
