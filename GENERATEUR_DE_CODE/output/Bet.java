@Entity
public class Bet {
	@Column
	BetType betType;
	@Column
	decimal betOdd;
	@Column
	float amount;
}

