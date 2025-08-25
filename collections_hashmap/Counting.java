package dsa.collections.collections_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Counting {
    static  void frequenchCharacter(String  word){
        Map<Character,Integer> countCharacter=new HashMap<>();

        for (int i=0;i<word.length();i++){
            if(word.charAt(i)!=' ')
            countCharacter.put(word.charAt(i),countCharacter.getOrDefault(word.charAt(i),0)+1);
        }
        System.out.println(countCharacter);

    }
    static  void frequencyWord(String sentence){
        Map<String,Integer> countWord=new HashMap<>();
        String word[]=sentence.split(" ");
        for (int i=0;i<word.length;i++){
            countWord.put(word[i],countWord.getOrDefault(word[i],0)+1);
        }
        System.out.println(countWord);
    }
    public static void main(String[] args) {
        String text = "hello world hello java";
        frequenchCharacter("hello world");
        frequencyWord(text);
    }
}
