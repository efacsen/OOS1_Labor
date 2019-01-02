import java.util.Date;

public class BasicPlane {
	private String icao;
	private Coordinate[] coordinate;
	private Date[] posTime;
	private int index = 9;

	public String setIcao(String icao) {
		this.icao = icao;
		return this.icao;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.index = 0;
		this.coordinate[index] = coordinate;
	}

	public void setPosTime(Date posTime) {
		this.index = 0;
		this.posTime[index] = posTime;
	}

	public Date[] getPosTime() {
//		this.index = 0;
		return this.posTime;
	}

	String getIcao() {
		return this.icao;
	}

	Coordinate[] getCoordinate() {
		return this.coordinate;
	}

	BasicPlane(String icao, Coordinate coordinate, Date posTime) {
		this.icao = icao;
		this.coordinate = new Coordinate[10];
		this.posTime = new Date[10];
		this.index = 0;

		this.coordinate[index] = coordinate;
		this.posTime[index] = posTime;


	}

	void addTimeAndPosition(Date posTime, Coordinate coordinate) {
		for (int i = 0; i < this.coordinate.length; i++) {
			for (int j = 0; j < this.posTime.length; j++) {
				if (this.posTime[j] == null) {
					this.posTime[j] = posTime;
				}
			}
			if (this.coordinate[i] == null) {
				this.coordinate[i] = coordinate;
			}

		}

	}


	@Override
	public String toString() {
		System.out.println(
				"ICAO\t: " + icao + "\n--------------------------------------------------------------------------"
						+ "\n\tPosition Time\t\t\t\tCoordinate\t\t\t");

		for (int counter = 0; counter < posTime.length; counter++) {
			System.out.println(posTime[counter] + "\t\t" + coordinate[counter]);
		}
		System.out.println("--------------------------------------------------------------------------");

		return "";

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicPlane other = (BasicPlane) obj;
		if (coordinate == null) {
			if (other.coordinate != null)
				return false;
		} else if (!coordinate.equals(other.coordinate))
			return false;
		if (icao == null) {
			if (other.icao != null)
				return false;
		} else if (!icao.equals(other.icao))
			return false;
		if (posTime == null) {
			if (other.posTime != null)
				return false;
		} else if (!posTime.equals(other.posTime))
			return false;
		return true;
	}
}
