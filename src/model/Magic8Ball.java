package model;

import java.util.Scanner;

public class Magic8Ball {

    private boolean isPlaying;

    private Scanner scanner = new Scanner(System.in);

    public Magic8Ball() {
        this.isPlaying = true;
    }

    public void playGame() {
        System.out.println("Hello, I am a magic 8 ball.\n");
        do {
            System.out.println("Please ask me a yes or no question and i will tell you your destiny.");
            scanner.nextLine();
            System.out.println(generateResponse());
            playAgain();
        } while (isPlaying);
    }

    private String generateResponse() {
        String response = "";
        switch(generateResponseIndex()) {
            case 1:
                response = "It is certain";
                break;
            case 2:
                response = "It is decidedly so";
                break;
            case 3:
                response = "Most likely signs point to yes";
                break;
            case 4:
                response = "Reply hazy, tyr again";
                break;
            case 5:
                response = "Ask again later";
                break;
            case 6:
                response = "Don't count on it";
                break;
            case 7:
                response = "My sources say no";
                break;
            case 8:
                response = "I'll get back to you on that one";
                break;
        }
        return response;
    }

    private int generateResponseIndex() {
        int number = (int)(Math.random()*8) + 1;
        return number;
    }

    private void playAgain() {
        String response;
        do {
            System.out.print("Do you have another question (y/n)? ");
            response = scanner.nextLine().toLowerCase();
            if (response.equals("y")) {
                isPlaying = true;
            } else if (response.equals("n")) {
                isPlaying = false;
            }
        } while (!(response.equals("y") || response.equals("n")));
    }
}
