public class LTCode001 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int originalNumber = x;
        long reversedNumber = 0;
        while (x != 0) {
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
        }
        return originalNumber == reversedNumber;
}

public static void main(String[] args) {
    LTCode001 solution = new LTCode001();
    
    System.out.println(solution.isPalindrome(121));   
    System.out.println(solution.isPalindrome(-121));  
    System.out.println(solution.isPalindrome(10));   
}
}