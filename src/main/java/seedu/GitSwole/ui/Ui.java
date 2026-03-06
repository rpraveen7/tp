package seedu.GitSwole.ui;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Handles all user interface interactions, including reading inputs and displaying outputs.
 */
public class Ui {
	private static Scanner in;

	/**
	 * Constructs a Ui object and initializes the scanner for reading standard input.
	 */
	public Ui(){
		in = new Scanner(System.in);
	}

	/**
	 * Reads a command entered by the user.
	 *
	 * @return The full command string input by the user.
	 */
	public static String readCommand(){
		String response = in.nextLine();
		return response;
	}

	/**
	 * Displays a greeting message to the user when the application starts.
	 *
	 * @param chatbotName The name of the chatbot to display in the greeting.
	 */
	public static void helloGreeting(String chatbotName) {
		String logo =
				"   _____ _ _  _____               _      \n"
						+ "  / ____(_) |/ ____|             | |     \n"
						+ " | |  __ _| | (___  __      _____| | ___ \n"
						+ " | | |_ | | |\\___ \\ \\ \\ /\\ / / _ \\ |/ _ \\\n"
						+ " | |__| | | |____) | \\ V  V / (_) | |  __/\n"
						+ "  \\_____|_|_|_____/   \\_/\\_/ \\___/|_|\\___|\n";

		System.out.println("Hello from\n" + logo);
		System.out.println("Welcome to GitSwole! LET'S GET THEM GAINS");
	}

	/**
	 * Displays a horizontal separator line for visual clarity.
	 */
	public static void showLine() {
		System.out.println("____________________________________________________________");
	}

	/**
	 * Displays a goodbye message when the application terminates.
	 */
	public static void byeGreeting() {
		showLine();
		System.out.println("Bye! Keep getting swole!");
		showLine();
	}

	/**
	 * Prints all the tasks currently stored in the task list.
	 *
	 * @param tasks The list of tasks to print.
	 */
	// TODO
}
