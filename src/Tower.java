/*
 *  CS312 Assignment 2.
 *  On my honor, Aamani Pillutla, this programming assignment is my own work.
 *
 *  A program to print out the UT Tower in ASCII art form.
 *
 *  Name: Aamani Pillutla
 *  email address: a.s.pillutla@utexas.edu
 *  UTEID: asp3224
 *  Section 5 digit ID: 50294
 *  Grader name: Santiago Moreno
 *  Number of slip days used on this assignment: 0
 */

public class Tower {

    public static final int SIZE = 7; //Changeable size constant given in the assignment

    public static void main(String[] args) {
        hashtag();
        topPart();
        mainBody(SIZE * SIZE);
        towerSteps();
        towerFoundation();
    }

    public static void spaces(int spacesNumber) {//Method for the spaces/indentations before each line of the top part of the tower
        for (int singleSpace = 0; singleSpace < spacesNumber; singleSpace++) { //Loop for the spaces before loops in multiple below methods
            String spaceString = " ";
            System.out.print(spaceString);
        }
    }

    public static void hashtag() {//Method for the hashtags/sharps/pound symbols that border the top segment of the tower
        spaces(4 * SIZE + 2); //Previous method called for the spaces before the line of hashtags
        for (int hash = 1; hash <= SIZE + (SIZE - 1); hash++) { //Loop for the hashtags
            System.out.print("#");
        }
        System.out.println();
    }

    public static void topPart() { //Method for the top segment of the tower[ask how to make the indentation]
        for (int top = 1; top <= SIZE + 1; top++) { //Loop for the number of rows of the top segment
            spaces(4 * SIZE + 2); //Previous method called for the spaces before each line of the top segment of the tower
            for (int topRow = 1; topRow <= SIZE + (SIZE - 1); topRow++) { //loop for the lines in each row
                System.out.print("|");
            }
            System.out.println();
        }
        hashtag(); //Previous method called for the hashtags/sharps/pound symbols that border the top segment of the tower
    }

    public static void squigLine() { //Method for the squiggles that line each section of the body of the tower
        spaces(4 * SIZE);
        for (int squiggle = 1; squiggle <= SIZE + SIZE + 3; squiggle++) {
            System.out.print("~");
        }
        System.out.println();
    }

    public static void mainBody(int bar) { //Method for the main body/long part of the tower
        squigLine();
        for (int body = 1; body <= bar; body++) { //Loop for the spaces and bars each section of the body
            spaces(4 * SIZE); //Previous method called for the spaces before the
            System.out.print("|");
            for (int circle = 1; circle <= SIZE; circle++) { //Loop for the "-O"s that make up the middle part of each section of the body
                System.out.print("-O");
            }
            System.out.print("-");
            System.out.print("|");
            System.out.println();
            squigLine(); //Previous method called for the squiggles that border each section of the body
        }
    }

    public static void towerSteps() { //Method for the steps of the tower, the ones made up of quotation marks
        int stepRows = 2 + (SIZE - 2) / 2;
        for (int floorRows = 1; floorRows <= stepRows; floorRows++) { //Loop for number of rows

            int quoteCount = (((SIZE * 5) + 1) + (3 * floorRows - stepRows) - (2 * stepRows) - 1); //Defined for readability and workability in below loops
            int spaceCount = (SIZE * 5) - quoteCount - 1;

            for (int singleSpace = 0; singleSpace <= spaceCount; singleSpace++) { //Loop for the number of spaces before each row
                System.out.print(" ");
            }
            System.out.print("/");
            for (int stepQuotes = 1; stepQuotes <= quoteCount; stepQuotes++) { //Loop for the quotation marks in each row
                System.out.print("\"'");
            }
            System.out.print("\"");
            System.out.print("\\");
            System.out.println();
        }
    }

        public static void towerFoundation () { //Method for the foundation or base of the tower, the most bottom part
            for (int bottomRow = 1; bottomRow <= SIZE; bottomRow++) { //Loop for number of rows
                System.out.print("/");
                for (int bottomCircle = 1; bottomCircle <= SIZE * 5; bottomCircle++) { //Loop for "-O"s in each row
                    System.out.print("\"O");
                }
                System.out.print("\"");
                System.out.print("\\");
                System.out.println();
            }
            System.out.println();
        }
    }



