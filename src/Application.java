
public class Application {
	
	public static void main(String[] args) {
		
		//here's an inefficient way to build string
		String info = "";
		info = "I am Gabrielle.";
		info += " ";
		info += "I am a student.";
		System.out.println(info);
		//why is it inefficient?
		//a String in java never actually changes
		//each addition line is just creating a new String
		
		//so instead we'll use the StringBuilder class
		
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Nicky.");
		sb.append(" ");
		sb.append("I am a laze-about.");
		
		System.out.println(sb.toString());
		//why is that better? StringBuilder plus append
		//actually changes the original String
		//it doesn't really show in this little program (in terms of memory used, etc),
		//but it will in something much bigger.
		
		//you can also line stuff up to connect methods
		//note there are no ; after each line, because it's all one set of instructions
		StringBuilder sb2 = new StringBuilder();
		sb2.append("I am Roger.").append(" ")
		.append("I am a bad actor.");
		
		System.out.println(sb2.toString());
		
		//there's also StringBuffer, which was just StringBulder's predecessor
		
		//now some formatting stuff
		
		System.out.println("Here is some text.\tThat was a tab.\nThat was a new line.");
		System.out.print("Leave out the ln to not insert RETURN at end of the line.");
		System.out.println(" Like this.");
		
		//here's how to insert variables into a string
		System.out.printf("Using printf. Total cost %d. Quantity is %d.\n", 50, 10);
		System.out.printf("More printf. If you insert a number in the funny bit,\n");
		System.out.printf("you will reserve that number of spaces. %5d.\n", 80);
		System.out.printf("Negative adds the spaces onto the back. %-5d.", 80);
		
		//%d is for ints. %s is for strings.
		for (int i=1; i < 21; i++) {
			System.out.printf("Let's count! %2d. And an old string: %s\n", i, sb);
		}
		
		//you can use numbers to limit decimal places, put in widths, etc.
		//eg, %8.2 reserves 8 spaces, and .2 shows two decimal places.
	}

}
