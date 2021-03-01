public class arian {

    public static void main(String[] args) {
        int i = 5;
        int k =10;


        int j = ++i + k++;


        System.out.println(i);      // 6
        System.out.println(k);      // 11
        System.out.println(j);      // 16
        System.out.println("\n");

        int g = ++i + k++ + ++j;
        System.out.println(i);  // i = 7
        System.out.println(k);  // k = 12
        System.out.println(j);  // j = 17


        System.out.println(g);      // g = 35
    }
}
