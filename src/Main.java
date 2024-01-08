public class Main {
    public static void main(String[] args) {
        System.out.println("shouldWakeUp: " + shouldWakeUp(true, 1));
        System.out.println("shouldWakeUp: " + shouldWakeUp(false, 2));
        System.out.println("shouldWakeUp: " + shouldWakeUp(true, 8));
        System.out.println("shouldWakeUp: " + shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean isDogBarking, int time) {
        return ((time >= 0 && time < 8) || (time >= 20 && time < 24)) && isDogBarking;
    }

        System.out.println("Hello world!");

    }
}