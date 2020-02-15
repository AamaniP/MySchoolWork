/*
 * CS312 Assignment 1.
 * On my honor, Aamani Shree Pillutla, this programming assignment is my own work.
 *
 * A program to print out the lyrics to the
 * children's song, "There was an old woman".
 *
 *  Name: Aamani Pillutla
 *  email address: a.s.pillutla@utexas.edu
 *  UTEID: asp3224
 *  Section 5 digit ID: 50294
 *  Grader name: 
 *  Number of slip days used on this assignment:
 */

public class Song {
    // print out the lyrics of "There was an old woman ... "
    public static void main(String[] args) {
        System.out.println("There was an old woman who swallowed a fly.");
        sheDie();
        spiderDie();
        birdDie();
        catDie();
        dogDie();
        goatDie();
        cowDie();
        dead();
    }

    public static void sheDie() { //These lines repeat in every verse

        System.out.println("I don't know why she swallowed that fly,");
        System.out.println("Perhaps she'll die.");
        System.out.println();
    }
    public static void spiderDie() {

        System.out.println("There was an old woman who swallowed a spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        System.out.println("She swallowed the spider to catch the fly,");
        sheDie();
    }
    public static void birdDie() {

        System.out.println("There was an old woman who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
        System.out.println("She swallowed the bird to catch the spider,");
        System.out.println("She swallowed the spider to catch the fly,");
        sheDie();
    }
    public static void catDie() {

        System.out.println("There was an old woman who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
        System.out.println("She swallowed the cat to catch the bird,");
        System.out.println("She swallowed the bird to catch the spider,");
        System.out.println("She swallowed the spider to catch the fly,");
        sheDie();
    }
    public static void dogDie() {

        System.out.println("There was an old woman who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
        System.out.println("She swallowed the dog to catch the cat,");
        System.out.println("She swallowed the cat to catch the bird,");
        System.out.println("She swallowed the bird to catch the spider,");
        System.out.println("She swallowed the spider to catch the fly,");
        sheDie();
    }
    public static void goatDie() {

        System.out.println("There was an old woman who swallowed a goat,");
        System.out.println("She just opened her throat to swallow a goat.");
        System.out.println("She swallowed the goat to catch the dog,");
        System.out.println("She swallowed the dog to catch the cat,");
        System.out.println("She swallowed the cat to catch the bird,");
        System.out.println("She swallowed the bird to catch the spider,");
        System.out.println("She swallowed the spider to catch the fly,");
        sheDie();
    }
    public static void cowDie() {

        System.out.println("There was an old woman who swallowed a cow,");
        System.out.println("I don't know how she swallowed a cow.");
        System.out.println("She swallowed the cow to catch the goat,");
        System.out.println("She swallowed the goat to catch the dog,");
        System.out.println("She swallowed the dog to catch the cat,");
        System.out.println("She swallowed the cat to catch the bird,");
        System.out.println("She swallowed the bird to catch the spider,");
        System.out.println("She swallowed the spider to catch the fly,");
        sheDie();
    }
    public static void dead() {

        System.out.println("There was an old woman who swallowed a horse,");
        System.out.println("She died of course.");
    }
}
