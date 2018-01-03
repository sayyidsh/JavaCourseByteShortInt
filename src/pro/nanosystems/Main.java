package pro.nanosystems;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 122;
        short shortValue = 555_5;
        int intValue = 554_788_8;
        long longValue = (5_000L + 10L) * (byteValue + shortValue + intValue);
        System.out.println("Long Total: "+ longValue);
    }
}
