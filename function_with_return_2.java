public class function_with_return_2 {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(add(4, 2));
    }

    public static int add(int a, int b) {
        int c = a + b;
        System.out.println(subtract(2, 1));
        return c;

    }

    public static int subtract(int a, int b) {
        int d = a - b;
        return d;

    }

}
