public class palindromik {
    public static void main(String[] args) {
        System.out.println(isPalindromic("lmao", "oaml"));
        System.out.println(isPalindromic("Tavuk", "Araba"));  
        System.out.println(isPalindromic("GET", "TEG")); 
    }
    public static boolean isPalindromic(String str1, String str2) {
        String reverse = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse += str1.charAt(i);
        }
        return (reverse.equals(str2))? true:false;
    }
}
