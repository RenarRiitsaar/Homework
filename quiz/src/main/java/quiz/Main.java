package quiz;


import java.util.Scanner;

public class Main {


    private static int wrongAnswerCount = 0;
    private static int rightAnswerCount = 0;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("QUIZ");

        cheetah();
        thickestFur();
        bitForce();
        polarBearSkinColor();
        highBrainCount();

        System.out.println("Right answers: " + rightAnswerCount);
        System.out.println("Wrong answers: " + wrongAnswerCount);
    }
        public static void cheetah() {
        boolean flag = true;
        while (flag) {
            System.out.println("What is the maximum speed of cheetah?");
            System.out.println("a) 90 km/h");
            System.out.println("b) 100 km/h");
            System.out.println("c) 120 km.h");

            System.out.println("Your answer:");
            char answer = sc.nextLine().toLowerCase().charAt(0);

            if (answer == 'a' || answer == 'b' || answer == 'c') {
                if (answer == 'c') {
                    System.out.println("Correct answer! \nCheetah can reach max speed of 120km/h.");
                    rightAnswerCount++;
                } else if (answer == 'b') {
                    System.out.println("Wrong answer! Correct was c) 120km/h");
                    wrongAnswerCount++;

                } else if (answer == 'a') {
                    System.out.println("Wrong answer! Correct was c) 120km/h");
                    wrongAnswerCount++;
                }
                flag = false;

            } else {
                System.out.println("Answer can only be a, b or c ! \nTry again! \n");

            }
        }
    }
        public static void thickestFur(){

        boolean flag = true;
            while (flag) {
                System.out.println("\nWhich animal has the thickest fur of any mammal?");
                System.out.println("a) Bear");
                System.out.println("b) Sea otter");
                System.out.println("c) Lion");

                System.out.println("Your answer:");
                char answer = sc.nextLine().toLowerCase().charAt(0);

                if (answer == 'a' || answer == 'b' || answer == 'c') {
                    if (answer == 'b') {
                        System.out.println("Correct answer! \nSea otter has the thickest fur.");
                        rightAnswerCount++;
                    } else if (answer == 'a') {
                        System.out.println("Wrong answer! Correct was b) Sea otter.");
                        wrongAnswerCount++;

                    } else if (answer == 'c') {
                        System.out.println("Wrong answer! Correct was b) Sea otter.");
                        wrongAnswerCount++;
                    }
                    flag = false;

                } else {
                    System.out.println("Answer can only be a, b or c ! \nTry again! \n");

                }
            }
        }

        public static void bitForce(){
            boolean flag = true;
            while (flag) {
                System.out.println("\nWhich land animal has the highest bite force?");
                System.out.println("a) Tiger");
                System.out.println("b) Rat");
                System.out.println("c) Hippopotamus");

                System.out.println("Your answer:");
                char answer = sc.nextLine().toLowerCase().charAt(0);

                if (answer == 'a' || answer == 'b' || answer == 'c') {
                    if (answer == 'c') {
                        System.out.println("Correct answer! \nHippopotamus has the highest bite force");
                        rightAnswerCount++;
                    } else if (answer == 'a') {
                        System.out.println("Wrong answer! Correct was c)Hippopotamus.");
                        wrongAnswerCount++;

                    } else if (answer == 'b') {
                        System.out.println("Wrong answer! Correct was c)Hippopotamus.");
                        wrongAnswerCount++;
                    }
                    flag = false;

                } else {
                    System.out.println("Answer can only be a, b or c ! \nTry again! \n");
                }
            }
        }
        public static void polarBearSkinColor(){
            boolean flag = true;
            while (flag) {
                System.out.println("\nWhat color is the polar bear's skin?");
                System.out.println("a) Black");
                System.out.println("b) Pink");
                System.out.println("c) Yellow");

                System.out.println("Your answer:");
                char answer = sc.nextLine().toLowerCase().charAt(0);

                if (answer == 'a' || answer == 'b' || answer == 'c') {
                    if (answer == 'a') {
                        System.out.println("Correct answer! \nPolar bear's skin is black.");
                        rightAnswerCount++;
                    } else if (answer == 'b') {
                        System.out.println("Wrong answer! Correct was a) Black");
                        wrongAnswerCount++;

                    } else if (answer == 'c') {
                        System.out.println("Wrong answer! Correct was a) Black");
                        wrongAnswerCount++;
                    }
                    flag = false;

                } else {
                    System.out.println("Answer can only be a, b or c ! \nTry again! \n");
                }
            }
        }
        public static void highBrainCount(){

            boolean flag = true;
            while (flag) {
                System.out.println("\nWhich animal is known for having 32 brains?");
                System.out.println("a) Cockroach");
                System.out.println("b) Leech");
                System.out.println("c) Flea");

                System.out.println("Your answer:");
                char answer = sc.nextLine().toLowerCase().charAt(0);

                if (answer == 'a' || answer == 'b' || answer == 'c') {
                    if (answer == 'b') {
                        System.out.println("Correct answer! \nSome species of leeches have 32 brains.");
                        rightAnswerCount++;
                    } else if (answer == 'a') {
                        System.out.println("Wrong answer! Correct was b) Leech");
                        wrongAnswerCount++;

                    } else if (answer == 'c') {
                        System.out.println("Wrong answer! Correct was b) Leech");
                        wrongAnswerCount++;
                    }
                    flag = false;

                } else {
                    System.out.println("Answer can only be a, b or c ! \nTry again! \n");
                }
            }
        }
}

