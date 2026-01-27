package uno;

/**
 * Class for Wild cards.
 */
public class WildCard implements Card {

	@Override
	public String getName() {
		return "Wild";
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
