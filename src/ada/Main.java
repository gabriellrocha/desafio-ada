package ada;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
	
	private final static String CLOVER_THREE = "\u2618";
	private final static String CLOVER_FOUR = "\uD83C\uDF40";
	
	public static void main(String[] args) {
		
		List<String> shamrocks = new ArrayList<>();
		
		for (int i=0; i <=99999; i++) {
			float n = new Random().nextFloat();
			if (n > 0.9999) {
				shamrocks.add(CLOVER_FOUR);
			} else {
				shamrocks.add(CLOVER_THREE);
			}
			
		}
		
		
		int position = shamrocks.indexOf(CLOVER_FOUR);
		
		if (position < 0) {
			System.out.println("Nenhum " + CLOVER_FOUR + " encontrado!!!!");
		} else {
			System.out.println("Que sorte! " + CLOVER_FOUR + " encontrado na posicão " + position);
		}
		
	}
}
