package model.command;

import model.ProjectList;
import model.Task;

public class CommandAddTask extends Command {
	
	public CommandAddTask(String project, String description) {
		this.name = "add task";
		this.arguments = new String[2];
		this.arguments[0] = project;
		this.arguments[1] = description;
	}

	@Override
	public void execute() {
		Task task = new Task(Task.tCount, this.arguments[1], false);
		boolean isFound = false;
		int i = 0;
		while(!isFound) {
			if(this.arguments[0].equals(ProjectList.getInstance().getlProject().get(i).getpName())) {
				isFound = true;
				ProjectList.getInstance().getlProject().get(i).getaLTask().add(task);
			}
			i++;
		}
		
	}

}
