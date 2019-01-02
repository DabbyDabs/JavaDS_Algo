package hashMaps;

import java.util.HashMap;

public class ExtractUniqueCharacters {

	public static void main(String[] args) {

		String s = "ababacd";
		System.out.println(uniqueChar(s));
	}

	public static String uniqueChar(String str) {
		HashMap<Character, Boolean> map = new HashMap();
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == null) {
				map.put(str.charAt(i), true);
				ans += str.charAt(i);
				continue;
			}
		

		}
return ans;
	}
	
}
