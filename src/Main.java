public class Main {
    public static void main(String[] args) {
        System.out.println("shouldWakeUp: " + shouldWakeUp(true, 1));
        System.out.println("shouldWakeUp: " + shouldWakeUp(false, 2));
        System.out.println("shouldWakeUp: " + shouldWakeUp(true, 8));
        System.out.println("shouldWakeUp: " + shouldWakeUp(true, -1));

        System.out.println("Has teen: " + hasTeen(9, 99, 19));
        System.out.println("Has teen: " + hasTeen(23, 15, 42));
        System.out.println("Has teen: " + hasTeen(22, 23, 34));

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
}