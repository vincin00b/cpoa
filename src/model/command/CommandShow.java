package model.command;

import model.ProjectList;

public class CommandShow extends Command {

	public CommandShow() {
		this.name = "show";
		this.arguments = null;
	}

	@Override
	public void execute() {
		System.out.println(ProjectList.getInstance().toString());
	}

}
