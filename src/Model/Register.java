package Model;

import java.util.ArrayList;

public class Register {

	public ArrayList<Task> toDoList;

	public Register() {
		toDoList = new ArrayList<Task>();
	}

	public ArrayList<Task> getToDoList() {
		return toDoList;
	}

	public void setToDoList(ArrayList<Task> toDoList) {
		this.toDoList = toDoList;
	}

	public void addTask(Task task) {
		this.toDoList.add(task);
	}

}
