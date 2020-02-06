public class ReplaceMethod {
    public static void main(String args[]) {
        String S1 = "the quick fox jumped";
        System.out.println(S1);
        System.out.println("String after replacing 'fox' with 'dog': " + S1.replace("fox", "dog"));
        System.out.println("String after replacing all 't' with 'a': " + S1.replace('t', 'a'));

    }
}
