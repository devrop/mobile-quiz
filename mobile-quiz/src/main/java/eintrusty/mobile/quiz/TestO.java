package eintrusty.mobile.quiz;

public class TestO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ggg = getRandom(0, 5);
		
	}

	private static Integer getRandom(int start, int max ) {
		System.out.println("Random value in int from "+start+" to "+max+ ":");
	    int randomInt = (int)(Math.random() * (max - start + 1) + start);
	    System.out.println(randomInt);
	    return randomInt;
	}
	
}
