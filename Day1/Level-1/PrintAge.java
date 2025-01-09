class PrintAge {
	public static void main(String[] args){
		
		//Name of the Person
		String name = "Harry";
		
		//Person's Birth Year and Current Year
		int birthYear = 2000, currentYear = 2024;
		
		//Age of the Person
		int age = (currentYear - birthYear);
		
		System.out.println(name + "'s age in " + currentYear + " is " + age);
		
	}
}