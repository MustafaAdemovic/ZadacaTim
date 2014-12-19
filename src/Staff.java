/**
 * Klasa Staff kreira osoblje koje obavljaju razne funkcije u klubu(trener,
 * doktori i sl).Klasa Staff naslijeđuje klasu person u kojoj vec imamo ime i
 * prezime i dodajemo još kontakt(mail) i funkciju koju ta osoba obavlja u
 * klubu(
 * 
 * @author mustafaademovic
 *
 */
public class Staff {
	protected String name;
	protected String surname;
	protected String mail;
	protected String function;

	// Konstruktor
	public Staff(String name, String surname, String mail, String function) {
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.function = function;

	}
	
	// Ovaj konstruktor je kopija jer imam više ljudi s ovim osobinama koji rade
	// u klubu
	public Staff(Staff other) {
		this.name = other.name;
		this.surname = other.surname;
		this.mail = other.mail;
		this.function = other.function;
	}

	// Getter
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getMail() {
		return mail;
	}

	public String getFunction() {
		return function;
	}

	// Setter
	public void setName(String name){
		this.name = name;
	}
	public void setSurname(String surname){
		this.surname = surname;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setFunction(String function){
		this.function = function;
	}

	/**
	 * Metoda treba kada je korisnik pozove da ispiše opbjekat u kojem pozivamo
	 * ove osobine(ime, prezime, mail, funkciju)
	 * 
	 * @return
	 */
	public String toString() {
		return "\nStaff:\nName: " + name + "\nSurname: " + surname + "\nMail: "
				+ mail + "\nFunction: " + function;
	}//Kraj metode toString
	
	

}//Kraj klase Staff
