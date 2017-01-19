package model.command;

import model.ProjectList;

public class CommandUncheck extends Command {

	public CommandUncheck(String argument) {
		this.name = "check";
		this.arguments = new String[1];
		this.arguments[0] = argument;
	}

	@Override
	public void execute() {
		int size = ProjectList.getInstance().getlProject().size();
		String toString = "";
		for (int i = 0; i < size; i++) {
			int sizeT = ProjectList.getInstance().getlProject().get(i).getaLTask().size();
			for (int j = 0; j < sizeT; j++) {
				if (Integer.parseInt(this.arguments[0]) == ProjectList.getInstance().getlProject().get(i).getaLTask()
						.get(j).getId()) {
					ProjectList.getInstance().getlProject().get(i).getaLTask().get(j).setDone(false);
				}
			}
		}

	}

}
