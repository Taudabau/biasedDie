//Jackson Orth
import java.util.Random;
import java.util.Scanner;
public class BiasedDie {
    // instance variables 
    int[] sides;
    Random rand = new Random();
    public BiasedDie(int n) { //Method for the first way to get the sides of the die
        this.sides = new int[n];
        for (int i = 0; i < n; i++) {
            this.sides[i] = i + 1;
        }
    }
    public BiasedDie(int[] array) { //Method to assign numbers to the sides of the die
        this.sides = array.clone();
    }
    public String toString() { //Prints the output of the die and the number of sides 
        String sideValues = "This die has " + this.sides.length + " sides: ";
        int j;
        for (j = 0; j < this.sides.length; j++) {
            sideValues = sideValues + this.sides[j] + " ";
        }
        return sideValues;
        }
    //Method that returns true or false depending on whether they are equal or not
    public boolean equals(BiasedDie other) {
        int p;
        for (p = 0; p < this.sides.length; p++) {
            if (this.sides[p] != other.sides[p]) {
                return false;
            }
        }
        if (this.sides.length != other.sides.length) {
            return false;
        }
        else {
            return true;
        }
    }
    //method that rolls the dice
    public int roll() {
        return this.sides[rand.nextInt(this.sides.length)];
    }
    //method that states whether a die beats another die
    public boolean defeats(BiasedDie other){
        int myRoll = this.roll();
        int otherRoll = other.roll();
        if (myRoll > otherRoll) {
            return true;
        }
        else if (myRoll == otherRoll) {
            return false;
        }
        else {
            return false;
        }
    }
}