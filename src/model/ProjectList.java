package model;

import java.util.ArrayList;
import java.util.List;

public class ProjectList {

	// instance de Singleton
	private static ProjectList instance = null;
	private List<Project> lProject;

	// private car singleton
	private ProjectList() {
		lProject = new ArrayList<Project>();
	}

	// getInstance de Singleton
	public final static ProjectList getInstance() {
		if (ProjectList.instance == null) {
			ProjectList.instance = new ProjectList();
		}
		return instance;

	}

	public List<Project> getlProject() {
		return lProject;
	}

	public void setlProject(List<Project> lProject) {
		this.lProject = lProject;
	}

	public void addP(Project project) {
		this.lProject.add(project);
	}

	@Override
	public String toString() {
		int size = this.lProject.size();
		String toString = "";
		for (int i = 0; i < size; i++) {
			toString += "- " + this.lProject.get(i).getpName() + "\n";
			int sizeT = this.lProject.get(i).getaLTask().size();
			for (int j = 0; j < sizeT; j++) {
				toString += "  [";
				if (this.lProject.get(i).getaLTask().get(j).isDone()) {
					toString += "x";
				} else {
					toString += " ";
				}
				toString += "] " + this.lProject.get(i).getaLTask().get(j).getId() + ": "
						+ this.lProject.get(i).getaLTask().get(j).getDescription() + "\n";
			}
		}
		return toString;
	}

}
