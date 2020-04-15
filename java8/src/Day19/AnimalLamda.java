package Day19;
import java.util.*;

import Day14.Animal;




public class AnimalLamda {
public static void main(String[] args) {
	Animal animal11 =new Animal("Dog",4);
	Animal animal12 =new Animal("pig",2);
	Animal animal13 =new Animal("Snake",8);
	
	List<Animal> animallist =new ArrayList<>();
	animallist.add(animal11);
	animallist.add(animal12);
	animallist.add(animal13);
	
	System.out.println("입력순 :"+animallist);
	//오름 차순 정렬
	Collections.sort(animallist,(a,b) -> a.age-b.age);
}
}
