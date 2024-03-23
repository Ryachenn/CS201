import java.util.*;

public class MainH {
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
        //Create a HashMap to sort state-capital pairs
        Map<String, String> stateCapitalMap = new HashMap<>();
        for (String[] pair : stateCapitals) {
            stateCapitalMap.put(pair[0], pair[1]);
        }

        //Display the content of the HashMap
        System.out.println("Content of the Hashmap:");
        System.out.println("===========");
        displayMap(stateCapitalMap);

        //Use a TreeMapt to sort the map by keys (states)
        Map<String, String> sortedStateCapitalMap = new TreeMap<>(stateCapitalMap);

        //Display the content of the sorted TreeMap
        System.out.println("\nContent of the Sorted TreeMap:");
        System.out.println("===========");
        displayMap(sortedStateCapitalMap);

        //Prompt the user to enter a state and display the capital
        getUserInput(sortedStateCapitalMap);
    }

    private static void displayMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void getUserInput(Map<String, String> stateCapitalMap)
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a state to get its capital: (type 'quit' to exit) (Case Sensitive = Texas)");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }

            if (stateCapitalMap.containsKey(userInput)) {
                System.out.println("The capital of " + userInput + " is " + stateCapitalMap.get(userInput)); 
            } else {
                System.out.println("State not found.");
            }
        }
    }
}