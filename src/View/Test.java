package View;

import java.util.ArrayList;

import Model.Project;
import Model.Register;
import Model.Task;

public class Test {

	public static void main(String[] args) {

		Register register = new Register();

		ArrayList<Task> tasks = new ArrayList<Task>();
		tasks = register.getToDoList();

		Task task1 = new Task("shopping", "today", true);
		Task task2 = new Task("do laundry", "tomorrow", false);

		Project project1 = new Project("household chores");

		register.addTask(task1);
		register.addTask(task2);

		task1.setProject(project1);
		task2.setProject(project1);

		for (Task i : register.getToDoList()) {
			System.out.println(i.getProject().getName());
		}

	}

}
