public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,0};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println(array[array.length-i-1]);
        }
    }
}