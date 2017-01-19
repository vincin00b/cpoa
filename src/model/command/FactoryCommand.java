package model.command;

public class FactoryCommand {

	public Command createCommand(String commandLine) throws Exception {
		Command command = null;
		String[] tabCommandLine = commandLine.split(" ");
		switch (tabCommandLine[0]) {
		case "help":
			command = new CommandHelp();
			break;
		case "show":
			command = new CommandShow();
			break;
		case "add":
			switch (tabCommandLine[1]) {
			case "project":
				command = new CommandAddProject(tabCommandLine[2]);
				break;
			case "task":
				command = new CommandAddTask(tabCommandLine[2], tabCommandLine[3]);
				break;
			}
			break;
		case "check":
			command = new CommandCheck(tabCommandLine[1]);
			break;
		case "uncheck":
			command = new CommandUncheck(tabCommandLine[1]);
			break;
		case "quit":
			System.exit(0);
		default:
			throw new Exception("This doesn't look like anything to me.");
		}
		return command;
	}

}
