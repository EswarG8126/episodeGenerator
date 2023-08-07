import java.util.*;

public class episodeChooser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the name of the show? ");
		String name = input.nextLine();
		HashMap<Integer, Integer> numOfEpisodes = new HashMap<Integer, Integer>();
		System.out.print("How many seasons in the show? ");
		String seasons = input.nextLine();
		for (int i = 0; i < Integer.parseInt(seasons); i++) {
			System.out.print("How many episodes in season " + (i + 1) + "? ");
			String eps = input.nextLine();
			numOfEpisodes.put(i + 1, Integer.parseInt(eps));
		}
		System.out.println();
		int option = 1;
		while (option != 2) {
			System.out.println();
			System.out.println("1 - Generate episode");
			System.out.println("2 - Exit the program");
			System.out.println();
			System.out.print("Enter one of the options above: ");
			option = input.nextInt();
			if (option == 1) {
				Random random = new Random();
				int max = Integer.parseInt(seasons);
				int min = 1;
				int range = max - min + 1;
				int randomSeason = random.nextInt(Integer.parseInt(seasons)) + 1;
				int randomEpisode = random.nextInt(numOfEpisodes.get(randomSeason)) + 1;
				System.out.println();
				System.out.print(
						"You should watch season " + randomSeason + ", episode " + randomEpisode + " of " + name + ".");
			} else if (option == 2) {
				System.out.println();
				System.out.print("Program terminated.");
				break;
			} else {
				System.out.println();
				System.out.println("Invalid entry.");
			}
			System.out.println();
		}
	}
}