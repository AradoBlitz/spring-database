package exmpl.spring.data;


public class Greeting {

	private int id;
	
	private String greeting;

		
	public Greeting() {
		super();
	}

	public Greeting(int id, String greeting) {
		super();
		this.id = id;
		this.greeting = greeting;
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGreeting(String greeting){
		this.greeting = greeting;
		
	}
	
	public String getGreeting() {
		
		return greeting;
	}	
}
