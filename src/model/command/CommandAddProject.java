package model.command;

import model.Project;
import model.ProjectList;

public class CommandAddProject extends Command{

	public CommandAddProject(String arg) {
		this.name = "add project";
		this.arguments = new String[1];
		this.arguments[0] = arg;
	}

	@Override
	public void execute() {
		Project project = new Project(this.arguments[0]);
		ProjectList.getInstance().addP(project);
	}
	
}
