package model;
import java.util.ArrayList;

public class Project {

	private static int pCount = 0;

	private int id;
	private String pName;
	private ArrayList<Task> aLTask;

	public Project(String name) {
		this.id = Project.pCount;
		this.pName = name;
		this.aLTask = new ArrayList<Task>();
		Project.pCount++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public ArrayList<Task> getaLTask() {
		return aLTask;
	}

	public void setaLTask(ArrayList<Task> aLTask) {
		this.aLTask = aLTask;
	}

}
