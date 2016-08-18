public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public class SomeClass {
		public void masterbranch() {
			system.out.println("i coudnt repair your brakes, so i made your horn louder");
		}
		public void thought() {
			system.out.println("i coudnt repair your brakes, so i made your horn louder");
		}
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}
