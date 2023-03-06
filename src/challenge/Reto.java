package challenge;

public class Reto {
	public int [] challenge (int number, int element) {
		if (element > 0 && number > 0) {
			int [] multiple = new int [element];
			for (int i = 0; i < element; i++) {
				multiple[i]= number * (i+1);
			}
			return multiple;
		}
		return null;
		
	}
	
	public String toString (int [] arrayResult) {
		String elements = "";
		if (arrayResult.length > 0) {
			for (int i = 0; i < arrayResult.length; i++) {
				elements += arrayResult[i] + ",";
			}
		}
		return elements;
	}

	public static void main(String[] args) {
		Reto object = new Reto();
		
		System.out.println(object.toString(object.challenge(1,2)));
		System.out.println(object.challenge(1,-10));
		System.out.println(object.challenge(4,0));
		System.out.println(object.toString(object.challenge(6,5)));
	}

}
