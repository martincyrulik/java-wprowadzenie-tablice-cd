class App {
	public static void main(String args[]) {
		
		// ------------------------------- ZADANIE 1 -------------------------------
		
		System.out.println("--------ZADANIE 1 ---------");
		System.out.println();
		char[] name = new char[5];
		name[0] = 'K';
		name[1] = 'a';
		name[2] = 'r';
		name[3] = 'o';
		name[4] = 'l';
		
		char[] surname = new char[11];
		surname[0] = 'M';
		surname[1] = 'i';
		surname[2] = 'c';
		surname[3] = 'h';
		surname[4] = 'n';
		surname[5] = 'i';
		surname[6] = 'e';
		surname[7] = 'w';
		surname[8] = 'i';
		surname[9] = 'c';
		surname[10] = 'z';
		
		int age = 22;
		
		System.out.println("--------------------");
		System.out.print("Imię: ");
		System.out.println(name[0]+ ""+name[1]+ ""+name[2]+ ""+name[3]+ ""+name[4]);
		System.out.print("Nazwisko: ");
		System.out.print(surname[0]);
		System.out.print(surname[1]);
		System.out.print(surname[2]);
		System.out.print(surname[3]);
		System.out.print(surname[4]);
		System.out.print(surname[5]);
		System.out.print(surname[6]);
		System.out.print(surname[7]);
		System.out.print(surname[8]);
		System.out.print(surname[9]);
		System.out.println(surname[10] + "[" + surname.length + "]");
		System.out.println("Wiek: " + age);
		
		
		System.out.println("--------------------");
		System.out.println();
		
		// ------------------------------- ZADANIE 1 -------------------------------
		System.out.println("--------ZADANIE 2 ---------");
		System.out.println();
		System.out.println("---------");
		
		byte[] ks01 = new byte[5];
		ks01[0] = 7;
		ks01[1] = 2;
		ks01[2] = 6;
		ks01[3] = 0;
		ks01[4] = 0;
		
		System.out.print(ks01[0]);
		System.out.print(ks01[1]);
		System.out.print(ks01[2]);
		System.out.print(ks01[3]);
		System.out.print(ks01[4]);
		System.out.println();
		
		byte[] ks02 = new byte[5];
		ks02[0] = 7;
		ks02[1] = 2;
		ks02[2] = 6;
		ks02[3] = 0;
		ks02[4] = 2;
		
		System.out.println(ks02[0]+""+ks02[1]+""+ks02[2]+""+ks02[3]+""+ks02[4]);
		
		byte[] ks03 = new byte[5];
		ks03[0] = 7;
		ks03[1] = 2;
		ks03[2] = 6;
		ks03[3] = 0;
		ks03[4] = 3;
		
		System.out.println(ks03[0]+""+ks03[1]+""+ks03[2]+""+ks03[3]+""+ks03[4]);
		
		byte[] ks04 = new byte[5];
		ks04[0] = 7;
		ks04[1] = 2;
		ks04[2] = 6;
		ks04[3] = 0;
		ks04[4] = 5;
		
		System.out.println(ks04[0]+""+ks04[1]+""+ks04[2]+""+ks04[3]+""+ks04[4]);
		System.out.println("---------");
		
	}
}