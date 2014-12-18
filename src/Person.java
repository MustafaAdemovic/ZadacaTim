/**
 * Klasa Person ima zadatak da ispiše ime i prezime
 * 
 * @author mustafaademovic
 *
 */
public class Person {

	private String name;
	private String surname;

	// konstruktor
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	// Getter
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Metoda toString ispisuje Ime i Prezime
	 */
	public String toString() {
		return "\nName: " + name + "\nSurname: " + surname;
	}

}// Kraj klase person
