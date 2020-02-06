public abstract class Card {
    private String name;
    private boolean isFlipped;

    public Card(String name) {
        this.name = name;
        isFlipped = false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void flip() {
        isFlipped = true;
    }

    public boolean isFlipped() {
        return isFlipped;
    }
}