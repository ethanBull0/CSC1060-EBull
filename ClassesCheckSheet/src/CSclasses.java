import java.util.ArrayList;

public class CSclasses {
	
	public static void main(String[] args) {
		ArrayList<Course> courses = new ArrayList<>();
		Course CSC1060 = new Course();
		CSC1060.setCredits(4);
		
		Course[] courseList = new Course[6];
		courseList[0] = CSC1060;
		courseList[1] = new Course("", 0,0,0);
		courseList[1].setCourseNumber("ENG1020"); //changes all instances of CSC1060's courseNumber to ENG1020
		courseList[1].setCredits(3);
		courseList[1].setNumStudents(43);
		courseList[2] = CSC1060;
		courseList[3] = CSC1060;
		courseList[4] = new Course("CSC1111", 15, 25, 5);
		courseList[5] = new Course("CSC2222", 10, 22, 3);
		 /*for (Course c : courseList) {
			System.out.println(c.getCourseNumber());
			System.out.println(c.getCredits());
			System.out.println(c.getNumStudents());
			System.out.println(c.getMaxStudents());
			System.out.println(c.getClass());
		} 
		for (int i = 0; i < courseList.length; i++) {
			System.out.println(courseList[i].getCourseNumber());
		} */
		
		RealTimeRemoteCourse realTime = new RealTimeRemoteCourse();
		String[] zInfo = {"2:15PM", "www.zoom.com"};
		realTime.setZoomInfo(zInfo);
		courses.add(realTime);
		
		System.out.println(realTime);
		
		InPersonCourse inPerson1 = new InPersonCourse("ENG1022", 19, 30, 3, "BP", 122);
		System.out.println(inPerson1);
		
		FullRemoteCourse fullRemote1 = new FullRemoteCourse("MAT1061", 40, 80, 4, "mathteacher@gmail.com");
		System.out.println(fullRemote1);
		
	}

}
