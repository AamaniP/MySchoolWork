public class Loops {

    /*public static void main (String [] args) {
        for(int i = -100; i <= 100; i++) {

            System.out.println(i + " squared = " + (i * i));
    }

So what is it that happened here? Basically you defined i's limits between -100 and 100, and then idk what i++ means
but you asked it to do i squared increasing from -100 to 100 and asked it to print it. That's what happened.


    }
}
*/
    public static void main (String[] args) {
    /*Pseudocode! So what's the objective? Trying to draw a 'V' of sorts out of asterisks.
        for (line going 1 to 5) basically defining which lines
            write (line - 1) spaces on the output line
            write (11 - 2 * line) asterisks on the output line
            go to a new output line
     */

    for (int line = 1; line <= 5; line++) /* ++ means x = x + 1 basically*/ {

        for (int i = 1; i <= (line - 1); i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= (11 - 2 * line); i++) {

            System.out.print("*");
        }

        System.out.println();

    }




    }
}