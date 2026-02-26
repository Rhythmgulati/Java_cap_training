package DigitalCom;

import java.util.Scanner;

public class DigitalcomProcess {
	public static void main(String[] args) {
		int i = 0;
		boolean isLoggedIn = false;
		Scanner scanner = new Scanner(System.in);
		User user = new User();
		GameService gameService = new GameService();

		if (isLoggedIn) {
			System.out.println("Logged in");
		} else {
			System.out.println("Not logged in");
		}

		while (i != 5) {
			System.out.println("-------------------Menu enter your choice-------------------");
			if (!isLoggedIn) {
				System.out.println("1.Register");
				System.out.println("2.Login");
			} else {
				System.out.println("3.View Games");
				System.out.println("4.SearchByName");
			}
			System.out.println("5.Exit");
			System.out.println("Enter choice");
			i = scanner.nextInt();

			switch (i) {
			case 1:
				if (!isLoggedIn) {
					System.out.println("Enter userId");
					String id = scanner.next();
					System.out.println("Enter password");
					String pass = scanner.next();

					user.addUser(id, pass);
					System.out.println("Registration successful!");
				}
				break;

			case 2:
				if (!isLoggedIn) {
					System.out.println("Enter User ID: ");
					String loginId = scanner.next();
					System.out.print("Enter Password: ");
					String loginPass = scanner.next();

					if (user.IsAuthenticated(loginId, loginPass)) {
						System.out.println("Login Successful! Welcome " + loginId);
						isLoggedIn = true;
					} else {
						System.out.println("Login Failed! Invalid credentials.");
					}
				}
				break;
			case 3:
				if (isLoggedIn) {
					System.out.println("----all games------");
					for (Game game : gameService.viewAll()) {
						System.out.println(game);
					}
				}
				;
				break;
			case 4:
				if (isLoggedIn) {
					System.out.println("Enter author name want to search for");
					String name = scanner.next();
					System.out.println(gameService.authorSearch(name));
				}
				;
				break;
			case 5:
				System.out.println("-------------Exiting--------------");
			default:
				System.out.println("Enter Valid Choice");
				break;
			}

		}
	}
}
