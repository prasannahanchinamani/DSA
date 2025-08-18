public class ConvertCase {
    //toLoweCase
    //toUpperCase
    //a=97
    //A=65
    static String toLowerCase(String st){
        char ch[]=st.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A'&& ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }
        }
        return new String(ch);
    }
    static String toUpperCase(String st){
        char ch[]=st.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a'&& ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
//        System.out.println((int)'A');
        String st="HELLO Mister";
        System.out.println(toLowerCase(st));
        System.out.println(toUpperCase(st));
    }

}
