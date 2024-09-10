public class REDUCEE {
    public static void main(int n) {
        int steps = 0;
        while (n > 0) {
            boolean even_num = n % 2 == 0;
            boolean odd_num = n % 2 == 1;
            if (even_num) {
                n = n / 2;
            } else if (odd_num) {
                n--;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
