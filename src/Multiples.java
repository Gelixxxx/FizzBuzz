public class Multiples {
    public static void main(String[] args) {

        int i = 1;
        while (i < 1000) {

            i = get_multiple(i);
        }
    }

    private static int get_multiple(int i){
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 || divisibleBy5) {
            System.out.println(i);
        }
        i++;
        return i;
    }
}
