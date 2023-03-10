package TicketingSystem;

public class Passenger {
	private int ticket_id;
	private String passenger_name;
	private String source;
	private String destination;
	private int kilometre;

	public Passenger(int ticket_id, String passenger_name, String source, String destination, int kilometre) {
		super();
		this.ticket_id = ticket_id;
		this.passenger_name = passenger_name;
		this.source = source;
		this.destination = destination;
		this.kilometre = kilometre;

	}
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getKilometre() {
		return kilometre;
	}
	public void setKilometre(int kilometre) {
		this.kilometre = kilometre;
	}
	
	@Override
	public String toString() {
		return "Passenger [ticket_id=" + ticket_id + ", passenger_name=" + passenger_name + ", source=" + source
				+ ", destination=" + destination + ", kilometre=" + kilometre + "]";
	}
}
