public class Main {

    public static void main(String[] args) {

        String str = "ice-cream";
        char needle = 'e';

        for (int i = 0; i < str.length(); i++) {
            if (needle == str.charAt(i))
                System.out.println(i);
        }

        /*String[] strings = {"first", "second", "third"};
        System.out.println(strings);

        for (String string: strings) {
            System.out.println(string);
        }*/

        System.out.println("-------------------------------------------------");
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }
    }

}
