package practiceJava;

public class RemoveDuplicateVowelFromName {
public static void main(String[] args) {
	        String s = "Barsharani";
	        String uniqueVowels = ""; // To store unique vowels
	        s = s.toLowerCase();
	        //otherwise linkedhashSet
	        // Loop through each character in the string
	        for (int i = 0; i < s.length(); i++) {
	            char currentChar = s.charAt(i);
	            // Check if the character is a vowel and if it's not already in uniqueVowels
	            if ((currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u')
	                && uniqueVowels.indexOf(currentChar) == -1) {
	                uniqueVowels += currentChar;
	            }
	        }

	        System.out.println("Unique vowels: " + uniqueVowels);
	    }
	}

//        Set<Character> vowels = new LinkedHashSet<>();
//
//        // Convert the string to lowercase
//        s = s.toLowerCase();
//
//        // Loop through each character and add vowels to the set
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
//                vowels.add(s.charAt(i));
//            }
//        }
//
//        // Print unique vowels
//        System.out.println("Unique vowels: " + vowels);
//    }
//}
