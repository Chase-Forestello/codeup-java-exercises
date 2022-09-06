// Complete - Java I - Enumerations Exercise

package enumerations;

public class enumerations {
    public enum TrafficLightColor {
        RED, YELLOW, GREEN
    }

    public static void makeDrivingDecision(TrafficLightColor color) {
        switch (color) {
            case RED -> {
                System.out.println("STOP!");
            }
            case YELLOW -> {
                System.out.println("Slow down and stop, unless you can make it ;)");
            }
            case GREEN -> {
                System.out.println("GO!!!!");
            }
        }
    }

    public static void main(String[] args) {
        TrafficLightColor current = TrafficLightColor.RED;
        makeDrivingDecision(current);
    }
}

//Playing in Traffic
//create an enum named TrafficLightColor  that contains a list of the colors
//that are on a stoplight
//create a method named with the following signature
//public static void makeDrivingDecision(TrafficLightColor color)
//inside of the method, print out a message that tells what to do at each color
//light
