package Model;

public class Task {

	private String name;
	private String dateDue;
	private boolean isCompleted;
	private Project project;

	public Task(String name, String dateDue, boolean isCompleted) {
		this.setName(name);
		this.setDateDue(dateDue);
		this.setIsCompleted(isCompleted);
	}

	public Task() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateDue() {
		return dateDue;
	}

	public void setDateDue(String dateDue) {
		this.dateDue = dateDue;
	}

	public boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
