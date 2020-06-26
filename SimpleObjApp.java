package ProjectHomeWork;

public class SimpleObjApp {

	public static void main(String[] args) {
		Student goodStudent = new Student();
		goodStudent.setProperties(9.0f, (byte)4, true);
		Student badStudent = new Student();
		badStudent.setProperties(5.0f, (byte)2, false);
		
		
	}

}
/////////////////////////////////////////////////////
class Student {
	// dynamic properties - abstraction - state 
	float avgMark;
	byte grade;
	boolean approved;
	
	// dynamic methods - behavior 
	void setProperties(float am, byte g, boolean ap) {
		 //if/else - validation
		//Max mark 10.0f
		if(am >= 1.0f && am <= 10.0f) {
		avgMark = am;
		} else {
			System.out.println("Worning !!! , check the mark value!!!");
		}
		//Max grade 5
		if(g >=1 && g <= 5) {
		grade   = g;
		sayAbout();
		} else {
			System.out.println("Worning !!! , check the grade value" );
			System.out.println();
		}
		//Yes/No
		approved = ap;
	}
	void sayAbout() {
		System.out.println( "I am a student!!");
		System.out.println( "I am in the " + grade + " grade!");
		// if/else (5 levels) marks.
		if( avgMark == 10.0f) {
			System.out.println( "I am a brilliant student!");
		} else if( avgMark >= 9.0f) {
			System.out.println( "I am a very good student!");
		} else if( avgMark >= 7.0f) {
			System.out.println( "I am a good student!");
		} else if( avgMark >= 5.0f) {
			System.out.println( "I am a normal student!");
		} else if( avgMark >= 3.0f) {
			System.out.println( "I am bad student!");
		} else if( avgMark == 1.0f) {
			System.out.println( "i am very bad student!");
		}
		System.out.println();
	}
}