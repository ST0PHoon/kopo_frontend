package junsuk5;

public class Word {

	public static void main(String[] args) {
		Word word = new Word("Hello World");
		System.out.println(word.isConsonant(4));
	}

	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

	// i번째 글자가 모음인가 a i u e o
	public boolean isVowel(int i) {
		return "aiueo".contains(letters.substring(i, i + 1));
	}

	// i번째가 자음인가
	public boolean isConsonant(int i) {
		return !"aiueo".contains(letters.substring(i, i + 1));
	}
}
