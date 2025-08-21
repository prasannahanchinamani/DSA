import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/*
First Unique Character in a Stream
○ Problem: Given a stream of characters, find the first non-repeating character at
every step using queue
 */
public class FirstUniqueCharacter {
    public void firstUniqueCharacter(String st){
        Map<Character,Integer> freq=new HashMap<>();
        Queue<Character> queue=new LinkedList<>();
        StringBuilder str=new StringBuilder();
        for(char ch:st.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            queue.add(ch);
            while (!queue.isEmpty() && freq.get(queue.peek())>1){
                queue.poll();
            }
             if(!queue.isEmpty()){
                str.append(queue.peek());
            }
             else {
                 str.append(" ");
             }
        }
        System.out.println(str.toString());
    }



    public static void main(String[] args) {
        FirstUniqueCharacter FirstUniqueCharacter=new FirstUniqueCharacter();
        FirstUniqueCharacter.firstUniqueCharacter("abacbd");
    }
}
