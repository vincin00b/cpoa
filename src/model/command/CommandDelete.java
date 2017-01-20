package model.command;

import model.ProjectList;

public class CommandDelete extends Command {

	public CommandDelete(String argument) {
		this.name = "delete";
		this.arguments = new String[1];
		this.arguments[0] = argument;
	}

	@Override
	public void execute() {
		int size = ProjectList.getInstance().getlProject().size();
		for (int i = 0; i < size; i++) {
			int sizeT = ProjectList.getInstance().getlProject().get(i).getaLTask().size();
			for (int j = 0; j < sizeT; j++) {
				if (ProjectList.getInstance().getlProject().get(i).getaLTask().get(j).getId() == Integer
						.parseInt(this.arguments[0])) {
					ProjectList.getInstance().getlProject().get(i).getaLTask().remove(j);
				}
			}
		}
	}

}
