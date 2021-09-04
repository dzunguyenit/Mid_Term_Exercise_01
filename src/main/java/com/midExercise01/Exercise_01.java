package com.midExercise01;

public class Exercise_01 {
	public static int getUpperCaseCharacters(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		return count;

	}

	public static String capitalize(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	public static String capitalizeFirstCharacterHasDot(String s) {
		if (s.startsWith(" "))
			return s.trim().substring(0, 1).toUpperCase() + s.substring(2).toLowerCase();

		return s.trim().substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}

	public static void upperCaseFirstCharacters(String s) {
		String characters[] = s.split("\\s+");
		for (String item : characters) {
			System.out.print(capitalize(item) + " ");
		}
	}

	public static void upperCaseFirstCharacterHasDot(String s) {
		String characters[] = s.split("\\.");
		for (int i = 0; i < characters.length; i++) {
			if (i == characters.length - 1) {
				System.out.print(capitalizeFirstCharacterHasDot(characters[i]));
			} else
				System.out.print(capitalizeFirstCharacterHasDot(characters[i]) + ". ");
		}
	}

	public static void main(String[] args) {
		String text = "You Only Live Once. But if You do it right. once is Enough";

		// Đếm số từ viết in hoa trong chuỗi (VD: chuỗi trên có 7 ký tự in hoa)
		System.out.printf("Text has %d uppercase characters\n", getUpperCaseCharacters(text));

		// Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó (VD: You Only Live
		// Once. But If You Do It Right. Once Is Enough)
		upperCaseFirstCharacters(text); // Will output: My message
		System.out.println();
		// Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là
		// viết in hoa,
		// các chữ con lại viết thường (VD: You only live once. But if you do it right.
		// Once is enough)
		upperCaseFirstCharacterHasDot(text);

	}
}
