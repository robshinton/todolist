
public class TodoListItem {
	private String description;
	private int priority;
	private String mark;
	
	public TodoListItem (String description, int priority) {
		this.description = description;
		this.priority = priority;
		
	}
	
	public String getDescription() {
		return description;
	}

	public int getPriority() {
		return priority;
	}

	public boolean isDone() {
		if (this.priority > 0) {
			return false;
		}else {
			return true;
		}
	}

	public void markDone() {
		this.priority = 0;
		
	}

}
