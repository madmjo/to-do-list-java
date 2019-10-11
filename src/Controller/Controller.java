package Controller;

import java.util.ArrayList;

import Model.Project;
import Model.Register;
import Model.Task;

public class Controller {

	private Register register = new Register();
	private Task task;
	private Project project;

	public Controller() {

	}

	// how to add project to the task?

	public void printAllTasks(ArrayList<Task> taskList) {
		for (Task i : taskList) {
			System.out.println(i.getName() + " is due " + i.getDateDue() + " and is completed: " + i.getIsCompleted());
		}
	}

	public String findTask(ArrayList<Task> taskList, String name) {
		String tempName = null;
		for (Task i : taskList) {
			if (i.getName().equals(name)) {
				tempName = i.getName();
			}
		}
		return tempName;
	}

	public void deleteTask(ArrayList<Task> taskList, String name) {
		for (Task i : taskList) {
			if (i.getName().equals(name)) {
				taskList.remove(i);
			}
		}
	}

	// should use filter here instead (streams are the future / present)
	// also should probably find a way to do this in one function
	public int numberProjectCompleted() {
		int number = 0;
		for (Task i : register.getToDoList()) {
			if (i.getIsCompleted() == true) {
				number++;
			}
		}
		return number;
	}

	public int numberProjectNotCompleted() {
		int number = 0;
		for (Task i : register.getToDoList()) {
			if (i.getIsCompleted() == false) {
				number++;
			}
		}
		return number;
	}

}
