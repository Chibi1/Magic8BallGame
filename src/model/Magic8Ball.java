package model;

public class Magic8Ball {

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
}
