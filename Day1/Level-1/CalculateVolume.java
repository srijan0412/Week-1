class CalculateVolume {
	public static void main(String[] args) {
	
		//Difining constant PI 
		double PI = 22.0 / 7.0;
		
		//Difining Radius of Earth
		int radius = 6378;
		
		//Calculation and defination of volume 
		double volumeInKm = (4.0/3.0) * PI * radius * radius * radius;
		double volumeInMiles = volumeInKm * 0.62; // 1km = 0.62miles
		
		System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles);
		
	}
}