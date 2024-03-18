@Entity
public class User {
	@Column
	String lastName;
	@Column
	String firstName;
	@Column
	String email;
	@Column
	Decimal soldeJetons;
	@Column
	String email;
	@Column
	String password;
	public void login();
	public void consulterPari();
	public void consulterEvent();
	public void placerPari();
	public void rechargerJetons();
}

