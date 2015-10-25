package letcode;

public class NameTime {
	String name;
	int time;
	
	public NameTime(){
		
	}
	
	public NameTime(String name, int time){
		this.name = name;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public boolean equals(Object o){
		 // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof NameTime)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members 
        NameTime c = (NameTime) o;
         
        // Compare the data members and return accordingly 
        return this.getName().equals(c.getName());
	}
	
}
