public class RemoveDuplicates {
    static String removeduplicate(String st) {
        String rmv = "";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (rmv.indexOf(ch) == -1)
                rmv = rmv + ch;
        }
        return rmv;
    }

    public static void removeDuplicateWithBoolean(String st) {
        char ch[] = st.toCharArray();
        boolean isFound[] = new boolean[256];
        for (int i = 0; i < ch.length; i++) {
            if (!isFound[ch[i]]) {
                System.out.print(ch[i] + " ");
                isFound[ch[i]] = true;
            }

        }
    }

    public static void main(String[] args) {
        String st = "Rama";
        System.out.println(removeduplicate(st));
        removeDuplicateWithBoolean(st);
    }
}
