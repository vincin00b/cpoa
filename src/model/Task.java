package model;

public final class Task {

	public static int tCount = 0;

	private int id;
	private String description;
	private boolean done;

	public Task(long id, String description, boolean done) {
		this.id = tCount + 1;
		this.description = description;
		this.done = done;
		Task.tCount++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
