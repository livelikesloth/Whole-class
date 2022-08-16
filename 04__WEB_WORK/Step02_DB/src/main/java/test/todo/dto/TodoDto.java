package test.todo.dto;

public class TodoDto {
	private int num;
	private String name;
	private String date;
	
	public TodoDto() {}

	public TodoDto(int num, String name, String date) {
		super();
		this.num = num;
		this.name = name;
		this.date = date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
