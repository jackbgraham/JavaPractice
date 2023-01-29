package mytutorials;



public class isAnagram {
    public isAnagram(String a, String b) {
    }

    public static boolean isAnagram(String a, String b) {
        int a_length = a.length();
        int b_length = b.length();

        if (a_length != b_length) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] char_freq = new int[26];
        //this creates an integer array with one space for every letter of the alphabet

        for(int i = 0; i < a_length; i++){
            char current_char = a.charAt(i);
            int index = current_char-'a';
            char_freq[index]++;
        }

        for(int i = 0; i < b_length; i++){
            char current_char = b.charAt(i);
            int index = current_char-'b';
            char_freq[index]--;
        }

        for(int i = 0; i < 26; i++){
            if(char_freq[i] != 0) return false;
        }

        return true;
    }
}