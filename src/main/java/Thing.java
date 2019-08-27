public class Thing {
    private double probability;

    public Thing(double probability) {
        this.probability = probability;
    }

    public double getProbability() {
        return probability;
    }

    public Thing and(Thing other) {
        double newProbability = this.probability * other.probability;
        return new Thing(newProbability);
    }

    public Thing not() {
        return new Thing(1 - probability);
    }

    public Thing or(Thing other){
        return (this.not().and(other.not())).not();
    }

    public static void main(String[] args) {
        System.out.println(new Thing(0.2).not().and(new Thing(0.6)).getProbability());
    }
}
