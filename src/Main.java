import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("shouldWakeUp: " + shouldWakeUp(true, 1));
        System.out.println("shouldWakeUp: " + shouldWakeUp(false, 2));
        System.out.println("shouldWakeUp: " + shouldWakeUp(true, 8));
        System.out.println("shouldWakeUp: " + shouldWakeUp(true, -1));

        System.out.println("Has teen: " + hasTeen(9, 99, 19));
        System.out.println("Has teen: " + hasTeen(23, 15, 42));
        System.out.println("Has teen: " + hasTeen(22, 23, 34));

        System.out.println("Is cat playing: " + isCatPlaying(true, 10));
        System.out.println("Is cat playing: " + isCatPlaying(false, 36));
        System.out.println("Is cat playing: " + isCatPlaying(false, 35));

        System.out.println("Area of rectangle: " + areaRectangle(5.0, 4.0));
        System.out.println("Area of rectangle: " + areaRectangle(-1.0, 4.0));

        System.out.println("Area of circle: " + areaCircle(5.0));
        System.out.println("Area of circle: " + areaCircle(-1.0));
    }

    public static boolean shouldWakeUp(boolean isDogBarking, int time) {
        return ((time >= 0 && time < 8) || (time >= 20 && time < 24)) && isDogBarking;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {

        int[] ages = { age1, age2, age3 };
        for (int age : ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;

    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (isSummer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

    public static double areaRectangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }
        return a * b;
    }

    public static double areaCircle(double radius) {
        if (radius <= 0) {
            return -1;
        }
        return Math.PI * radius * radius;
    }
}