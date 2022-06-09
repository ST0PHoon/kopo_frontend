package junsuk5;

public class Word {
	
	public static void main(String[] args) {
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(4));
	}
	
	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

	// i번째 글자가 모음인가  a i u e o
	public boolean isVowel(int i) {
		String[] collectionList = {"a", "i", "u", "e", "o"};
		int count = 0;
		
		for (String item : collectionList) {
			if (letters.substring(i, i + 1).equals(item)) {
				count++;
			}
		}
		
		if (count > 0) {
			return true;
		} else {
			return false;
		}
	}
}
