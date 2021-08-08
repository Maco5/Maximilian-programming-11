class Project1 {
    //Code your solution to problem number one here
    public static int count_Vowels() {
        String s= "cool";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                    || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }

    //Code you problem number two here
    private static int count_bob_Strings() {
        String s = "azcbobobegghakl";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i).startsWith("bob")) {
                count++;
            }
        }

        return count;
    }

    //Code your solution to problem number 3 here
    public static String longest_Substring() {
        String s = "abcbcd",
                longest = "";
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i),
                    built = "";
            char last = 0;
            for (int j = 0; j < substring.length(); j++) {
                char c = substring.charAt(j);

                if (last <= c) {
                    built = built.concat(Character.toString(c));
                    last = c;
                } else {

                    break;
                }
            }

            if (built.length() > longest.length()) {
                longest = built;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.print("Number of vowels: " + count_Vowels() + "\n\n");

        System.out.println("Number of times bob occurs is:");
        System.out.println(count_bob_Strings()+"\n");

        System.out.println("Longest substring in alphabetical order is:");
        System.out.println(longest_Substring());


        }
    }

