// Custom Exception using gender example
class CheckGender extends Exception { // Exception class
    // Exception class constructor
    CheckGender() {                  
        super("Give valid gender ....!!");
    }
}

class Main {
    // Exception Method inside Main Class
    public static void checkValid(String gender) throws CheckGender {
        if (gender.equals("male")) { // Use .equals() for string comparison
            System.out.println("Gender male is matched...!");
        } 
        else if (gender.equals("female")) {
            System.out.println("Gender female is matched...!");
        } 
        else {
            throw new CheckGender(); // Throw custom exception
        }
    }

    public static void main(String[] args) { // Corrected method signature
        // Create try and catch block
        try {
            checkValid("different"); // Calling the method with an invalid gender
        } 
        catch (CheckGender e) { // Catch block should have correct exception class
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}












