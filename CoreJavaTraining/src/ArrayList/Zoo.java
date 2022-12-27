package ArrayList;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Zoo {
	public static void main(String[] args) {
		LinkedList<String> animalsList = new LinkedList<>();
		animalsList.add("Tiger");
		animalsList.add("Lion");
		animalsList.add("Fox");
		animalsList.add("Cat");
		//System.out.println(animalsList);
		animalsList.peek();
		animalsList.peekFirst();
		//System.out.println(animalsList);
		
		animalsList.forEach(animal->{
			System.out.println(animal);
		});
	}
}
