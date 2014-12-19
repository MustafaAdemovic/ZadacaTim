/**
 * U klasi Ratings se nalaze ocjene igrača(speed, shot, addition, headShot) koje
 * mogu biti u rangu od 0 do 99
 * 
 * @author mustafaademovic
 *
 */
public class Ratings {
	protected double speed;
	protected double shot;
	protected double addition;
	protected double headShot;

	// Konstruktori
	public Ratings(double speed, double shot, double addition, double headShot) {
		this.speed = speed;
		this.shot = shot;
		this.addition = addition;
		this.headShot = headShot;
	}// Kraj konstruktora

	// Getteri
	/**
	 * getSumRatings vraća zbir svih ocijena
	 * 
	 * @return sumRating
	 */
	public double getSumRatings() {
		double sumRatings;
		sumRatings = this.speed + this.shot + this.addition + this.headShot;
		return sumRatings;
	}// Kraj getSumRatings

	public double getSpeed() {
		return speed;
	}// Kraj getSpeed

	public double getShot() {
		return shot;
	}// Kraj getShot

	public double getAddition() {
		return addition;
	}// Kraj getAddition

	public double getHeadShot() {
		return headShot;
	}// Kraj getHeadShot

	// Setteri
	public void setSpeed(double speed) {
		if (speed < 0 || speed > 100) {
			throw new IllegalArgumentException(
					"Ratings of speed are not in rang from 0 to 100 ");
		}
		this.speed = speed;
	}// Kraj setSpeed

	public void setShot(double shot) {
		if (shot < 0 || shot > 100) {
			throw new IllegalArgumentException(
					"Ratings of shot are not in rang from 0 to 100 ");
		}
		this.shot = shot;
	}// Kraj setShot

	public void setAddition(double addition) {
		if (addition < 0 || addition > 100) {
			throw new IllegalArgumentException(
					"Ratings of addition are not in rang form 0 to 100 ");
		}
		this.addition = addition;
	}// Kraj setAddition

	public void setHeadShot(double headShot) {
		if (headShot < 0 || headShot > 100) {
			throw new IllegalArgumentException(
					"Reatings of head shot are not in rang form 0 to 100");
		}
		this.headShot = headShot;
	}// Kraj setHeadShot

	/**
	 * Metoda equals provjerava jesu li stvarne vrijednosti(speed(brzina),
	 * shot(šut), additon(dodavanje) i headShot(šut glavom) jednke njihovim
	 * kopijama, ako jesu vraća true(istina) ako nisu vraća false(netačno)
	 * 
	 * @param other (kopije stvarnih vrijednosti)
	 * @return False or true(Ako su svi isti vraća true, ako nisu vraća false)
	 */
	public boolean equals(Ratings other) {
		if (this.speed == other.speed && this.shot == other.shot
				&& this.addition == other.addition
				&& this.headShot == other.headShot) {
			return true;
		} else {
			return false;
		}

	}// Kraj metode equals

	/**
	 * Metodu toString koristimo da bi, kada korisnik pozove ovu metodu ona
	 * ispisala objekt s podacima o ocjenama
	 */
	public String toString() {
		String str = "";
		str = "SpeedRatings: " + speed + "\nShotRatings: " + shot
				+ "\nAdditionRatings: " + addition + "\nHeadShotRatings: "
				+ headShot;
		return str;
	}

}// Kraj klase Ratings(ocjene)
