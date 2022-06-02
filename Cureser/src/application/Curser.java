package application;

public class Curser<T extends Comparable<T>> {

	int head;

	SNode<T>[] cursorrr = new SNode[5];
	
	public int findPriveus (int l , int p) {
		while(!isNull(l) && !isEmpty(l))
			if (cursorrr[l].getData().equals(p)) {
				return l;
			}
		return 0;
	}
	
//	public void delete(int l, int p) {
//		
//		while ()
//	}

	public Curser() {
		intialize();
	}

	public int creatList() {

		int l = malloc();

		if (l == 0) {
			System.out.println("if full ");
		} else {
			return l;
		}
		return 0;
	}

	public void intialize() {

		for (int i = 0; i < cursorrr.length - 1; i++) {
			cursorrr[i] = new SNode<>(null, i + 1);

		}
		cursorrr[cursorrr.length - 1] = new SNode<>(null, 0);
	}

	public int malloc() {
		int p = cursorrr[0].getNext();
		cursorrr[0].setNext(cursorrr[p].getNext());
		return p;
	}

	public void free(int p) {
		cursorrr[p].setNext(cursorrr[0].getNext());
		cursorrr[0].setNext(p);
	}

	public boolean isNull(int l) {
		return cursorrr[l] == null;
	}

	public boolean isEmpty(int l) {
		return cursorrr[l].next == 0;
	}

	public boolean isLast(int p) {
		return cursorrr[p].next == 0;
	}
}
