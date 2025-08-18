public class VowelConsonantsCount {
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u';
    }

    static void vowelConsonantCount(String st) {
        int vowelCount = 0, consonantCount = 0;
        char ch[] = st.toLowerCase().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i]))
                vowelCount++;
            if (!isVowel(ch[i]))
                consonantCount++;
        }
        System.out.println("Vowel Count: "+vowelCount);
        System.out.println("Consonent Count: "+consonantCount);
    }

    public static void main(String[] args) {
        String st="Hello Mister 22";
        vowelConsonantCount(st);
    }
}
