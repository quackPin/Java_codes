import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "margana";
        boolean anagramStr = true;

        char[] charactersOfFirst = a.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charactersOfSecond = b.replaceAll("\\s", "").toLowerCase().toCharArray();
 
        if (charactersOfFirst.length != charactersOfSecond.length) {
            anagramStr = false;
        }
 
        int[] frequencies = new int[26];
 
        for (int i = 0; i < charactersOfFirst.length; i++) {
            frequencies[charactersOfFirst[i] - 'a']++;
            frequencies[charactersOfSecond[i] - 'a']--;
        }
 
        for (int frequency : frequencies) {
            if (frequency != 0){
                anagramStr = false; 
                break;
            }
        }

        
        if(anagramStr == true){
            // return true;
            System.out.println("Anagram");
        }else{
            // return false;
            System.out.println("Not an Anagram");
        }
    }
}
