public class StringFunctionDemo {
    public static void main(String[] args) {

        String str1 = "Java Programming";
        String str2 = "java Programming";
        String str3 = " Java Programming ";

        System.out.println("Original String: " + str1);

        System.out.println("Length: " + str1.length());

        System.out.println("Character at index 5: " + str1.charAt(5));

        System.out.println("Substring(5): " + str1.substring(5));
        System.out.println("Substring(5,11): " + str1.substring(5, 11));

        System.out.println("Concatenation: " + str1.concat(" Language"));

        System.out.println("CompareTo: " + str1.compareTo(str2));

        System.out.println("CompareTo Ignore Case: " + str1.compareToIgnoreCase(str2));

        System.out.println("Contains 'Java': " + str1.contains("Java"));

        System.out.println("Starts With 'Java': " + str1.startsWith("Java"));

        System.out.println("Ends With 'ming': " + str1.endsWith("ming"));

        System.out.println("Index of 'P': " + str1.indexOf('P'));

        System.out.println("Last Index of 'a': " + str1.lastIndexOf('a'));

        System.out.println("Replace Java with Python: " + str1.replace("Java", "Python"));

        System.out.println("ReplaceAll Vowels: " + str1.replaceAll("[AEIOUaeiou]", "*"));

        System.out.println("Upper Case: " + str1.toUpperCase());

        System.out.println("Lower Case: " + str1.toLowerCase());

        System.out.println("Trim: '" + str3.trim() + "'");

        String str4 = "";
        System.out.println("Is Empty: " + str4.isEmpty());

        String[] words = str1.split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }

        int num = 100;
        String s = String.valueOf(num);
        System.out.println("ValueOf(): " + s);

        char[] ch = str1.toCharArray();
        System.out.println("Character Array:");
        for (char c : ch) {
            System.out.print(c + " ");
        }

        System.out.println();

        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("Join: " + joined);

        System.out.print("Repeat: ");
for (int i = 0; i < 3; i++) {
    System.out.print("Hi ");
}
System.out.println();
    }
}
