package ProjectHomeWork;

public class SecondExampleApp {

	public static void main(String[] args) {
		Circle bigCircle = new Circle(11,0,100);
		Circle smallCircle = new Circle(0,-10,10);
        
	    bigCircle.print();
	    smallCircle.print();
	}

}
class Circle {
	int cx;
	int cy;
	int radius;
	boolean valid;
	
	// constructor
	Circle(int pcx, int pcy, int pr) {
		
		cx = pcx;
		cy = pcy;
		if( pr >= 0) {
		   radius = pr;
		   valid = true;
		} else {
			System.out.println( "NEGATIVE RADIUS VALUE!");
			valid = false;
		}
	}
	// print logic
	void print() {
		if( valid ) {
		System.out.println(
				"########### CIRCLE ##########\n" +
		        "RADIUS: " + radius + "\n"        +
				"center: " + cx + "," + cy + "\n" +
				"area: " + calculateArea() + "\n" +
				"#############################\n"
				);
		} else {
		System.out.println(
				"########### CIRCLE BROKEN!!! ##########\n"
				);	
		}
	}
	// calculate area -> return float
    float calculateArea() {
    	if( valid) {
    	float area = (float)(radius * radius * Math.PI);
    	    return (float)area;
    	} else {
    		return -1;
    	}
    }
    
}

