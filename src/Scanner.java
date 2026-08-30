public class Scanner {
    static void main (String[] args){

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("What is your name? ");
        String userName = scanner.nextLine(); //String input
        System.out.println("How old are you?");
        int userAge = scanner.nextInt(); //Integer input
        System.out.println("Sex(M/F)");
        char userSex = scanner.next().charAt(0); //Char Input
        System.out.println("Your weight: ");
        double userWeight = scanner.nextDouble(); //Double input
        System.out.println("Are you enrolled?");
        boolean isEnrolled = scanner.nextBoolean(); //Boolean input
        System.out.println("What section?");
        String classSection = scanner.next();  //One Line Input w/no spaces

        System.out.println("My name is " + userName);
        System.out.println("I am " + userAge + " years old");
        System.out.println("My sex is " +userSex);
        System.out.println("I weigh " + userWeight +" kg");
        System.out.println("Enrollment Status: "+ isEnrolled);
        System.out.println("My class section " + classSection);

    }
}
