package fixBugs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static ArrayList<Integer> EXPENSES = new ArrayList<Integer>(Arrays.asList(1000,2300,45000,100,200));

    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }

        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options) {
                    case 1 -> {
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(Main.EXPENSES + "\n");
                        optionsSelection();
                    }
                    case 2 -> {
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        Main.EXPENSES.add(value);
                        System.out.println("Your value is updated\n");
                        //expenses.addAll(arrlist);
                        System.out.println(Main.EXPENSES + "\n");
                        optionsSelection();
                    }
                    case 3 -> {
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if (con_choice == options) {
                            Main.EXPENSES.clear();
                            System.out.println(Main.EXPENSES + "\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                    }
                    case 4 -> {
                        sortExpenses(Main.EXPENSES);
                        optionsSelection();
                    }
                    case 5 -> {
                        searchExpenses(Main.EXPENSES);
                        optionsSelection();
                    }
                    case 6 -> closeApp();
                    default -> System.out.println("You have made an invalid choice!");
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {

        System.out.println("Enter the expense you need to search:\t");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        input.nextLine();
        if(arrayList.contains(num))
            System.out.println(num+" is found");
        else
            System.out.println("ad");
            }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        System.out.println(arrayList);

       //Complete the method. The expenses should be sorted in ascending order.
    }
}