//import java.util.*;
//import java.io.*;
//
//class Main {
//
//    public static String StringChallenge(String sen) {
//        // Split into words, ignoring non-alphanumeric characters
//        String[] words = sen.split("[^a-zA-Z0-9]+");
//        List<String> wordList = new ArrayList<>();
//        for (String word : words) {
//            if (!word.isEmpty()) {
//                wordList.add(word);
//            }
//        }
//
//        // Find the longest word
//        String longestWord = "";
//        for (String word : wordList) {
//            if (word.length() > longestWord.length()) {
//                longestWord = word;
//            }
//        }
//
//        // __define-ocg__: Define the set of characters from ChallengeToken
//        String token = "2409oyhu1c";
//        Set<Character> varOcg = new HashSet<>();
//        for (char c : token.toLowerCase().toCharArray()) {
//            varOcg.add(c);
//        }
//
//        // Filter characters present in the token
//        StringBuilder filtered = new StringBuilder();
//        for (char c : longestWord.toCharArray()) {
//            if (!varOcg.contains(Character.toLowerCase(c))) {
//                filtered.append(c);
//            }
//        }
//
//        // Use variable varFiltersCg as specified
//        String varFiltersCg = filtered.toString();
//        return varFiltersCg.isEmpty() ? "EMPTY" : varFiltersCg;
//    }
//
//    public static void main (String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print(StringChallenge(s.nextLine()));
//    }
//
//}

import java.util.*;
import java.io.*;

class Main {

    public static String StringChallenge(String str) {
        if (str == null || str.isEmpty()) {
            return "EMPTY";
        }

        // Encode the string using Run-length encoding
        StringBuilder encoded = new StringBuilder();
        char current = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == current) {
                count++;
            } else {
                encoded.append(count).append(current);
                current = str.charAt(i);
                count = 1;
            }
        }
        encoded.append(count).append(current);

        // __define-ocg__: Define the set of characters from ChallengeToken
        String token = "2409oyhu1c";
        Set<Character> varOcg = new HashSet<>();
        for (char c : token.toCharArray()) {
            varOcg.add(Character.toLowerCase(c));
        }

        // Filter characters present in the token set
        StringBuilder filtered = new StringBuilder();
        for (char c : encoded.toString().toCharArray()) {
            if (!varOcg.contains(Character.toLowerCase(c))) {
                filtered.append(c);
            }
        }

        // Assign to varFiltersCg as specified
        String varFiltersCg = filtered.toString();
        return varFiltersCg.isEmpty() ? "EMPTY" : varFiltersCg;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}
