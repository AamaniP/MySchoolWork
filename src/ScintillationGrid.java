import java.awt.Graphics;
import java.awt.Color;
import java.io.IOException;


/**
 * CS312 Assignment 3.
 *
 * Replace <NAME> with your name, stating on your honor you completed this
 * assignment on your own and that you didn't share your code with other
 * students.
 *
 * On my honor, Aamani Pillutla, this programming assignment is my own work and I have
 * not shared my solution with any other student in the class.
 *
 * A program to print out various scintillation grids and a student designed drawing.
 *
 *  email address: a.s.pillutla@utexas.edu
 *  UTEID: asp3224
 *  Number of slip days I am using on this assignment: 0
 */

public class ScintillationGrid {
    // Main method that creates the DrawingPanel with scintillation grids.
    // Restricted to chapters 1 - 3 of Building Java Programs
    public static void main(String[] args) {
        /* In the final version of the program DO NOT call method drawingOne
    	   from main or anywhere else in the program */
        final int WIDTH = 950;
        final int HEIGHT = 650;
        DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
        blackSquares(dp, 0, 0, 75, 3, 16);
        blackSquares(dp, 400, 50, 50, 6, 12);
        blackSquares(dp, 50, 400, 100, 1, 20);
        blackSquares(dp, 500, 500, 15, 7, 4);
        // do not alter this line of codes
        saveDrawingPanel(dp, "grid.png");
    }

    //for the big black boxes containing each grid
    public static void blackSquares(DrawingPanel dp, int x, int y, int smallSquare, int numLines, int lineThick) {
        Graphics g = dp.getGraphics();
        int boxSize = smallSquare * (numLines + 1) + lineThick * numLines;
        dp.setBackground(Color.CYAN);
        g.setColor(Color.BLACK);
        g.fillRect(x, y, boxSize, boxSize);
        grayLines(dp, x, y, smallSquare, numLines, lineThick);
        circleGrid(dp, x, y, smallSquare, numLines, lineThick);
    }

    //for the grid of gray lines
    public static void grayLines(DrawingPanel dp, int x, int y, int smallSquare, int numLines, int lineThick) {
        Graphics g = dp.getGraphics();
        int posX= x + smallSquare;
        int posY = y + smallSquare;
        int boxSize = smallSquare * (numLines + 1) + lineThick * numLines;
        g.setColor(Color.GRAY);
        for (int lines = 1; lines <= numLines; lines++) {
            g.fillRect(posX, y, lineThick, boxSize);
            g.fillRect(x, posY, boxSize, lineThick);
            posX += lineThick + smallSquare;
            posY += lineThick + smallSquare;
        }
    }

    //for all the circles on the grid, a grid of circles if you will
    public static void circleGrid(DrawingPanel dp, int x, int y, int smallSquare, int numLines, int lineThick) {
        Graphics g = dp.getGraphics();
        int circleSize = (int) Math.max(lineThick + 2, 1.4 * lineThick);
        int diffLine = (int) (circleSize - lineThick) / 2;
        int posX = x + smallSquare;
        int posY = y + smallSquare;
        int posCircleX = (int) posX - diffLine;
        int posCircleY = (int) posY - diffLine;

        g.setColor(Color.WHITE);
        //loops for the lines and rows of circles
        for (int circleLines = 1; circleLines <= numLines; circleLines++) {
            for (int circleBox = 1; circleBox <= numLines; circleBox++) {
                g.fillOval(posCircleX, posCircleY, circleSize, circleSize);
                posCircleX += lineThick + smallSquare;
            }
            posCircleX = posX - diffLine;
            posCircleY += lineThick + smallSquare;
        }
    }

    // method for the student designed drawing
    // NOT restricted to chapters 1 - 3 of Building Java Programs
    // DO NOT ADD ANY PARAMETERS TO THIS METHOD!!!
    //for one rectangle, one oval, and one line in three different colors
    public static void drawingOne() {
        // DO NOT ADD ANY PARAMETERS TO THIS METHOD!!!

        // CS312 Students, you may increase the size of the drawing panel if
        // doing a non standard drawing.

        // CS312 Students, add your code, including method calls here
        final int WIDTH = 400;
        final int HEIGHT = 200;
        DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
        Graphics g = dp.getGraphics();

        g.setColor(Color.MAGENTA);
        g.fillRect(97, 20, 80, 80);
        g.setColor(Color.green);
        g.fillOval(117,50, 40, 20);
        g.setColor(Color.BLUE);
        g.drawLine(97, 60, 177, 60);

        // Do not alter this line of code. It saves the panel to a file for later viewing
        saveDrawingPanel(dp, "drawing_one.png");
    }
    // Save the current drawing panel to the given file.
    // CS312 Students. Do not alter this method.
    public static void saveDrawingPanel(DrawingPanel dp, String fileName) {
        try {
            dp.save(fileName);
        } catch (IOException e) {
            System.out.println("Unable to save DrawingPanel");
        }
    }
}
