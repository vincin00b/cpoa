package model.command;

public class CommandHelp extends Command{
	
	public CommandHelp() {
		this.name = "help";
		this.arguments = null;
	}
	
	@Override
	public void execute() {
		System.out.println("Commands:");
        System.out.println("  show");
        System.out.println("  add project <project name>");
        System.out.println("  add task <project name> <task description>");
        System.out.println("  check <task ID>");
        System.out.println("  uncheck <task ID>");
        System.out.println();
	}

}
