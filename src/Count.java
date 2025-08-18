public class Count {
  static   boolean isCapital(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            return true;
        return false;
    }

     static boolean isSmall(char ch) {
        if (ch >= 'a' && ch <= 'z')
            return true;
        return false;
    }

   static boolean isDigit(char ch) {
        if (ch >= '0' && ch <= '9')
            return true;
        return false;
    }

    static void countCapitalSmallDigits(String st) {
        int capitalCount=0,smallCount=0,digitCount=0;
        char ch[]=st.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(isCapital(ch[i]))
                capitalCount++;
            if(isSmall(ch[i]))
                smallCount++;
            if(isDigit(ch[i]))
                digitCount++;
        }
        System.out.println("Capital letter :"+capitalCount);
        System.out.println("Small letter :"+smallCount);
        System.out.println("digits:"+digitCount);
    }

    public static void main(String[] args) {
        String st="Hello Mister 420";
        countCapitalSmallDigits(st);
    }
}
