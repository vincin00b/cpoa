package model.command;

public abstract class Command {
	
	protected String name;
	protected String arguments[];
	
	public abstract void execute();

}
