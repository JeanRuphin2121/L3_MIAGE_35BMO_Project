@Entity
public class SportEvent {
	@Column
	String eventName;
	@Column
	DateTime eventDateAndTime;
	@Column
	String homeTeam;
	@Column
	String awayTeam;
	public void addEvent();
	public void updateOdds();
}

