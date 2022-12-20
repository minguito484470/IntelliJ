import java.util.*;

public class BasicCRUDSample {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> names = new ArrayList<String>();

    public static void addName() {
        System.out.println("\nEnter your Name:");
        String addName = sc.nextLine();
        names.add(addName);
        System.out.println("Name added successfully! ");
    }

    public static void removeName() {
        System.out.println("\nWhat name you want to remove in the list?");
        for(String names : names) {
            System.out.println(names);
        }
        System.out.println("Enter the name here: ");
        String removeName = sc.nextLine();
        names.remove(removeName);
        System.out.println("Name " + removeName + " removed successfully! ");
    }

    public static void clearNames() {
        names.clear();
        System.out.println("Names cleared successfully!");
    }

    public static void showNames(){
        if(names.isEmpty()){
            System.out.println("No records found!");
        } else{
            System.out.println("\nCurrent List of Names");
            for(String names : names) {
                System.out.println(names);
            }
        }
    }

    public static void mainMenu(){
        System.out.println("****************** MENU ******************");
        System.out.println("""
                [A] Insert Name
                [B] Remove Name
                [C] Display Names
                [D] Clear Names
                [E] Exit""");
        System.out.println("Enter your choice:");
        String choice = sc.nextLine();

        switch (choice.toUpperCase()) {
            case "A" -> {
                addName();
                System.out.println("\n");
            }
            case "B" -> {
                removeName();
                System.out.println("\n");
                ;
            }
            case "C" -> {
                showNames();
                System.out.println("\n");
            }
            case "D" -> {
                clearNames();
                System.out.println("\n");
            }
            case "E" -> {
                System.out.println("Thank you for using the system!");
                System.exit(0);
            }
            default -> {
                System.out.println("Invalid Input");
                System.out.println("\n");
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            mainMenu();
        }


    }
}
