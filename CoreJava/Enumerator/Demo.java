enum Color {
    Red, Green, Blue;
}

public class Demo {
    public static void main(String[] args) {
        Color color = Color.Blue;
        System.out.println(color);
        System.out.println(color.ordinal());

        Color[] colors = Color.values();
        for (Color c : colors)
            System.out.println(c + " : " + c.ordinal());

        if (color == Color.Red)
            System.out.println("Color is red");
        else if (color == Color.Green)
            System.out.println("Color is green");
        else if (color == Color.Blue)
            System.out.println("Color is blue");
        else
            System.out.println("Color is not red, green or blue");

        switch (color) {
            case Red:
                System.out.println("Color is red");
                break;
            case Green:
                System.out.println("Color is green");
                break;
            case Blue:
                System.out.println("Color is blue");
                break;
            default:
                System.out.println("Color is not red, green or blue");
                break;
        }
    }
}
