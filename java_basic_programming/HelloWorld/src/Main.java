public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Hello, " + args[i]);
        }
        /*System.out.println(args[0] + args[1]);

        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));*/

        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum of arguments is " + sum);


    }

}
