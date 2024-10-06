package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name = "BusInfo")
public class Bus {

	@Id
	@Column(name = "BusID")
	private int BusId;

	@Column(name = "StartingPoint")
	private String Starting;

	@Column(name = "DestinationPoint")
	private String destination;

	
	public Bus(int busId, String starting, String destination) {
		super();
		BusId = busId;
		Starting = starting;
		this.destination = destination;
	}

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBusId() {
		return BusId;
	}

	public void setBusId(int busId) {
		BusId = busId;
	}

	public String getStarting() {
		return Starting;
	}

	public void setStarting(String starting) {
		Starting = starting;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
