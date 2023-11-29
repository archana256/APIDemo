package pojo;


public class SubjectDetails {

	private String name;
	private boolean is_active;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	
	@Override
	public String toString() {
//		return "{ 'name': " + this.name + ", 'is_active': " + this.is_active + " }";
		return "{\"name\":\""+ this.name + "\",\"is_active\":" + this.is_active  + "}";
	}
}
