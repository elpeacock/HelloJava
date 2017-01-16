import java.text.DecimalFormat;

/**
 * Created by user on 1/16/17.
 */
public class Circle {
    private double radius;
    private static int howManyCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
        howManyCircles ++;
    }


    // 2 * pi * r
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // pi * r squared
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static int getHowManyCircles() {
        return howManyCircles;
    }

    // formatter
    private String formatNumber(double number) {
        DecimalFormat formatter = new DecimalFormat("#.###");
        return formatter.format(number);
    }

    public String getFormatttedCircumference() {
        return formatNumber(getCircumference());
    }

    public String getFormattedArea() {
        return formatNumber(getArea());
    }
}
