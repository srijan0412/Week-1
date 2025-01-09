class DividePen {
	public static void main(String[] args) {
		
		//Total number of pens and Total number of students
		int totalPens = 14, totalStudents = 3;
		
		//Calculation of pens that are equally distributed 
		int pensPerStudent = totalPens / totalStudents;
		
		//Calculation of pens that are remaining
		int pensRemaining = totalPens % totalStudents;
		
		System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + pensRemaining);
		
	}
}