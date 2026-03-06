package seedu.GitSwole.parser;

import seedu.GitSwole.command.ByeCommand;
import seedu.GitSwole.command.Command;
import seedu.GitSwole.command.DeleteCommand;
import seedu.GitSwole.command.HelpCommand;
import seedu.GitSwole.exceptions.GitSwoleException;
import seedu.GitSwole.ui.Ui;

import java.util.ArrayList;

public class Parser {
	private static final String[] commandStrings = {
		"delete", "bye", "help"
	};
	enum CommandType {
		DELETE, BYE, HELP
	}

	private static Ui ui;

	/**
	 * Constructs a Parser and initializes the user interface.
	 */
	public Parser() {
		ui = new Ui();
	}

	/**
	 * Reads the full user input and translates it into the corresponding Command object.
	 *
	 * @param response The full command string entered by the user.
	 * @return The Command corresponding to the user's input.
	 * @throws GitSwoleException If the command has incorrect formatting or incomplete arguments.
	 */
	public static Command readResponse(String response) throws GitSwoleException {
		String[] words = response.split(" ");
		String command = words[0];
		CommandType cmdType = parseCommand(command);
		int idx;

		switch (cmdType) {
		case DELETE:
			if (words.length < 2) {
				throw new GitSwoleException(GitSwoleException.ErrorType.INCOMPLETE_COMMAND, "delete");
			}
			return new DeleteCommand(response);
		case HELP:
			return new HelpCommand();
		case BYE:
			return new ByeCommand();
		default:
			throw new GitSwoleException(GitSwoleException.ErrorType.UNKNOWN_COMMAND, command);
		}
	}

	/**
	 * Parses the initial command word from the user input to determine the command type.
	 * @param input The raw input string from the user.
	 * @return The CommandType corresponding to the input.
	 * @throws GitSwoleException If the command is empty or unrecognized.
	 */
	private static CommandType parseCommand(String input) throws GitSwoleException {
		if (input == null || input.isBlank()) {
			throw new GitSwoleException(GitSwoleException.ErrorType.INCOMPLETE_COMMAND, "command");
		}

		String[] words = input.trim().split(" ");
		String cmd = words[0].toLowerCase();
		int count = 0;
		for (String commandString : commandStrings) {
			if (commandString.equals(cmd)) {
				return CommandType.values()[count];
			}
			count++;
		}
		throw new GitSwoleException(GitSwoleException.ErrorType.UNKNOWN_COMMAND, cmd);
	}
}
