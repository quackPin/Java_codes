public class LongestCommonPrefix {
    public static String commonPrefix(String[] s){

        String prefix = s[0];
        for(int index = 1; index<s.length; index++){
            while(s[index].indexOf(prefix) != 0 ){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        System.out.println("Common prefix is: "+commonPrefix(arr));
    }
}
