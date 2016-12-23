package Chapter3;
import java.util.*;
public class animalShelter {
	Queue<Integer> cats=(Queue<Integer>) new ArrayList<Integer>();
	Queue<Integer> dogs=(Queue<Integer>) new ArrayList<Integer>();
	public int dequeueDog(){return dogs.remove();}
	
	public int dequeueCat(){return cats.remove();}
	
	public int dequeueAny()
	{
		Random rand=new Random();
		int index=rand.nextInt(2);
		if(index==0){return dequeueDog();}
		else{return dequeueCat();}
	}
	
	public void enqueue(int index)
	{
		if(index==0){dogs.add(0);}
		else{cats.add(1);}
	}
}
