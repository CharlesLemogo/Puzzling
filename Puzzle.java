import java.util.Random;

public class Puzzle {
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] randomArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(max - min + 1) + min;
        }

        return randomArray;
    }

    public static char getRandomLetter() {
            char[] alphabet = new char[26];
            for (int i = 0; i < 26; i++) {
                alphabet[i] = (char) ('A' + i);
            }
    
            Random random = new Random();
            int randomIndex = random.nextInt(26);
            char randomLetter = alphabet[randomIndex];
    
            return randomLetter;
        }
    
        public static String generatePassword() {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            Random random = new Random();
            StringBuilder password = new StringBuilder();
    
            for (int i = 0; i < 8; i++) {
                int index = random.nextInt(characters.length());
                password.append(characters.charAt(index));
            }
    
            return password.toString();
        }


        public static String[] getNewPasswordSet(int length) {
            String[] passwordSet = new String[length];
    
            for (int i = 0; i < length; i++) {
                passwordSet[i] = generatePassword();
            }
    
            return passwordSet;
        }



    public static void main(String[] args) {
        int[] randomNumbers = generateRandomArray(10, 1, 20);

        // Print the generated array
        for (int number : randomNumbers) {
            System.out.println(number);
        }

        char randomLetter = getRandomLetter();
        System.out.println("Random letter: " + randomLetter);
        
        String randompassword = generatePassword();
        System.out.println("Password: " + randompassword);

        String[] randompasswordset = getNewPasswordSet(8);
        System.out.println("New Password: " + randompasswordset);

    }   
}


