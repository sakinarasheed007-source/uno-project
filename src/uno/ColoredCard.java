package uno;

/**
 * Abstract class for colored cards, inherited both by numbered cards and
 * colored action cards.
 */
public abstract class ColoredCard implements Card {
	
	/**
	 * Enum listing possible colors.
	 */
	public enum Color {
		RED,
		YELLOW,
		GREEN,
		BLUE;
		
		/**
		 * Accessor for nicely formatted color name.
		 * @return name of color starting with upper case letter
		 */
		public String getName() {
			return name().toUpperCase().charAt(0) + name().substring(1).toLowerCase();
		}
	}
	
	private final Color color;
	
	/**
	 * Constructor for {@code ColoredCard}.
	 * @param color color of the card
	 */
	public ColoredCard(Color color) {
		this.color = color;
	}
	
	/**
	 * Accessor for color of the card.
	 * @return color
	 */
	public Color getColor() {
		return color;
	}	

	@Override
	public String toString() {
		return getName();
	}
}
