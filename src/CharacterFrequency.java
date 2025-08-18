public class CharacterFrequency {
    static void frequencyCount(String st) {
        char ch[] = st.toCharArray();
        boolean visted[] = new boolean[ch.length];
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if (visted[i])
                continue;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    visted[i] = true;
                }
            }
            System.out.println(ch[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        String st="abca";
        frequencyCount(st);
    }
}
