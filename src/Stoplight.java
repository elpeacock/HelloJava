/**
 * Created by user on 1/5/17.
 */
public class Stoplight {
    public enum TrafficLightColor {
        RED, YELLOW, GREEN
    }

    public static void makeDrivingDecisions(TrafficLightColor color) {
        switch (color) {
            case RED:
                System.out.println("Hit the brakes and stop!");
                break;
            case YELLOW:
                System.out.println("Speed up to get through the light faster!");
                System.out.println("or slow down, I guess... ");
                break;
            case GREEN:
                System.out.println("Green means GO! Vroom, Vroom!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Stoplight directions");
        System.out.println("When the light is Green:");
        TrafficLightColor green = TrafficLightColor.GREEN;
        makeDrivingDecisions(green);
        System.out.println("When the light is Yellow:");
        TrafficLightColor yellow = TrafficLightColor.YELLOW;
        makeDrivingDecisions(yellow);
        System.out.println("When the light is Red:");
        TrafficLightColor red = TrafficLightColor.RED;
        makeDrivingDecisions(red);
    }
}
