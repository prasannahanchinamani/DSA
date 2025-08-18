public class UniqueChacter {
    static  void printUnique(String st){
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(st.indexOf(ch)==st.lastIndexOf(ch))
                System.out.print(ch+"");
        }
    }

    public static void main(String[] args) {
        String st="Programming";
        printUnique(st);
    }
}
