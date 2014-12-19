/**
 * Klasa Player ima zadatak da napravi igrača(ime, prezime, broj i ocjene tog igrača)ž
 * Ocjene smo napravili u drugoj klasi koju smo nazvali Ratings i dodijeljujemo ih klasi Player.
 * @author mustafaademovic
 *
 */
public class Player {
	protected String name;
	protected String surname;
	protected int number;
	protected Ratings playerRatings;

	// konstruktor

	public Player(String name, String surname, int number, Ratings playerRatings) {
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.playerRatings = playerRatings;
	}

	/* Konstruktor kopije jer će nam za svaki tim trebati min. 11 igrača */
	public Player(Player other) {
		this.name = other.name;
		this.surname = other.surname;
		this.number = other.number;
		this.playerRatings = other.playerRatings;

	}

	public Player(String name, String surname, int number, double speed,
			double shot, double addition, double headShot) {
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.playerRatings = new Ratings(speed, shot, addition, headShot);

	}

	// Getter
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getNumber() {
		return number;
	}

	public Ratings getPlayerRatings() {
		return playerRatings;
	}

	// Setter

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setPlayerRatings(Ratings playerRatings) {
		this.playerRatings = playerRatings;
	}

	/**
	 * Klasu toString kada pozove korisnik nad nekim objektom, ona treba da
	 * ispiše ove karakteristike igrača
	 * 
	 * @return
	 */
	public String toString() {
		return "Player:\nName:" + name + "\nSurname: " + surname + "\nNumber:"
				+ number + "\n\nPlayerRatings:\n" + playerRatings.toString();
	}

	/**
	 * Klasa equals provjerava jesu li stvarne vrijednosti i kopije iste ako
	 * jesu vraca true ako nisu vraca false
	 * 
	 * @param other
	 * @return true or false
	 */
	public boolean equals(Player other) {
		if (this.name.equals(name) && this.surname.equals(surname)
				&& this.number == other.number
				&& this.playerRatings.equals(playerRatings)) {
			return true;
		} else {
			return false;
		}
	}

}// Kraj klase Player
