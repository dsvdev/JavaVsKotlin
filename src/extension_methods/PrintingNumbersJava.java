package extension_methods;

public class PrintingNumbersJava {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ") " + arr[i]);
        }
    }
}
