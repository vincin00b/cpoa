package controller;

import java.util.Scanner;

import model.ProjectList;
import model.command.Factory;

public class Application {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		ProjectList pList = ProjectList.getInstance();
		while (true) {
			System.out.print("> ");
			String command = sc.nextLine();
			Factory factory = new Factory();
			try {
				factory.execCommand(command);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
