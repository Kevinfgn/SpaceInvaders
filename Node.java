public class Node {
	private Node next;
	private Node previous;
	private int health;
	private boolean boss;
	private int pos_x;
	private int pos_y;
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public boolean isBoss() {
		return boss;
	}
	public void setBoss(boolean boss) {
		this.boss = boss;
	}
	public int getPos_x() {
		return pos_x;
	}
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}
	public int getPos_y() {
		return pos_y;
	}
	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	
}




