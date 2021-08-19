public class Main3 {
    //Code your solution to problem number one here
    static int count_number_of_Vowels() {
        String s= "cool";
        int answer = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                    || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') answer++;
        return answer;
    }
    //Code you problem number two here
    static int count_bob_Strings() {
        String s = "azcbobobegghakl";
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i).startsWith("bob")) {
                answer++;
            }
        }
        return answer;
    }

    //Code your solution to problem number 3 here
    static String the_longest_Substring() {
        String s = "abcbcd",
                theLongest = "";
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i),
                    name = "";
            char theLast = 0;
            for (int a = 0; a < substring.length(); a++) {
                char b = substring.charAt(a);
                if (theLast <=   b) {
                    name = name.concat(Character.toString(b));
                    theLast = b;
                }
                else {
                    break;
                }
            }
            if (name.length() > theLongest.length()) {
                theLongest = name;
            }
        }
        return theLongest;
    }

    public static void main(String[] args) {
        System.out.print("Number of vowels: " + count_number_of_Vowels() + "\n\n");

        System.out.println("Number of times bob occurs is:");
        System.out.println(count_bob_Strings()+"\n");

        System.out.println("Longest substring in alphabetical order is:");
        System.out.println(the_longest_Substring());


    }
}

