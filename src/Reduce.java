public class Reduce {

    public static void main(String[] args) {

        int i = 100;
        while (i > 0){
            i = get_reduce(i);
        }
    }

    private  static int get_reduce(int i) {

        boolean IsEven = i % 2 == 0;
        boolean IsOdd = i % 2 == 1;

        if (IsEven) {

            i = i / 2;
            System.out.println(i);

        }else if (IsOdd) {

            i = i - 1;
            System.out.println(i);

        }
        return i;
    }
}
