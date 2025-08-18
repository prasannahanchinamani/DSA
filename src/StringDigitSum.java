public class StringDigitSum {
    static int sumOfDigitsString(String st) {
        int sum = 0;
        char ch[] = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                sum += ch[i] - 48;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String st = "Hello123";
        System.out.println(sumOfDigitsString(st));
    }
}
