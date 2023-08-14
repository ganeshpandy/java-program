package checked_exception;

public class Project implements Cloneable {
int id;
String name;

	public Project(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
