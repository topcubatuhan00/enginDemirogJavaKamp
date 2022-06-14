
public class StudentManager extends UserManager{
	
	private Student user;
	
	public StudentManager(Student user) {
		super.login(user);
		this.user = user;
	}
	
	public void registerInCourse() {
		System.out.println(user.name + " registered in " + user.courseName);
	}
	public void deleteInCourse() {
		System.out.println(user.name + " deleted in " + user.courseName);
	}
	
}
