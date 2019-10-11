package View;

import java.util.Scanner;

import Controller.Controller;
import Model.Project;
import Model.Register;
import Model.Task;

public class View {

	public static void main(String[] args) {

		Register register = new Register();
		Project project = new Project();
		Task task = new Task();

		Scanner scan = new Scanner(System.in);

		// why is this so hard???

		Controller controller = new Controller();

		System.out.println("\n\nWelcome to ToDoLy - your friendly neighborhood to do app!");
		System.out.println("\nYou currently have " + controller.numberProjectCompleted() + " completed projects and "
				+ controller.numberProjectNotCompleted() + " uncompleted projects.");

		boolean on = true;

		while (on == true) {
			on = false;

			System.out.println("\nWhat would you like to do?");
			System.out.println("\n(1) View tasks" + "\n(2) Add a task" + "\n(3) Edit a task" + "\n(4) Save and Quit");

			System.out.print("\nPlease enter a number: ");
			String input = scan.nextLine();

			switch (input) {
			case "1":
				System.out.println("\nHere are your tasks:\n");
				controller.printAllTasks(register.getToDoList());
				System.out.print("\nType 'menu' to return to the menu: ");
				input = scan.nextLine();
				if (input.equals("menu")) {
					on = true;
				}
				break;
			case "2":
				boolean addOn = true;
				while (addOn == true) {
					addOn = false;
					String tempName, tempDueDate;
					System.out.print("\nEnter the task name: ");
					tempName = scan.nextLine();
					System.out.print("\nEnter the date the task is due: ");
					tempDueDate = scan.nextLine();
					Task newTask = new Task(tempName, tempDueDate, false);
					register.addTask(newTask);
					System.out.println("\nYour task has been added!");
					System.out.print("\nType 'menu' to return to the menu or 'add' to add another task: ");
					input = scan.nextLine();
					if (input.equals("menu")) {
						on = true;
					} else if (input.equals("add")) {
						addOn = true;
					}
				}

				break;
			case "3":
				String tempTask = null;
				System.out.println("\nHere are your tasks:\n");
				System.out.println("Which task would you like to edit?");
				System.out.print("(Please type the task name): ");
				tempTask = scan.nextLine();
				System.out.println("What would you like to do to the task?");
				System.out.print("(1) Delete\n(2) Edit\n(3) Mark as done\n(menu) Return to menu: ");
				input = scan.nextLine();

				controller.deleteTask(register.getToDoList(), input);
				on = true;
				break;
			case "4":
				// save all to file

				System.out.println("\nThanks for using ToDoLy!");
				break;
			}
		}

	}

	// for making the switch statement beautiful
//	public void case1() {
//		
//	}

}
