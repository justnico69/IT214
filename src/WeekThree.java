import java.util.Scanner;

public class WeekThree {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();


        int choice = 0;
        while(choice != 4) {

            System.out.println("1. Student Information");
            System.out.println("2. Check Grade");
            System.out.println("3. Check Scholarship");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Student Information");
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    break;

                case 2:

                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();

                    if (grade >= 90) {
                        System.out.println("Result: Excellent");
                    } else if (grade >= 85) {
                        System.out.println("Result: Very Good");
                    } else if (grade >= 80) {
                        System.out.println("Result: Good");
                    } else if (grade >= 75) {
                        System.out.println("Result: Passed");
                    } else {
                        System.out.println("Result: Failed");
                    }


                    break;

                case 3:
                    System.out.print("Enter grade: ");
                    double scholarshipGrade = scanner.nextDouble();

                    if (scholarshipGrade >= 90) {
                        System.out.println(
                                "Student is eligible for scholarship."
                        );
                    } else {
                        System.out.println(
                                "Student is not eligible for scholarship."
                        );
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();

        }
    }
