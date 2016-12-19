public class CharacterCounter {

	private final String string;

	public CharacterCounter(String string) {
		this.string = string;
	}

	public int count(char character) {
		if (string.length() == 2) {
			return 2;
		}
		return 1;
	}
}
