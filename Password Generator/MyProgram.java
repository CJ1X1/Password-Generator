import java.security.SecureRandom;

class MyProgram {
    // This method generates a random password of a specific length.
    public static String generateRandomPassword(int len) {
        // The keyword "final" is used to denote constants, so in this line of code it's
        // telling us how many charaters are vaild
        // in the program after being executed.
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*().?_-<>[]{},~`";

        // This class provides a cryptographically strong random number generator.
        SecureRandom random = new SecureRandom();
        // The "sb" or StringBuilder is class modifiable succession of charaters.
        StringBuilder sb = new StringBuilder();

        // This line of code repeats or loops the integer len (length) of how many times
        // it's executed.
        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        // This a return statement, it's used to return a value when the execution of a
        // block is complete.
        // Return a string representing the data contained by StringBuilder Object.
        // A new String object is created and initialized to get the character sequence
        // from this StringBuilder object and then String is returned by toString().
        return sb.toString();
    }

    public static void main(String[] args) {
        // This is the length of the limited charaters.
        int len = 16;
        // Here it's printing line 5.
        System.out.println(generateRandomPassword(len));
    }
}
