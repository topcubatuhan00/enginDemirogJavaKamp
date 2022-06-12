package lessonTwoHomeworks;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();
		CourseManager courseManager = new CourseManager();
		
		Course javaCourse = new Course(
				1,
				"Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)",
				"2 ay surecek Yazilim Gelistirici Yetistirme Kampi"
		);
		
		Course cSharpCourse = new Course(
				2,
				"Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)",
				"2 ay surecek Yazilim Gelistirici Yetistirme Kampi"
		);
		
		User user1 = new User(1, "Batuhan", "Topcu");
		User user2 = new User(2, "Kullanici", "-2");
		userManager.signUp(user1);
		userManager.signUp(user2);
		
		courseManager.registerCourse(javaCourse, user1);
		courseManager.registerCourse(cSharpCourse, user2);
	}

}
