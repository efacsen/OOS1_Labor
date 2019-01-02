import java.util.ArrayList;
import java.util.Date;

public class BasicPlane {
	private String icao;
	private ArrayList<Coordinate> coordinate;
	private ArrayList<Date> posTime;

	public String setIcao(String icao) {
		this.icao = icao;
		return this.icao;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate.add(coordinate);
	}

	public void setPosTime(Date posTime) {
		this.posTime.add(posTime);
	}

	public String getIcao() {
		return this.icao;
	}

	public ArrayList<Coordinate> getCoordinate() {
		return this.coordinate;
	}

	public ArrayList<Date> getPosTime() {
		return this.posTime;
	}

	BasicPlane(String icao, Coordinate coordinate, Date posTime) {
		this.icao = icao;
		this.coordinate = new ArrayList<Coordinate>();
		this.posTime = new ArrayList<Date>();

		this.coordinate.add(coordinate);
		this.posTime.add(posTime);

	}

	void addTimeAndPosition(Date posTime, Coordinate coordinate) {
		this.posTime.add(posTime);
		this.coordinate.add(coordinate);
	}

	@Override
	public String toString() {
		System.out.println(
				"ICAO\t: " + icao + "\n--------------------------------------------------------------------------"
						+ "\n\tPosition Time\t\t\t\tCoordinate\t\t\t");
		for (int counter = 0; counter < posTime.size(); counter++) {
			System.out.println(posTime.get(counter).toString() + "\t\t" + coordinate.get(counter).toString());
		}
		System.out.println("--------------------------------------------------------------------------");
		return "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coordinate == null) ? 0 : coordinate.hashCode());
		result = prime * result + ((icao == null) ? 0 : icao.hashCode());
		result = prime * result + ((posTime == null) ? 0 : posTime.hashCode());
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
