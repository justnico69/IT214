public class IfElse {
    static void main (String[] args){

        int score = 50;

        int passingScore = 38;
        int perfectScore = 50;

        if(score == perfectScore){
            System.out.println("Excellent Job for Getting Perfect!");
        } else if (score >= passingScore) {
            System.out.println("Congrats for passing the quiz");
        } else{
            System.out.println("You have tried your best. You failed");
        }



    }
}
