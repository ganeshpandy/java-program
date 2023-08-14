package unchecked_exception;

public class LogicArrayStroreException {
	int id;
	String name;
	public LogicArrayStroreException(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "LogicArrayStroreException [id=" + id + ", name=" + name + "]";
	}
	
}
