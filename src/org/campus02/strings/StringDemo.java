package org.campus02.strings;

public class StringDemo {

	public static void main(String[] args) {

		String text = "Java ist cool und Übungsblatt bald zu Ende!";
		String result = "";
		
		// ihr code
/*		text.length();
		char c= text.charAt(1); // liefert "a" von "Java..."
		Character.toUpperCase(c); // liefert aus "a" ein "A"
		
		if (c == ' ')
		{
			
		}
*/		
		for (int i = 0; i < text.length(); i++)
		{
			char c = text.charAt(i);
			// ihre if-abfrage
			if (i == 0 || text.charAt(i - 1) == ' ')
			{
				c = Character.toUpperCase(c);
			}
			
			result = result + c;
			System.out.println(result);
		}
		
		System.out.println("Ausgangstext: " + text);
		System.out.println("Ergebnis: " + result);
	}

}
