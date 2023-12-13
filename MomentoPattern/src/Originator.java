public class Originator {
    private int height;
    private int weight;

    public Originator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public Momento createMomento() {
        return new Momento(height,weight);
    }

    public void restoreMomento(Momento momento) {
        this.height = momento.getHeight();
        this.weight = momento.getWeight();
    }
}
