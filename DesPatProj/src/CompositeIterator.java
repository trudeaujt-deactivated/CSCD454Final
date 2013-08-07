import java.util.Iterator;
import java.util.Stack;


public class CompositeIterator implements Iterator<PartyComponent> {

	Stack<Iterator<PartyComponent>> stack = new Stack();

	public CompositeIterator(Iterator<PartyComponent> iterator){
		stack.push(iterator);
	}

	public PartyComponent next(){
		if(hasNext()){
			Iterator<PartyComponent> iterator = (Iterator<PartyComponent>) stack.peek();
			PartyComponent component = (PartyComponent) iterator.next();

			if(component instanceof Party){
				stack.push(component.createIterator());
			}

			return component;
		} else {
			return null;
		}
	}
	public boolean hasNext(){
		if (stack.empty()){
			return false;
		} else {
			Iterator<PartyComponent> iterator = (Iterator<PartyComponent>) stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else
				return true;
		}
	}

	public void remove(){
		throw new UnsupportedOperationException();
	}

}
