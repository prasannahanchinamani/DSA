public class ReplaceVowelWith {
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u';
    }

    static String replaceVowelwith(String st) {
        char ch[] = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i]))
                ch[i]='@';
        }
        return  new String(ch);
    }

    public static void main(String[] args) {
        String st="hi Hello Im";
        System.out.println(replaceVowelwith(st));
    }
}

