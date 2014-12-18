/**
 * Klasa Staff kreira osoblje koje obavljaju razne funkcije u klubu(trener,
 * doktori i sl).Klasa Staff naslijeđuje klasu person u kojoj vec imamo ime i
 * prezime i dodajemo još kontakt(mail) i funkciju koju ta osoba obavlja u
 * klubu(
 * 
 * @author mustafaademovic
 *
 */
public class Staff extends Person {
	private String mail;
	private String function;

	// Konstruktor
	public Staff(String name, String surname, String mail, String function) {
		super(name, surname);
		this.mail = mail;
		this.function = function;

	}

	// Getter
	public String getMail() {
		return mail;
	}

	// Setter
	public void setMail(String mail) {
		this.mail = mail;
	}

	/*
	 * Metoda prima iz klase Person osobine Ime i Prezime i dodaje kontakt(mail)
	 * i funkciju i ispisuje sve skupa
	 */
	@Override
	public String toString() {
		return "\nStaff:" + super.toString() + "\nMail: " + mail
				+ "\nFunction: " + function;
	}

}
