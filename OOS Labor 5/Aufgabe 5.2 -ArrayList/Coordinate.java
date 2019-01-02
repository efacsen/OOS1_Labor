public class Coordinate {

	private double latitude;
	private double longitude;

	public double setLatitude(double tempLatitude) {
		this.latitude = tempLatitude;
		return this.latitude;
	}

	double getLatitude() {
		if (this.latitude > 90 || this.latitude < -90) {
//			Checking...
//			System.out.println("Inputing number that are >90 or <-90 ....");
			double tempConvert = this.latitude % 90;
//			Checking...
//			System.out.println("Your Latitude is converted to " + tempConvert);
			return tempConvert;
		} else {
//			Checking...
//			System.out.println("Inputing number ....");
//			System.out.println("Your Latitude is: " + this.latitude);
			return this.latitude;
		}
	}

	public double setLongitude(double tempLongitude) {
		this.longitude = tempLongitude;
		return this.longitude;
	}

	double getLongitude() {
		if (this.longitude > 180 || this.longitude < -180) {
//			Checking...
//			System.out.println("Inputing number that are >180 or <-180 ....");
			double tempConvert = this.longitude % 180;
//			Checking...
//			System.out.println("Your Longitude is converted to " + tempConvert);
			return tempConvert;
		} else {
//			Checking...
//			System.out.println("Inputing number ....");
//			System.out.println("Your Longitude is: " + this.longitude);
			return this.longitude;
		}
	}

	Coordinate(double tempLat, double tempLon) {
		this.latitude = tempLat;
		this.longitude = tempLon;

		this.getLatitude();
		this.getLongitude();
	}

	Coordinate() {
		this.getLatitude();
		this.getLongitude();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(latitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s %s",
				((this.getLatitude() <= 0) ? this.getLatitude() * -1 + "° S," : this.getLatitude() + "° N,"),
				((this.getLongitude() <= 0) ? this.getLongitude() * -1 + "° W" : this.getLongitude() + "° E"));
	}
}
