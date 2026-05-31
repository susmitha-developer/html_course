public class StringFunctionsDemo {
    public static void main(String[] args) {
        String s1 = "Java Programming";
        String s2 = "java programming";
        String s3 = "   Learn Java   ";
        String s4 = "apple,banana,grape";

        // 1. length()
        //System.out.println("Length: " + s1.length());

        // 2. charAt()
       // System.out.println("Char at index 2: " + s1.charAt(2));

        // 3. concat()
        //System.out.println("Concat: " + s1.concat(" Language"));
       // if(10==10){

       // }
      //  if("hi"=="hi")
       //     if(a.equals(b))

        // 4. equals()
       // System.out.println("Equals: " + s1.equals(s2));

        // 5. equalsIgnoreCase()
        //System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
       //int A=10;
      // int a=30;
        // 6. compareTo()
        //``System.out.println("Compare To: " + s1.compareTo("Java"));

        // 7. toLowerCase() / toUpperCase()
       // System.out.println("Lowercase: " + s1.toLowerCase());
       // System.out.println("Uppercase: " + s1.toUpperCase());

        // 8. trim()
        //System.out.println("Trim: [" + s3.trim() + "]");

        // 9. substring()
      //  System.out.println("Substring(5): " + s1.substring(5));
       // System.out.println("Substring(5, 11): " + s1.substring(5, 11));

        // 10. contains()
       // System.out.println("Contains 'Java': " + s1.contains("Java"));

        // 11. startsWith() / endsWith()
      //  System.out.println("Starts With 'Java': " + s1.startsWith("Java"));
       // System.out.println("Ends With 'ing': " + s1.endsWith("ingds"));

        // 12. indexOf() / lastIndexOf()
      //  System.out.println("Index of 'a': " + s1.indexOf('a'));
       //System.out.println("Last Index of 'a': " + s1.lastIndexOf('a'));

        // 13. isEmpty()
        //String empty = "";
        //System.out.println("Is Empty: " + empty.isEmpty());

        // 14. replace()
       // System.out.println("Replace 'a' with '@': " + s1.replace('a', '@'));
       // System.out.println("Replace 'Programming' with 'Language': " + s1.replace("Programming", "Language"));

        // 15. split()
        String[] fruits = s4.split(",");


        System.out.println("Split:");
        for (String i : fruits) {
            System.out.println(i);
        }

        // 16. join()
        String joined = String.join("-", "2025", "11", "09");
        System.out.println("Join: " + joined);

        // 17. valueOf()
        int num = 100;
        String value = String.valueOf(num);
        System.out.println("ValueOf: " + value + 50);

        // 18. toCharArray()
        char[] chars = s1.toCharArray();
        System.out.print("ToCharArray: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 19. format()
        String formatted = String.format("My name is %s and I love %s.", "Susmitha", "Java");
        System.out.println("Format: " + formatted);

        // 20. repeat()
        String repeat = "Hi ".repeat(3);
        System.out.println("Repeat: " + repeat);

        // Extra: isBlank() (Java 11+)
        String blank = "   ";
        System.out.println("Is Blank: " + blank.isBlank());
    }
}