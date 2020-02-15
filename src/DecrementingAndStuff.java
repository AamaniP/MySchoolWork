public class DecrementingAndStuff {
    public static void main(String[] args) {

        int totalQuestions;
        int numRight;
        double percent;

        totalQuestions = 73;
        numRight = 59;

        /*percent = numRight / totalQuestions* 100; < the issue with this was that percent is a 'double' value so you
        could turn everything into double, but if you make the 100 a 100.0, which is a double value, and put it at the
        beginning which converts everything into a double value, you're fine
         */

        //System.out.println(percent);

        percent = 100.0 * numRight / totalQuestions;
        System.out.println("Score " + percent);
        //Oop the student got an 81









    }

}
