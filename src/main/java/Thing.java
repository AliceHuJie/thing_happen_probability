public class Thing {
    private double probability;

    public Thing(double probability) {
        this.probability = probability;
    }

    public double getHappenProbability(int totalTimes, int happenTimes) {
        if (happenTimes > totalTimes) {
            return 0;
        }
        double combinations = getFactorial(totalTimes) / (getFactorial(totalTimes - happenTimes));
        return combinations * Math.pow(probability, happenTimes) * Math.pow(1 - probability, totalTimes - happenTimes);
    }

    private int getFactorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }
}
