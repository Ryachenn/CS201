import java.util.*;

public class Main {
    public static void main(String[] args) {
        //2D array of states and their capitals
        String[][] stateCapitals = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Indiana", "Indianapolis"},
            {"Iowa", "Des Moines"},
            {"Kansas", "Topeka"},
            {"Kentucky", "Frankfort"},
            {"Louisiana", "Baton Rouge"},
            {"Maine", "Augusta"},
            {"Maryland", "Annapolis"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Minnesota", "St. Paul"},
            {"Mississippi", "Jackson"},
            {"Missouri", "Jefferson City"},
            {"Montana", "Helena"},
            {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"},
            {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"},
            {"New Mexico", "Santa Fe"},
            {"New York",  "Albany"},
            {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"},
            {"Ohio", "Columbus"},
            {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"},
        };
        //Prompts user for their answers
        int correctCount = userAnswers(stateCapitals);

        //Displays the original array
        System.out.println("Original Array: ");
        System.out.println("==========");
        displayArray(stateCapitals);

        //Bubble sort the array based on the capital names
        bubbleSortCapital(stateCapitals);

        //Displays the sorted array
        System.out.println("\nArray sorted by capital:");
        System.out.println("==========");
        displayArray(stateCapitals);

        //Displays how many the user got correct
        System.out.println("\nYou got " + correctCount + "out of " + stateCapitals.length + " correct!");
    }
    
    private static int userAnswers(String[][] stateCapitals) {
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        for (String[] pair: stateCapitals) {
        System.out.print("Enter the capital of " + pair[0] + ": ");
        String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(pair[1])) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        return correctCount;
    }

    private static void displayArray(String[][] stateCapitals) {
        for (int row = 0; row < stateCapitals.length; row++) {
            System.out.println(stateCapitals[row][0] + ": " + stateCapitals[row][1]);
        }
    }

    private static void bubbleSortCapital(String[][] stateCapitals) {
        for (int i = 0; i < stateCapitals.length - 1; i++) {
            for (int j = 0; j < stateCapitals.length - i - 1; j++) {
                if (stateCapitals[j][1].compareTo(stateCapitals[j + 1][1]) > 0) {
                    String[] temp = stateCapitals[j];
                    stateCapitals[j] = stateCapitals[j + 1];
                    stateCapitals[j +1] = temp;
                }
            }
        }
    }    
}