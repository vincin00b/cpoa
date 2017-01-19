package model.command;

public class Factory {

	private FactoryCommand factoryCommand;

	public Factory() {
		this.factoryCommand = new FactoryCommand();
	}

	public Command execCommand(String type) throws Exception {
		Command command;
		command = this.factoryCommand.createCommand(type);
		command.execute();
		return command;
	}

}
