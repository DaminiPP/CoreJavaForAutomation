package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
		LinkedList<String> lt = new LinkedList<String>();

		// adding elements in the Linkedlist
		lt.add("test");
		lt.add("QTP");
		lt.add("Selenoium");

		System.out.println("Contents of Linked " + lt);

		// add first

		lt.addFirst("Cucumber");
		lt.addLast("TestNG");

		System.out.println("Contents of Linked " + lt);

		// get
		System.out.println(lt.get(0));
		lt.set(0, "Tom");
		System.out.println(lt.get(0));

		System.out.println("Contents of Linked " + lt);

		// remove first and last element

		lt.removeFirst();
		lt.removeLast();
		System.out.println("Contents of Linked " + lt);

		lt.remove(1);
		System.out.println("Contents of Linked " + lt);

		// Printing all values in selenoim

		System.out.println("**********Using for Loop");
		for (int n = 0; n < lt.size(); n++) {
			System.out.println(lt.get(n));
		}

		System.out.println("**********Using  Advanced for Loop");
		for (String str : lt) {
			System.out.println(str);
		}

		System.out.println("**********Using  Iterator");
		Iterator<String> it = lt.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("**********Using  While Loop");
		int num = 0;
		while (lt.size() > num) {
			System.out.println(lt.get(num));
			num++;
		}

	}

}
