public class IsPalindrome {

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }
    public static int isPalindrome(String A) {

        String B = A.replaceAll("/[^A-Za-z0-9]/", "");
        System.out.println(B);
        String reverse = new StringBuilder(A).reverse().toString();
        System.out.println(reverse);
        if(reverse.equalsIgnoreCase(A)) {
            return 1;
        }

        return 0;
    }

}
