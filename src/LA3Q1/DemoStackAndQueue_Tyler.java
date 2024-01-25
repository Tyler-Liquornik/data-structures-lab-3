package LA3Q1;

// Imports
import java.util.Objects;
import java.util.Scanner;

public class DemoStackAndQueue_Tyler
{
    // Scanner for user input
    public static Scanner input = new Scanner(System.in);

    // Header Method
    public static void myHeader(int exerciseNum)
    {
        System.out.println("=======================================================");
        System.out.printf("Lab Exercise: %d%n", exerciseNum);
        System.out.println("Prepared by: Tyler Liquornik");
        System.out.println("Student Number: 251271244");
        System.out.printf("Goal of this exercise: %s%n", "Implementing Stacks and Queues");
        System.out.println("=======================================================");
    }

    // Footer Method
    public static void myFooter(int exerciseNum)
    {
        System.out.println("=======================================================");
        System.out.printf("Completion of Lab Exercise %d is successful!%n", exerciseNum);
        System.out.println("Signing off - Tyler");
        System.out.println("=======================================================");
    }

    // Demo the custom array as a stack
    public static void stackDemo(TylerArray arr)
    {
        // Assume we want to continue looping
        boolean continueLoop = true;

        // Info for user
        System.out.printf("\nYou have an empty stack: %s", arr.toString());

        // Loop for invalid inputs
        do {
            // Give the menu of options
            System.out.println("\n\nStack Operation Menu: \na: Push\nb: Pop\nc: Exit");
            System.out.print("Enter your choice: ");
            String option = input.nextLine();

            // Push option
            if (Objects.equals(option, "a"))
            {
                // Info for user
                System.out.println("Let's push a data-item into the stack");

                // Get the info the user wants to push as a pair
                // ***Will not validate input types in try-catch as it is not asked of
                System.out.print("Enter year: ");
                int year = input.nextInt();
                input.nextLine();
                System.out.print("Enter name: ");
                String name = input.nextLine();

                // Create the pair and push it
                Pair<Integer, String> p = new Pair<>(year, name);
                arr.addAtLastIndex(p);

                // Show the user the updated array
                System.out.printf("The current stack: %s", arr);
            }

            // Pop option
            else if (Objects.equals(option, "b"))
            {
                // Info for user
                System.out.println("Let's pop a data-item");

                // Pop and display results if there was an item to pop
                Pair<Integer, String> popped = arr.removeFromLastIndex();
                if (popped != null)
                    System.out.printf("%s is popped!%nThe current stack: %s",
                            popped, arr);
                else
                    System.out.print("FYI: the stack is empty!");
            }

            // Exit option
            else if (Objects.equals(option, "c"))
            {
                System.out.println("Ending stack demo! Goodbye!");
                continueLoop = false;
            }

            // If no valid option is chosen, tell the user and continue looping
            else
            {
                System.out.println("Invalid Input!");
            }
        }
        while (continueLoop);
    }

    // Demo the custom array as a queue
    public static void queueDemo(TylerArray arr)
    {
        // Assume we want to continue looping
        boolean continueLoop = true;

        // Info for user
        System.out.printf("\nYou have an empty queue: %s", arr.toString());

        // Loop for invalid inputs
        do {
            // Give the menu of options
            System.out.println("\n\nQueue Operation Menu: \na: Enqueue\nb: Dequeue\nc: Exit");
            System.out.print("Enter your choice: ");
            String option = input.nextLine();

            // Enqueue option
            if (Objects.equals(option, "a"))
            {
                // Info for user
                System.out.println("Let's enqueue a data-item into the queue");

                // Get the info the user wants to push as a pair
                // ***Will not validate input types in try-catch as it is not asked of
                System.out.print("Enter year: ");
                int year = input.nextInt();
                input.nextLine();
                System.out.print("Enter name: ");
                String name = input.nextLine();

                // Create the pair and enqueue it
                Pair<Integer, String> p = new Pair<>(year, name);
                arr.addAtLastIndex(p);

                // Show the user the updated array
                System.out.printf("The current stack: %s", arr);
            }

            // Dequeue option
            else if (Objects.equals(option, "b"))
            {
                // Info for user
                System.out.println("Let's dequeue a data-item");

                // Pop and display results if there was an item to pop
                Pair<Integer, String> dequeued = arr.removeFromFirstIndex();
                if (dequeued != null)
                    System.out.printf("%s is dequeued!%nThe current queue: %s",
                            dequeued, arr);
                else
                    System.out.print("FYI: the queue is empty!");
            }

            // Exit option
            else if (Objects.equals(option, "c"))
            {
                System.out.println("Ending queue demo! Goodbye!");
                continueLoop = false;
            }

            // If no valid option is chosen, tell the user and continue looping
            else
            {
                System.out.println("Invalid Input");
            }
        }
        while (continueLoop);
    }


    public static void main(String[] args)
    {
        // Print the header
        myHeader(3);

        // Assume we want to continue looping
        boolean continueLoop = true;

        // Main menu loop (loop for invalid inputs)
        do
        {
            // Give the menu of options
            System.out.println("\nMain Menu: \n\t1: Stack\n\t2: Queue\n\t3: Exit");
            System.out.print("Enter your choice: ");
            String option = input.nextLine();

            // Stack demo
            if (Objects.equals(option, "1"))
            {
                // Initialize empty array
                TylerArray arr = new TylerArray();

                // Execute the stack demo
                stackDemo(arr);
            }

            // Queue demo
            else if (Objects.equals(option, "2"))
            {
                // Initialize empty array
                TylerArray arr = new TylerArray();

                // Execute the queue demo
                queueDemo(arr);
            }

            // Exit option
            else if (Objects.equals(option, "3"))
            {
                System.out.println("Goodbye!");
                continueLoop = false;
            }

            // If no valid option is chosen, tell the user and continue looping
            else
            {
                System.out.println("Invalid Input!");
            }
        }
        while (continueLoop);

        // Print the footer
        myFooter(3);
    }
}
