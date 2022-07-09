package operators;

public class Employee {
	
	public static void main(String[] args) {
		
		String s="LENOVO";
		
		char charAt = s.charAt(4);
		System.out.println(charAt);
		int indexOf = s.indexOf('N');
		System.out.println(indexOf);
		String upperCase = s.toUpperCase();
			System.out.println(upperCase);
				String low = s.toLowerCase();
			System.out.println(low);
			boolean startsWith = s.startsWith("l");
			System.out.println(startsWith);
			boolean endsWith = s.endsWith("o");
			System.out.println(endsWith);
			int lastIndexOf = s.lastIndexOf("N");
			System.out.println(lastIndexOf);
			boolean contains = s.contains("s");
			System.out.println(contains);
			
			String a="lenovo";
			
			boolean equals = s.equals(a);
			System.out.println(equals);
			boolean equalsIgnoreCase = s.equalsIgnoreCase(a);
			System.out.println(equalsIgnoreCase);
			boolean k = low.equals(s);
			System.out.println(k);
			boolean equals2 = upperCase.equals(low);
			System.out.println(equals2);
			int length = s.length();
			System.out.println(length);
			String replace = s.replace('L', 'a');
			System.out.println(replace);
			String replaceAll = s.replaceAll("O", "s");
			System.out.println(replaceAll);
			String trim = s.trim();
			System.out.println(trim);
			String substring = s.substring(3);
			System.out.println(substring);
			String substring2 = s.substring(2, 5);
			System.out.println(substring2);
			
		}
	}