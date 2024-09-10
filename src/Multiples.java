class Multiples {

    public static void multiples() {
        int count = 0;
        for (int y = 1; y < 1000; y++); {
            boolean div3 = y % 3 == 0;
            boolean div5 = y % 5 == 0;
            if (div3 || div5) {
                count++;
            }
        }
        System.out.println(count);
    }
}
