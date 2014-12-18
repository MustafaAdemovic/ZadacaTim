/**
 * Klasa Player naslijeđuje klasu Person u kojoj već imamo ime i prezime i u
 * ovoj klasi Player još dodajemo broj tako da imamo igrača
 * 
 * @author mustafaademovic
 *
 */
public class Player extends Person {
	private int number;

	// konstruktor
	public Player(String name, String surname, int number) {
		super(name, surname);
		this.number = number;

	}

	// Getter
	public int getNumber() {
		return number;
	}

	// Setter
	public void setNumber(int number) {
		this.number = number;
	}

	/*
	 * Metoda prima iz klase Person osobine Ime i Prezime i dodaje broj i to sve
	 * skupa ispisuje
	 */
	@Override
	public String toString() {
		return "Player: " + super.toString() + "\nNumber:" + number;
	}

}// Kraj klase Player
